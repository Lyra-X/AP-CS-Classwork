package com.company;
//this game was written by following a tutorial on csdn blog.
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tetrist extends JPanel{

    private Tetromino nextone;

    private Tetromino tetromino;

    private static final int ROWS = 20;
    private static final int COLS = 10;

    private int score = 0;
    private int lines = 0;
    private int level = 5;

    private Cell[][] wall = new Cell[ROWS][COLS];
    private boolean STATE = true;
    private int BGI = 0;
    public static final int CELL_SIZE = 26;
    public static BufferedImage S;
    public static BufferedImage J;
    public static BufferedImage O;
    public static BufferedImage I;
    public static BufferedImage T;
    public static BufferedImage[] bgi = new BufferedImage[4];
    public static BufferedImage pause;
    public static BufferedImage tetris;
    public static BufferedImage gameover;
    static {
        try {
            S = ImageIO.read(Tetrist.class.getResource("S.png"));
            J = ImageIO.read(Tetrist.class.getResource("J.png"));
            T = ImageIO.read(Tetrist.class.getResource("T.png"));
            O = ImageIO.read(Tetrist.class.getResource("O.png"));
            I = ImageIO.read(Tetrist.class.getResource("I.png"));
            pause = ImageIO.read(Tetrist.class.getResource("pause.png"));
            tetris = ImageIO.read(Tetrist.class.getResource("tetris1.png"));
            gameover = ImageIO.read(Tetrist.class.getResource("gameover.png"));
            for(int i = 0; i < bgi.length; i++) {
                String name = "img0"+i+".jpg";
                bgi[i] = ImageIO.read(Tetrist.class.getResource(name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void action() {
        tetromino = Tetromino.generator();
        nextone = Tetromino.generator();

        KeyListener kl = new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int k = e.getKeyCode();
                keyMoveAction(k);
                repaint();
            }
        };
        this.addKeyListener(kl);
        this.setFocusable(true);
        this.requestFocus();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int moveIndex = 0;
            int bgiIndex = 0;
            int speed = 5*level;
            @Override
            public void run() {
                if (STATE) {
                    if (moveIndex % speed == 0) {
                        moveDownAction();
                        moveIndex = 0;
                    }
                }
                moveIndex++;
                bgiIndex++;
                repaint();
            }
        };
        timer.schedule(task, 10, 20);
    }

    public void keyMoveAction(int k) {
        switch (k) {
            case KeyEvent.VK_RIGHT:moveRightAction();break;
            case KeyEvent.VK_LEFT:moveLeftAction();break;
            case KeyEvent.VK_DOWN:moveDownAction();break;
            case KeyEvent.VK_UP:rotateCellAction();break;
            case KeyEvent.VK_I:moveInitAction();break;
            case KeyEvent.VK_P:STATE = false;break;
            case KeyEvent.VK_C:STATE = true;break;
            case KeyEvent.VK_E:System.exit(0);break;

        }
    }

    public void moveInitAction() {
        STATE = false;
        wall = new Cell[ROWS][COLS];
        tetromino = Tetromino.generator();
        nextone = Tetromino.generator();
        score = 0;
        lines = 0;
        level = 0;
    }

    public void rotateCellAction() {
        Cell[] nCells = tetromino.rotate();
        if (nCells == null) return;
        for (int i = 0; i < nCells.length; i++) {
            int nRow = nCells[i].getRow();
            int nCol = nCells[i].getCol();
            if (nRow < 0 || nRow >= ROWS || nCol < 0 || nCol >= COLS || wall[nRow][nCol] != null) return;
        }
        tetromino.cells = nCells;
    }

    public void moveLeftAction() {
        if (canLeftMove()&&!isBottom()) {
            tetromino.moveL();
        }
    }

    public void moveRightAction() {
        if (canRightMove()&&!isBottom()) {
            tetromino.moveR();
        }
    }

    public void moveDownAction() {
        if (tetromino == null) return;
        if (!isBottom()) {
            tetromino.moveD();
        }

    }

    public void removeLine() {
        boolean flag = true;
        int rowStart = 20;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (wall[row][col] == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int col = 0; col < COLS; col++) {
                    wall[row][col] = null;
                }
                rowStart = row;
                score += 10;
                lines += 1;
                level = lines%10 == 0?level == 1?level:level-1:level;
                for (int row1 = rowStart; row1 > 0; row1--) {
                    for (int col1 = 0; col1 < COLS; col1++) {
                        wall[row1][col1] = wall[row1-1][col1];
                    }
                }
            }else {
                flag = true;
            }
        }
    }
    public boolean isBottom() {
        if (tetromino == null) return false;
        Cell[] cells = tetromino.cells;
        for (int i = 0; i < cells.length; i++) {
            Cell c = cells[i];
            int col = c.getCol();
            int row = c.getRow();
            if ((row+1) == ROWS || wall[row+1][col] != null) {
                for(int j = 0; j < cells.length; j++) {
                    Cell cell = cells[j];
                    int col1 = cell.getCol();
                    int row1 = cell.getRow();
                    wall[row1][col1] = cell;
                }
                removeLine();
                BGI = (BGI == 3)?0:BGI+1;
                tetromino = nextone;
                nextone = Tetromino.generator();
                return true;
            }
        }
        return false;
    }
    public boolean canRightMove() {
        if (tetromino == null) return false;
        Cell[] cells = tetromino.cells;
        for (int i = 0; i < cells.length; i++) {
            Cell c = cells[i];
            int row = c.getRow();
            int col = c.getCol();
            if ((col+1) == COLS || wall[row][col+1] != null) return false;
        }
        return true;
    }

    public boolean canLeftMove() {
        if (tetromino == null) return false;
        Cell[] cells = tetromino.cells;
        for (int i = 0; i < cells.length; i++) {
            Cell c = cells[i];
            int row = c.getRow();
            int col = c.getCol();
            if (col == 0 || wall[row][col-1] != null) return false;
        }
        return true;
    }

    public void paint(Graphics g) {

        g.drawImage(bgi[BGI], 0, 0, null);
        g.drawImage(tetris, 0, 0, null);
        g.translate(15, 15);


        paintWall(g);
        paintTetromino(g);
        paintNextone(g);
        paintTabs(g);
        paintGamePause(g);
        paintGameOver(g);
    }

    public boolean isGameOver() {
        for(int col = 0; col < COLS; col++) {
            if (wall[0][col] != null)return true;
        }
        return false;
    }

    public void paintGameOver(Graphics g) {
        if (isGameOver()) {
            tetromino = null;
            g.drawImage(gameover, -15, -15, null);
            Color color = new Color(0,71,157);
            g.setColor(color);
            Font font = new Font(Font.SERIF,Font.BOLD,30);
            g.setFont(font);
            g.drawString(""+score, 260, 207);
            g.drawString(""+lines, 260, 253);
            g.drawString(""+level, 260, 300);
            STATE = false;
        }
    }

    public void paintGamePause(Graphics g){
        if (!STATE && !isGameOver()) {
            g.drawImage(pause, -15, -15, null);
        }
    }

    public void paintTabs(Graphics g) {
        int x = 410;
        int y = 160;
        Color color = new Color(240,234,34);
        g.setColor(color);
        Font f = new Font(Font.SERIF,Font.BOLD,30);
        g.setFont(f);
        g.drawString(""+score, x, y);
        y+=56;
        g.drawString(""+lines, x, y);
        y+=56;
        g.drawString(""+level, x, y);
    }

    public void paintNextone(Graphics g) {
        if (nextone == null)return;
        Cell[] cells = nextone.cells;
        for(int i = 0; i < cells.length; i++){
            Cell c = cells[i];
            int row = c.getRow() ;
            int col = c.getCol() + 9;
            int x = col * CELL_SIZE;
            int y = row * CELL_SIZE;
            g.drawImage(c.getImg(), x, y, null);
        }
    }

    public void paintTetromino(Graphics g) {
        if(tetromino == null)return;
        Cell[] cells = tetromino.cells;
        for(int i=0; i < cells.length; i++){
            Cell c = cells[i];
            int col = c.getCol();
            int row = c.getRow();
            int x = col * CELL_SIZE;
            int y = row * CELL_SIZE;
            g.drawImage(c.getImg(), x, y, null);
        }
    }

    /**
     * ��ǽ
     * @param g
     */
    public void paintWall(Graphics g) {
        for(int row = 0; row < ROWS; row++) {
            for(int col = 0; col < COLS; col++) {
                Cell cell = wall[row][col];
                int rows = row * CELL_SIZE;
                int cols = col * CELL_SIZE;
                //g.drawImage(O, rows, cols, null);
                if (cell == null) {
                    //System.out.println(0);
                }else{
                    g.drawImage(cell.getImg(), cols, rows, null);
                }
            }
        }
    }

    public static void startTetris() {
        JFrame frame = new JFrame();

        Tetrist tetrist = new Tetrist();

        frame.add(tetrist);
        frame.setSize(525, 600);
        frame.setLocationRelativeTo(null);
        //frame.setUndecorated(true);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        tetrist.action();
    }

}