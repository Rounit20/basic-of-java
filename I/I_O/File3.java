package I.I_O;
import java.io.*;

public class File3 
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("PW");
        File f1 = new File(dir, "pw.txt");
        
        FileReader fr = new FileReader(f1);
        
        // int i =fr.read();
        // //System.out.println((char)i);

        // while(i!=-1)
        // {
        //     System.out.print((char)i);
        //     i = fr.read();

        // }

        //Better approach than above method..BECAUSE of better performance

        char ch[]=new char[(int)f1.length()];
        fr.read(ch);
        for (char c : ch)
        {
            System.out.print(c);
        }



    }
    
}
