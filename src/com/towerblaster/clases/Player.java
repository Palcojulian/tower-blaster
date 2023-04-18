package com.towerblaster.clases;
 public class Player{
    private int attempt;
    private boolean win;
    private final Bag bag;
    private final Score score;
    public Player(){
        this.score = new Score();
        this.bag = new Bag();
        this.attempt = 20;
        this.win = false;
    }
    public double getScore(){
        return score.getScore(this.bag.getBag());
    }
    public void setKey(int key){
        this.bag.setKeyBag(key);
    }





















    public void setAttempt(int attempt){
        this.attempt = attempt;
    }
    public int getAttempt(){
        return this.attempt;
    }
    public void setWin(Boolean win){
        this.win = win;
    }
    public Boolean isWin(){
        return this.win;
    }
}
