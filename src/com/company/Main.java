package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List list1 = new ArrayList();
        Scanner input = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        while (true) {
            int luck = (int) (Math.random() * 1000 + 1);
            luck *= luck;


            System.out.println("Howdy, what's your name?");
            String username = input.nextLine().replaceAll("\\s+", "");

            System.out.println("Well then " + username + ", your lucky number is " + luck);
            list1.add(username + "" + luck);

            String num = "10";
            while (Integer.parseInt(num) < 0 || Integer.parseInt(num) > 2) {
                System.out.println("If you would like to end the program, enter 0. \nIf you would like view a name list, enter 1.\n" +
                        "If you would like to enter a new name, enter 2.\n  ");
                num = in2.next();
                if (num.equals("0") || num.equals("1") || num.equals("2")) {

                    // Do Nothing

                } else {
                    num = "10";
                }
            }
                if (Integer.parseInt(num) == 0) {
                    break;
                }
                else if (Integer.parseInt(num) == 1) {
                    System.out.println(list1);
                    break;
                }


        }
    }
}
