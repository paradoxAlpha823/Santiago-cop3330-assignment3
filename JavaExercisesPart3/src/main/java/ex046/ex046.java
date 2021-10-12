/*
 *  UCF COP3330 Fall 2021 Assignment 46 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex046;

import java.util.*;
import java.io.*;

class ex046 {
    /*
        main
        {
            set up scanners and all the like
            set up map
            send necessary data to other class
            take in modified map
            parse through and print formatted output
        }
    */
    public static void main(String args[]) throws IOException {

        decider n = new decider();
        Scanner y=new Scanner(new File("C:\\Users\\Diego Santiago\\Documents\\GitHub\\JavaExercisesPart3\\src\\main\\java\\ex046\\exercise46_input.txt"));
        Map<String,Integer> map=new TreeMap<String,Integer>();                                                           //parsing maps is kinda like going through that one json. I think I get it better now.
        n.y=y;

        map = decider.decision(map);

        for(String key:map.keySet()) {
            System.out.printf("%-10s",key+":");
            for(int i=map.get(key);i>0;i--)
                System.out.print("*");
            System.out.println();
        }
    }
}

/*
        decision
        {
            take in map
            read values from file
            check if new or same word
            if so, increment
            if not, start counting it
            return map
        }
    */
class decider
{
    static Scanner y;
    public static Map<String,Integer> decision(Map<String,Integer> map)
    {
        while(y.hasNext()) {
            String s=y.next();
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }
        return map;
    }
}
