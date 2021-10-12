/*
 *  UCF COP3330 Fall 2021 Assignment 45 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex045;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/*
    main
    {
        set up scanners and files
        take user input
        send necessary data to other class
    }
*/
public class ex045 {
    public static void main(String[] args) throws IOException
    {
        write n=new write();
        Scanner y = new Scanner(new File("C:\\Users\\Diego Santiago\\Documents\\GitHub\\JavaExercisesPart3\\src\\main\\java\\ex045\\exercise45_input.txt"));
        n.y=y;
        Scanner x = new Scanner(System.in);
        System.out.print("\nEnter the name of Output File : ");
        String s = x.next();
        n.s=s;
        write.maker();
        System.exit(0);
    }
}
/*
    maker
    {
        create output file with name based on user input
        parse through input file
        replace each instance of utilize with use
        put replaced text into custom output file
    }
*/
class write
{
    static Scanner y;
    static String s;

    public static void maker() throws IOException
    {
        FileWriter writer = new FileWriter("C:\\Users\\Diego Santiago\\Documents\\GitHub\\JavaExercisesPart3\\src\\main\\java\\ex045\\"+s);
        while( y.hasNext() )
        {
            String replace = y.nextLine();
            replace = replace.replaceAll("utilize", "use");
            writer.write(replace);
            writer.write("\n");
        }
        y.close();
        writer.close();
        System.out.println("\nSuccessfully Modified!!");
    }
}
