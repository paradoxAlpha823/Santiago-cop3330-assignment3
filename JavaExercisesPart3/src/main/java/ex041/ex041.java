/*
 *  UCF COP3330 Fall 2021 Assignment 41 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex041;                                                                                                          //package

import java.util.*;                                                                                                     //imports
import java.io.*;

public class ex041
{

    public static void main(String[] args) throws IOException {                                                         //main method, needs scanner for file input

        Scanner x = new Scanner(new File("exercise41_input.txt"));

        ArrayList<String> name=new ArrayList<String>();
        ArrayList<String> name1=names(x,name);
        ArrayList<String> name2=sorter(name1);
        filemaker(name2);

        System.exit(0);
    }
    /*
        function{
            while(file has names)
            {
                put the names in the array
            }
            send the array back to main
        }
     */
    public static ArrayList<String> names(Scanner y, ArrayList<String>name)                                             //function take names from file, put them into list
    {
        while(y.hasNextLine())
        {
            name.add(y.nextLine());
        }
        return(name);
    }
    /*
        function{
            use Java method to sort names alphabetically
            send the array back to main
        }
     */
    public static ArrayList<String> sorter(ArrayList<String>name)                                                       //function, sort the names
    {
        Collections.sort(name,String.CASE_INSENSITIVE_ORDER);
        return(name);
    }
    /*
        function{
            make a file
            initial print statements
            while(array has names){
                write the names in desired format
            }
        }
     */
    public static void filemaker(ArrayList<String> name) throws IOException {                                           //function, make the file and print output in desired format

        FileWriter maker=new FileWriter("exercise41_output.txt");
        maker.write("Total of "+name.size()+" names\n");
        maker.write("-----------------\n");
        for(String i : name)                                                                                            //found out about a for loop thing that makes this part easier
        {
            maker.write(i+"\n");
        }
        maker.close();

    }
}
