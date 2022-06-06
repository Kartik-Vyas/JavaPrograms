package com.second;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        int i = 0;
        ArrayList<String> content = new ArrayList<>();
        while(i<=3) {
            System.out.println("Choose from the option given below :-");
            System.out.println("1: To add tasks");
            System.out.println("2: To remove tasks");
            System.out.println("3: To watch tasks");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.nextLine();
            //for adding the task
            if (num == 1) {
                System.out.println("enter your task");
                String s = sc.nextLine();
                content.add(s);
                System.out.println("Your Task added Successfully");
            }
            //for deleting the task
            else if (num == 2) {
                System.out.println("Select the Task you want to delete");
                for (String s : content) {
                    System.out.println(s);
                }
                int del = sc.nextInt();
                content.remove(del - 1);
                System.out.println("Your task has been removed successfully");
            }
            //for viewing the tasks
            else if (num == 3)
            {
                System.out.println("Here are your task which has been previously added..");
                for (String s : content) {
                    System.out.println(s);
                }
            }
            else
            {
                System.out.println("Invalid input number");
                break;
            }
        }
    }
}
