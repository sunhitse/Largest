package Largest;

import java.lang.*;
import java.util.*;
 
class Largest {
 
    public static void main(String[] args)
    {
        int a, b, c;
        a = 15;
        b = 10;
        c = 33;
        ArrayList<Integer> x = new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);
        System.out.println(Collections.max(x)
                           + " is the largest number.");
    }
}
