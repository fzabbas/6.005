package minesweeper;

public class Square {
    private final int x;
    private final int y;
    private boolean isBomb; //should this be final?
    private String state;

    public Square(int x, int y, boolean isBomb) {
        this.x = x;
        this.y = y;
        this.isBomb = isBomb;
        this.state = "UNTOUCHED";
        // TODO Auto-generated constructor stub
    }
    
    public String getState() {
        return this.state;
    }
    
    //state is initilly UNTOUCHED, can be changed to DUG or FLAGGED
    public void setState(String state) {
        if (state=="DUG") {
//            this.isBomb=false;
            this.state=state;
        } else {
            this.state=state;
        }
    }

    public boolean isBomb() {
        return this.isBomb;
    }
    
    public void notBomb() {
        this.isBomb=false;
    }

    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }

}
