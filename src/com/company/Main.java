package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int luck = (int)(Math.random() * 100000 + 1);
        System.out.println("Howdy, what's your name?");
        String username = input.nextLine().replaceAll("\\s+","");
        System.out.println("Well then " + username + ", your lucky number is " + luck);

    }
}
