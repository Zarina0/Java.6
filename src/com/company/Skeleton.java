package com.company;

public class Skeleton extends Boss {
    private int getNumberOfArrows;

    public int getGetNumberOfArrows() {
        return getNumberOfArrows;
    }

    public void setGetNumberOfArrows(int getNumberOfArrows) {
        this.getNumberOfArrows = getNumberOfArrows;



    }


    public String info() {
        return super.info()+" " + getNumberOfArrows;
    }
}
