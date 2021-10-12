package ex043;

import java.io.*;

class sitemaker
{
    static String site;
    static String name;
    static String location;

    /*
        html
        {
            make file path
            make file
        }
    */
    public static String html() throws IOException {
        String file = location+site+"/index.html";
        String infile = "<title> "+site+" </title>\n<meta> "+name+"</meta>";
        File file1=new File(file);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
        writer.write(infile);
        writer.close();
        return file;

    }
    /*
        maker
        {
            make folder path
            make folder
        }
    */
    public static String maker()
    {
        String file=location+site;
        File file1=new File(file);

        file1.mkdirs();
        return file;
    }
    /*
       js
       {
           make folder path
           make folder
       }
   */
    public static String js()
    {
        String file = location+site+"/js";
        File file1=new File(file);

        file1.mkdirs();
        return file;
    }
    /*
       cs
       {
           make folder path
           make folder
       }
   */
    public static String cs()
    {
        String file = location+site+"/css";
        File file1=new File(file);

        file1.mkdirs();
        return file;
    }



}
