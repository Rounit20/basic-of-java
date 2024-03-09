package I.I_O;
import java.io.*;

public class File6 
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("PW");
        File f1 = new File(dir, "pw.txt");
        
        FileWriter fr = new FileWriter(f1);
        PrintWriter pw = new PrintWriter(f1);

        pw.write("hello world");
        pw.write("\n");
        pw.write(65); // ascii value will be stored.
        pw.write("\n");

        pw.println("pw");
        pw.println(100); // WE CAN ENTER OTHER DATA ALSO USING println()or print()
        pw.println('a');
        pw.println(50.5);
        pw.println(true);

        pw.close();


    }

}
