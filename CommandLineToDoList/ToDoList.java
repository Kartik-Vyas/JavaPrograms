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
            System.out.println("4: To edit ToDoList");
            System.out.println("5: Set the task to Priority");
            System.out.println("6: To close ToDoList");
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
                DisplayList.display(content);
                int del = sc.nextInt();
                RemoveTask.deleting(del, content);
            }
            //for viewing the tasks
            else if (num == 3) {
                System.out.println("Here are your task which has been previously added..");
                DisplayList.display(content);
                int value = PriorityTask.ImportantTask.size();
                if(value==0)
                {
                    System.out.println("No priority given to any tasks");
                }
                else {
                    System.out.println("Your priority task is : ");
                    System.out.println(PriorityTask.ImportantTask);
                }
            }
            else if  (num==4){
                System.out.println("Choose the task you want to edit");
                DisplayList.display(content);
                int replaceNo = sc.nextInt();
                System.out.println("Enter the task at you want to be edited");
                sc.nextLine();
                String newString = sc.nextLine();
                ReplacingTask.replaceTask(replaceNo,newString,content);
            }
            else if(num == 5){
                System.out.println("Choose the task which needed to be given first priority");
                DisplayList.display(content);
                int priority = sc.nextInt();
                PriorityTask.urgentTask(priority,content);
            }
            else if (num == 6) {
                System.out.println("ToDoList is successfully closed");
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}
