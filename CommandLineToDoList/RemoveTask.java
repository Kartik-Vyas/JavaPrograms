package com.second;

import java.util.ArrayList;

class RemoveTask {
    public static void deleting(int del, ArrayList content)
    {
        content.remove(del - 1);
        System.out.println("Your task has been removed successfully");
    }
}
