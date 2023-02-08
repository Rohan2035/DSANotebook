package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RedBlueGreen {

    public static ArrayList<String> solution(ArrayList<String> bag) {

        int left = 0, mid = 0, right = bag.size() - 1;

        while(mid <= right) {

            switch (bag.get(mid)) {

                case "RED": {

                    String temp = bag.get(left);
                    bag.set(left, bag.get(mid));
                    bag.set(mid, temp);

                    left++;
                    mid++;

                    break;

                }

                case "BLUE": {

                    mid++;

                    break;

                }

                case "GREEN": {

                    String temp = bag.get(right);
                    bag.set(right, bag.get(mid));
                    bag.set(mid, temp);

                    right--;

                    break;

                }

            }

        }

        return bag;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> bag = new ArrayList<>();
        String ch = "";

        while(true) {

            ch = scan.nextLine();

            if(ch.equals("RED") || ch.equals("BLUE") || ch.equals("GREEN")) {

                bag.add(ch);

            } else if(ch.equals("exit")) break;
            else {

                System.out.println("Please type RED, GREEN or BLUE");

            }

        }

        System.out.println("List Before Sorting: ");
        System.out.println(bag);
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("List After Sorting: ");
        ArrayList<String> res = solution(bag);

        System.out.println(res);

    }

}
