package com.towerblaster.clases;
import java.util.ArrayList;
public class Score {
    private double score;
    private final ArrayList<Integer> nextNumbers;
    public Score(){
        this.score = 0;
        this.nextNumbers = new ArrayList<>();
    }
    private boolean checkNumbers(int a){
        boolean flag = false;
        for(int i = 0; i<this.nextNumbers.size(); i++){
            if(a == this.nextNumbers.get(i)){
                flag = true;
                i = this.nextNumbers.size();
            }
        }
        return flag;
    }
    private void setNumbers(int[] bag) {
        for (int i = 0; i < bag.length; i++) {
            int next = bag[i]+1;
            for (int j = i +1; j<bag.length; j++){
                if(next==bag[j]){
                    if (!checkNumbers(bag[i])){
                        this.score = this.score + bag[i] + bag[j];
                        this.nextNumbers.add(bag[i]);
                    }else {
                        this.score = this.score + bag[j];
                    }
                    this.nextNumbers.add(bag[j]);
                    j = bag.length;
                }
            }
        }
    }
    public double getScore(int[] bag) {
        setNumbers(bag);
        return this.score;
    }
}
