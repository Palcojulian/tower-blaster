package com.towerblaster.clases;
public class Bag {
    private final int[] bag;
    private int index;
    public Bag(){
        this.bag = new int[5];
        this.index = 0;
    }
    public void setKeyBag(int key){
        try{
            this.bag[this.index] = key;
            this.index++;
        }catch (Exception e){
            System.out.println("Error, Bolsa llena -> " + e.getClass());
        }
    }
    public int[] getBag(){
        return this.bag;
    }
}
