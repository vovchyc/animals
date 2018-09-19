package com.company;

import java.util.Scanner;


public class Animal {
    Scanner scan = new Scanner(System.in);
    public boolean swim = true;
    public boolean isAlive = true;
    public void move(){
        System.out.println("I m moving");
    }
    public void eat(){
        System.out.println("I`m eating");
    }
    public void voice(){
        System.out.println("I say ...");
    }
}
