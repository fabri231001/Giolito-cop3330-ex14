/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat d = new DecimalFormat("#.##");

    public static void main(String[] args) {
	    System.out.println("What is the order amount? ");
        Scanner s1 = new Scanner(System.in);
        double o_a = s1.nextDouble();

        System.out.println("What is the state? ");
        Scanner s2 = new Scanner(System.in);
        String state = s2.nextLine();
        double tax = 0.00;
        String w = "WI";
        if(state.equals(w)) {
            tax = o_a * 0.055;
            System.out.println("The subtotal is $" + o_a + "\nThe tax is $" + tax);
        }
        d.setRoundingMode(RoundingMode.UP);
        System.out.println("The total is $" + d.format(tax+o_a));
    }
}
