package com.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Richard Nham
 */

public class Main {

    public static void main(String[] args) {
        Scanner scannerUserInput= new Scanner(System.in);
        int people;
        int pizza;
        int slices;

        System.out.println("How many people?");
        people =  scannerUserInput.nextInt();

        System.out.println("How many pizzas do you have?");
        pizza =  scannerUserInput.nextInt();

        System.out.println("How many slices per pizza?");
        slices =  scannerUserInput.nextInt();

        int total_slices = pizza * slices;

        int slice_per_person = total_slices/people;
        int leftover = total_slices % people;

        System.out.println("Each person gets " + slice_per_person + " piece/s of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
        scannerUserInput.close();
    }

}
