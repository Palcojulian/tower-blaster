package com.towerblaster.test;
import com.towerblaster.clases.Player;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

    }
    public static Scanner in(){
        return new Scanner(System.in);
    }
    public static int inNum(){
        int num = 0;
        boolean flag = false;
        while (!flag){
            try {
                System.out.println("Ingresa un numero: ");
                num = in().nextInt();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println("¡Error! tipo de entrada diferente -> " + e.getClass() +
                                   "\nIntenta nuevamente");
            }
        }
        return num;
    }



}
