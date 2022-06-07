package com.second;

import java.util.ArrayList;

class DisplayList {
    public static void display(ArrayList content)
    {
        for (int j = 0; j < content.size(); j++) {
            System.out.println((j + 1) + ":" + content.get(j));
        }
    }
}
