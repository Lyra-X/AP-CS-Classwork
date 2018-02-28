package com.company;

import java.util.Random;

public class Tetromino extends Cell {
    public Cell[] cells = new Cell[4];

    //tetromino-moving operations
    public void moveD() {
        for (int i = 1; i <= 4; ++i) Cell[i].moveD;
    }

    public void moveL() {
        for (int i = 1; i <= 4; ++i) Cell[i].moveL;
    }

    ;

    public void moveR() {
        for (int i = 1; i <= 4; ++i) Cell[i].moveR;
    }

    ;

    public Cell[] rotate() {
        Cell[] iCells = new Cell[4];
        int fcordx, fcordy;//final coordinators
        int orgx = this.cells[2].getRow();
        int orgy = this.cells[2].getCol();//origin coordinators
        for (int i = 1; i <= 4; ++i) {
            fcordx = orgx + (getCol(cells[i]) - orgy);
            fcordy = orgy - (getRow(cells[i]) - orgx);
            iCells[i] = new Cell(fcordx, fcordy, this.cells[i].getImg());
        }
        return iCells;
    }

    public static Tetromino generator() {
        Random random = new Random();
        int type = random.nextInt(5);
        switch (type) {
            case 0:
                return new O();
            case 1:
                return new I();
            case 2:
                return new S();
            case 3:
                return new T();
            case 4:
                return new J();
        }
    }
}
//tetrominos with different shape
class I extends Tetromino {
    public I() {
        cells[0] = new Cell(0, 5, Tetrist.I);
        cells[1] = new Cell(1, 5, Tetrist.I);
        cells[2] = new Cell(2, 5, Tetrist.I);
        cells[3] = new Cell(3, 5, Tetrist.I);
    }
}
class J extends Tetromino {
    public J()
    {
        cells[0] = new Cell(2, 5, Tetrist.J);
        cells[1] = new Cell(0, 6, Tetrist.J);
        cells[2] = new Cell(2, 6, Tetrist.J);
        cells[3] = new Cell(1, 6, Tetrist.J);
    }
}
class O extends Tetromino {
    public O()
    {
        cells[0] = new Cell(0, 5, Tetrist.O);
        cells[1] = new Cell(0, 6, Tetrist.O);
        cells[2] = new Cell(1, 5, Tetrist.O);
        cells[3] = new Cell(1, 6, Tetrist.O);
    }
}
class T extends Tetromino {
    public T()
    {
        cells[0] = new Cell(0, 4, Tetrist.T);
        cells[1] = new Cell(0, 6, Tetrist.T);
        cells[2] = new Cell(0, 5, Tetrist.T);
        cells[3] = new Cell(1, 5, Tetrist.T);
    }
}
class S extends Tetromino {
    public S()
    {
        cells[0] = new Cell(1, 4, Tetrist.S);
        cells[1] = new Cell(1, 5, Tetrist.S);
        cells[2] = new Cell(0, 5, Tetrist.S);
        cells[3] = new Cell(0, 6, Tetrist.S);
    }
}