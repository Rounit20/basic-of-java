package Seria;

import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

class Cricketer implements Serializable //class should be same in serialization and deserialization
{
    String name;
    transient int runs; //use transient keyword to not serialize runs
    int age;

    public  Cricketer(String name, int runs, int age)
    {
        this.name = name;
        this.runs = runs;
        this.age = age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age );
        System.out.println(runs);
    }
    // public String toString()
    // {
    //     return " Name : "+  name +"|"+" Runs : " + runs +"|"+" Age : " + age;
        
    // }
}
public class seria1 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        Cricketer ck1 = new Cricketer("virat", 100000, 36);
        // System.out.println(ck1);
        ck1.disp();

        FileOutputStream fos = new FileOutputStream("C:\\VS CODE\\java\\DEMO2\\src\\pw1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(ck1);
        oos.flush();
        oos.close();

        // FileInputStream fis = new FileInputStream("C:\\VS CODE\\java\\DEMO2\\src\\pw1.txt");
        // BufferedInputStream bis = new BufferedInputStream(fis);
        // ObjectInputStream ois = new ObjectInputStream(bis);

        // Cricketer cr = (Cricketer)ois.readObject();
        // cr.disp();

        // ois.close();

        // // NOTE :- WE WILL GET OUTPUT OF AGE AS 0 AS IT IS NOT SERIALIZED
        
    }
    
}
