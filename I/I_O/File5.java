package I.I_O;
import java.io.*;



public class File5 
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("PW");
        File f1 = new File(dir, "pw.txt");
        
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String line =br.readLine();

        while(line != null)
        {
            System.out.println(line);
            line = br.readLine();

        }

        //NOTE:- WE CAN ALSO DO THIS:
        
        // char ch[]= new char[(int)f1.length()];
        // br.read(ch);
        // for(char c : ch)
        // {
        //     System.out.print(c);
        // }

    }
}
