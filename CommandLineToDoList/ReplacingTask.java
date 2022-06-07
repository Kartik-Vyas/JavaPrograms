package com.second;

import java.util.ArrayList;

class ReplacingTask {
    public static void replaceTask(int replaceNo, String newString, ArrayList content)
    {
        content.remove(replaceNo-1);
        content.add((replaceNo-1),newString);
        DisplayList.display(content);
        System.out.println("Your task has been edited successfully");
    }
}
