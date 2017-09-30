package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the world of zombies. Survival is the only thing your living for! ");
        System.out.println("Type Start to begin");
        System.out.println(" ready to begin?" + " Type Yes or no");

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String choice = input.next().toLowerCase();
        String myWeapon;
        GameOver player1 = new GameOver();


            if (choice.equals("yes")) {
        System.out.println("great lets get you a weapon");
        System.out.println("Choose 1. for a hammer. 2. for a bat.");
        int weaponChoice = input2.nextInt();


        switch (weaponChoice) {
            case 1:
                myWeapon = "a Hammer";
                break;
            case 2:
                myWeapon = " a Bat";
                break;
            default:
                myWeapon = " to use bare hands and grit";
        }
        System.out.println(" You choose " + myWeapon);
        System.out.println("ready to leave?" + " Answer yes or no");
        choice = input2.next();
        if (choice.equals("yes")) {
            System.out.println(" You see a cop from a block away." + "You approch them for more info.");
        } else if (choice.equals("no")) {
            player1.dead();

        }

        System.out.println("as you get closer you notice the cop is a zombie");
        player1.zombiecop();
        System.out.println("Do you want to stay and fight??" + " " + " yes or no?");
        choice = input2.next();
        if (choice.equals("yes")) {
            System.out.println("Get " + myWeapon + " Ready");
            System.out.println("choose how many times you want to swing the" + myWeapon +
                    " Press 1 or 2 for action ");
            int swings = input2.nextInt();
            switch (swings) {
                case 1:
                    player1.weaponUse1();
                    player1.deadhead();
                    player1.dead();
                    break;
                case 2:
                    player1.weaponUse2();
                    System.out.println("You spent too much time in one place. A zombie horde attack");
                    player1.zombieHorde();
                    player1.dead();
                    break;

                default:
                    System.out.println("Not fast enough");
                    player1.deadhead();
                    player1.dead();
            }


        } else if (choice.equals("no")) {
            System.out.println(" You run around the corner into a Zombie horde");
            player1.zombieHorde();
            player1.dead();
        }

    } else {
        player1.zombie();
        player1.dead();
        player1.laugh();
        player1.deadhead();



    }
}
    }












