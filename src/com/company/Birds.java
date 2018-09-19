package com.company;

public class Birds extends Animal {




    public void move() {
        System.out.println("If bird Alive enter True, else False");
        if (scan.nextBoolean()) {
            System.out.println("I`m flying and swimming");
        } else {
            System.out.println("I`m sparrow, I fly in the sky");
        }
    }
        public void eat() {
            if (swim == true) {
                System.out.println("I love to eat fresh grains and fish! ");
            } else {
                System.out.println("I love to eat fresh grains!");
            }
        }
            public void voice() {
            if(swim==true){
            System.out.println("I say:'I want to eat'");
        } else{
                System.out.println("I say squirrel;"+"\n");
            }
            }

        public void name(){
            System.out.println("I`m pelican");
        }
    }
