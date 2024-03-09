package I.I_O;
import java.io.*;



public class File4 
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("PW");
        File f1 = new File(dir, "pw.txt");
        
        FileWriter fw = new FileWriter(f1,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("java");
        bw.newLine();

        bw.write(65);
        bw.newLine();

        bw.write("67");
        bw.newLine();

        char ch[]={'h', 'e', 'l', 'l', 'o'};
        bw.write(ch);
        bw.newLine();

        bw.write((int) 65.1);
        bw.newLine();

        bw.close();




    }
}