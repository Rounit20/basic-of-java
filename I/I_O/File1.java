package I.I_O;
import java.io.*;

public class File1 
{
    public static void main(String[] args) 
    {
        // File f1 = new File("TEST.txt");
        // System.out.println(f1.exists());

        // f1.createNewFile();

        // System.out.println(f1.exists());



        // File dir1 = new File("PW JAVA");
        // System.out.println(dir1.exists());

        // dir1.mkdir();
        // System.out.println("dir is referreing to directory PW JAVA : " + dir1.isDirectory());

        // File f1 = new File(dir1,"test.txt");
        // try 
        // {
        //     f1.createNewFile();
        // } 
        // catch (IOException e) 
        // {
        //     System.out.println("IO Exception");
            
        // }
        // System.out.println("f1 is referring tp text.txt : " + f1.exists());

        int count = 0;
        File f = new File("JAVA");//WE CAN GIVE HERE PATH ALSO..
        String str[]= f.list();
        for(String name : str)
        {
            count ++;
            System.out.println(name);

        }
        System.out.println("NO. of files found : " + count);

        
    }

    
}
