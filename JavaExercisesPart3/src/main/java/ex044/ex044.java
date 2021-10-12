/*
 *  UCF COP3330 Fall 2021 Assignment 44 Solution
 *  Copyright 2021 Diego Santiago
 */
package ex044;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

//was unfamiliar with how to install and use foreign libraries, consulted a guide


/*
        spook
        {
            formatting and object setup
            loop to make sure it continues searching until a user input is found
            prompt and take input
            send necessary calls and data to other class
        }
     */

public class ex044 {
    public static void main(String[] args) throws IOException, ParseException
    {
        while (true){
            JSONParser parser = new JSONParser();

            Object obj = parser.parse(new FileReader("C:\\Users\\Diego Santiago\\Documents\\GitHub\\JavaExercisesPart3\\src\\main\\java\\ex044\\exercise44_input.json"));

            JSONObject jsonObject = (JSONObject)obj;

            JSONArray subjects = (JSONArray)jsonObject.get("products");

            Scanner x = new Scanner(System.in);
            iterate n=new iterate();
            String input;
            int check = 0;
            System.out.print("What is the product name? ");
            input = x.nextLine();
            Iterator iterator = subjects.iterator();
            n.input=input;
            n.check=check;
            iterate.checker(iterator);
        }
    }
}
    /*
        epic
        {
            scan through json data
            register if search query is found or not found
            loop if not, end if it is
        }
     */

class iterate
{
    static String input;
    static int check;

    public static void checker(Iterator iterator)
    {
        while (iterator.hasNext()) {
            JSONObject json = (JSONObject) iterator.next();
            String name = (String)json.get("name");
            if(input.equalsIgnoreCase(name)){
                System.out.println("Name: "+name);
                System.out.println("Price: "+json.get("price"));
                System.out.println("Quantity: "+json.get("quantity"));
                check = 1;
                System.exit(0);
            }
        }
        if(check == 0){
            System.out.println("Sorry, that product was not found in our inventory");
        }
    }
}
