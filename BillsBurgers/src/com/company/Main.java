package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger basicBurger = new Hamburger("Basic Burger","Brioche","Chiken",5);
        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger","Healthy Chiken",7.50);
        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger", "Deluxe Bread", "Deluxe Chiken",10);



        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Your Burger: ");
        System.out.println("1 - "+basicBurger.getName());
        System.out.println("2 - "+healthyBurger.getName());
        System.out.println("3 - "+deluxeBurger.getName());
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                basicBurgerChoice();
        }
    }

    public static void basicBurgerChoice(){
        Scanner scanner = new Scanner(System.in);

        Additions additions1 = new Additions();
        Additions additions2 = new Additions();
        Additions additions3 = new Additions();
        Additions additions4 = new Additions();

        System.out.println("Choose your additions: ");
        int count = 0;
        System.out.println("1 - Carrot - 0.50");
        System.out.println("2 - Tomato - 1.00");
        System.out.println("3 - Mayonnaise - 1.50");
        System.out.println("4 - addition4 - 2.00");
        System.out.println("5 - addition5 - 2.50");
        System.out.println("6 - addition6 - 3.00");


        while(count < 4){
            int additionChoice = scanner.nextInt();
            count++;
            if(additionChoice == 1){
                additions1.setName("Carrot");
                additions1.setPrice(0.5);
            }

        }

    }
}
