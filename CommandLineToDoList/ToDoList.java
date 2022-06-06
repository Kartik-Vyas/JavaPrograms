package com.second;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {

        ArrayList<String> content = new ArrayList<>();
        int i = 0;
        while (i<=4) {
            System.out.println("Choose from the option given below :-");
            System.out.println("1: To add tasks");
            System.out.println("2: To remove tasks");
            System.out.println("3: To watch tasks");
            System.out.println("4: To close ToDoList");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.nextLine();

            //for adding the task
            if (num == 1) {
                System.out.println("enter your task");
                String addTask = sc.nextLine();
                AddTask.adding(addTask, content);
            }
            //for deleting the task
            else if (num == 2) {
                System.out.println("Select the Task you want to delete");
                for (int j = 0; j < content.size(); j++) {
                    System.out.println((j + 1) + ":" + content.get(j));
                }
                int del = sc.nextInt();
                RemoveTask.deleting(del, content);
            }
            //for viewing the tasks
            else if (num == 3) {
                System.out.println("Here are your task which has been previously added..");
                for (int j = 0; j < content.size(); j++) {
                    System.out.println((j + 1) + ":" + content.get(j));
                }
            } else if (num == 4) {
                System.out.println("ToDoList is successfully closed");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
