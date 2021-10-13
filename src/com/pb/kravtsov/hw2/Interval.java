package com.pb.kravtsov.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int userNumber = in.nextInt();

        if(userNumber>=0 && userNumber<=14) {
            System.out.printf("The number in between 0-14");
        } else if (userNumber>=15 && userNumber<=35) {
            System.out.printf("The number in between 15-35");
        } else if (userNumber>=36 && userNumber<=50) {
            System.out.printf("The number in between 36-50");
        } else if (userNumber>=51 && userNumber<=100) {
            System.out.printf("The number in between 51-100");
        } else {
            System.out.printf("The number is not included in any interval");
            }

        }
    }
