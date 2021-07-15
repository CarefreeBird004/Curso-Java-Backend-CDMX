package com.anncode.lambdas;
import java.util.*;

class GFG {

    // static function to be called
    static void someFunction(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args)
    {

        List<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        // call the static method
        // using double colon operator
        list.forEach(GFG::someFunction);
    }
}