/*
 *  UCF COP3330 Fall 2021 Assignment 43 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex043;
import java.io.IOException;
import java.util.Scanner;
public class ex043
{
    /*
         main
         {
            take user input
            set up formatting
            send data to class/methods
            print response/execute
         }
     */
    public static void main(String[] args) throws IOException {
        Scanner x = new Scanner(System.in);
        String site;
        String name;
        String j;
        String c;

        System.out.print("Site name: ");
        site = x.nextLine();
        System.out.print("Author: ");
        name = x.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        j = x.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        c = x.nextLine();

        j= j.toLowerCase();
        c= c.toLowerCase();

        sitemaker n =new sitemaker();


        n.site=site;
        n.name=name;
        n.location= "C:\\Users\\Diego Santiago\\Documents\\GitHub\\JavaExercisesPart3\\src\\main\\java\\ex043\\";

        System.out.println("Created "+ sitemaker.maker());
        System.out.println("Created "+ sitemaker.html());

        if(j.equals("y"))
        {
            System.out.println("Created "+ sitemaker.js());
        }
        if(c.equals("y"))
        {
            System.out.println("Created "+ sitemaker.cs());
        }

        System.exit(0);



    }
}
