/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package minesweeper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO: Specification
 */
public class Board {
    
    // TODO: Abstraction function, rep invariant, rep exposure, thread safety
    
    // TODO: Specify, test, and implement in problem 2
    private final int width;
    private final int height;
    private final Square[][] grid;
    
    public Board (int width, int height, Double probability) {
//        this.grid = null;
        grid = new Square[width][height];
        this.width = width;
        this.height = height;
        checkRep();
        for (int x=0; x< width; x++) {
            for (int y=0; y<height; y++) {
                if (Math.random()< probability) {
                    grid[x][y] = new Square(x,y,true);
                } else {
                    grid[x][y]=new Square(x, y, false);
                }
            }
            
        }
    }
    
    public Board(File file) throws IOException {
        List<String> allLines = Files.readAllLines(file.toPath());
//        System.out.println(allLines);
        if (!(allLines.get(0).matches("([0-9]+ )[0-9]+"))) {
            throw new RuntimeException("First line is wrong format");
        }

        String[] size = allLines.get(0).split(" ");
        
        int x = Integer.parseInt(size[0]);
        int y = Integer.parseInt(size[1]);
        this.width= x;
        this.height = y;
        grid = new Square[x][y];
        allLines.remove(0);
        if(allLines.size()!= y) {
            throw new RuntimeException("unexpected no of lines in file");
        }
        
        allLines.forEach(line-> {
           System.out.println(line); 
           if (!(line.matches("((0|1) )*(0|1)"))) {
               throw new RuntimeException ("expect only 0 or 1");
           }
           if (line.split(" ").length!=x) {
               throw new RuntimeException ("expect length of line equal width");
           }
        });
        for (int j=0; j <y; j++) {
            for (int i=0; i < x; i++) {
                if ((Integer.parseInt(allLines.get(j).split(" ")[i]))==1) {
                    grid[i][j] = new Square(i,j, true);
                } else {
                    grid[i][j] = new Square(i, j, false);
                }
            }
        }
    }
    
    private void checkRep() {
        assert this.width > 0;
        assert this.height > 0;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    synchronized public boolean dig(int x, int y) {
        checkRep();
        if (x<=this.getWidth() && y <= this.getHeight()) {
            if (this.grid[x][y].getState()=="UNTOUCHED") {
                this.grid[x][y].setState("DUG");
                if (this.grid[x][y].isBomb()) {
                    System.out.println("ITS A BOMB");
                    this.grid[x][y].notBomb();
                    return true; //boom message?
                //end game           
                }
                if (adjacentBombs(x,y)==0) {
                    adjacentSquares(x,y).forEach((square)->{
                        dig(square.getX(), square.getY());
                    });
                }
            }
        }
        
        return false;
    }
    
    synchronized public String flag(int x, int y) {
        checkRep();
        if (this.grid[x][y].getState()=="UNTOUCHED") {
            this.grid[x][y].setState("FLAGGED");
        }
        return this.toString();
    }

    synchronized public String deflag(int x, int y) {
        checkRep();
        if (this.grid[x][y].getState()=="FLAGGED") {
            this.grid[x][y].setState("UNTOUCHED");
        }
        return this.toString();
    }
    
    public String help() {
        return "help messgaae";
    }
    
    public String bye() {
        //disconnet server
        return "bye";
    }
    

    private List<Square> adjacentSquares(int x, int y) {
        List<Square> squares = new ArrayList<>();
        int lowerX = Math.max(0,x-1);
        int lowerY = Math.max(0, y-1);
        int upperX = Math.min(this.getWidth(), x+1);
        int upperY = Math.min(this.getHeight(), y+1);
        for (int i =lowerX; i< upperX; i++) {
            for (int j =lowerY; j< upperY; j++) {
//                System.out.println("i+j"+i+j);
                squares.add(this.grid[i][j]);
//                if (i!=x && j !=y) {
//                    squares.add(this.grid[i][j]);
//                }
            }
        }
        squares.remove(this.grid[x][y]);
//        Collections.addAll(squares, this.grid[x-1][y+1], this.grid[x][y+1], this.grid[x+1][y+1],
//                                    this.grid[x-1][y], this.grid[x+1][y],
//                                    this.grid[x-1][y-1], this.grid[x][y-1], this.grid[x+1][y-1]);
        return squares;
    }
    
    private int adjacentBombs(int x, int y) {
        AtomicInteger count=new AtomicInteger(0);

        adjacentSquares(x,y).forEach((square)-> {
            if (square.isBomb()) {
                count.incrementAndGet();
            }
        });
        return count.intValue();

    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y=0; y< this.getHeight(); y++) {
            for (int x=0; x<this.getWidth(); x++) {
                if (this.grid[x][y].getState()=="UNTOUCHED") {
                    sb.append("-");
                } else if (this.grid[x][y].getState()=="DUG") {
                    if (adjacentBombs(x,y)==0) {
                        sb.append("d");
                    } else {
                        sb.append(String.valueOf(adjacentBombs(x,y)));
                    }    
                } else if (this.grid[x][y].getState()=="FLAGGED") {
                    sb.append("F");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String boomMessage() {
        return "BOOM";
    }
}


