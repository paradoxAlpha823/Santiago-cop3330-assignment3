/*
 *  UCF COP3330 Fall 2021 Assignment 42 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex042;                                                                                                          //package

import java.util.*;                                                                                                     //imports
import java.io.*;

public class ex042
{

    public static void main(String[] args) throws IOException {                                                         //main method, needs scanner for file input
        Scanner x = new Scanner(new File("exercise42_input.txt"));
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------\n");
        output(x);
        System.exit(0);
    }
    /*
        function{
            while(file has data)
            {
                format and print
            }
        }
     */

    public static void output(Scanner y)                                                                                //function take data from file, prints into format
    {
        while(y.hasNextLine())
        {
            String s=y.nextLine();
            String[] a= s.split(",");
            System.out.printf("%-17s%-17s%-17s\n",a[0],a[1],a[2]);                                                      //prints string in a particular format while also able to be looped. Useful.
        }

    }
    }
