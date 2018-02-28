package com.company;

import java.awt.image.BufferedImage;

public class Cell {
        public int row;
        public int col;
        public BufferedImage img;

        //basic operations
        public int getRow() { return row; }//x-coordinator
        public int getCol() { return col; }//y-coordinator
        public void setRow() { this.row=row;}
        public void setCol() { this.col=col;}
        public BufferedImage getImg() { return img; }
        public void setImg(BufferedImage img) { this.img = img; }

        //cell-moving operations
        public void moveD() {row++;}
        public void moveL() {col--;}
        public void moveR() {col++;}
    public Cell(int row, int col, BufferedImage bgImage) {
        this.row   = row;
        this.col   = col;
        this.img = bgImage;
    }
}
