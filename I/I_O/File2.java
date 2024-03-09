package I.I_O;
import java.io.*;

public class File2 
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("PW");
        dir.mkdir();
         
        File f1 = new File(dir,"pw.txt");
        //f1.createNewFile();
        
        FileWriter fw = new FileWriter(f1,true);//true is added so that the existing data is not changed ..
        
        fw.write("hello ");
        fw.write("world");
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[] ={'j','a','v','a'};
        fw.write(ch);
        fw.write("\n");

        fw.close();// it is important to add this to add the new data to the file 

        System.out.println("open pw.txt to see result");


        
    }//NOTE:-
    // FILE WRITER STRING VALUE STORE KARTA HAI AND READER INTEGER VALUE SHOW KARTA HAI..
    
}
