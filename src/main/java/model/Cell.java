package model;

public class Cell {
    int number;
    boolean starter;

    public Cell(int number, boolean starter) {
        this.number = number;
        this.starter = starter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStarter() {
        return starter;
    }

    public void setStarter(boolean starter) {
        this.starter = starter;
    }

    public void inc(){
        this.number++;
    }
}

