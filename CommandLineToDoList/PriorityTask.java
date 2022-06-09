package com.second;

import java.util.ArrayList;
import java.util.Scanner;

class PriorityTask {
   static ArrayList<String > ImportantTask = new ArrayList<>();
    public static void urgentTask(int priority,ArrayList content)
    {
        String task = (String) content.get(priority-1);
        ImportantTask.add(task);
        content.remove(priority-1);
        System.out.println("Your priorities are....");
        for(int i=0;i< ImportantTask.size();i++)
        {
            System.out.println((1 + i) + ":" + ImportantTask.get(i));
        }
        System.out.println("Does you want to remove your priority tasks");
        System.out.println("1) Yes or 2) No");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option==1)
        {
            System.out.println("enter the priority of task which is exceuted");
            int complete = sc.nextInt();
            ImportantTask.remove(complete-1);
            System.out.println("Congratulation your priority task has been completed.");
        }

    }
}
