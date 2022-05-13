/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Pandu Putrakelana G
 */
public class Latihan_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for c");
        // Exception Handling
        try {
            int c = scan.nextInt();
            int res = c / 0;

            System.out.println(" The result is " + res);
        } catch (ArithmeticException i) {
            System.out.println("adalah = " + i);
        }
    }
}
