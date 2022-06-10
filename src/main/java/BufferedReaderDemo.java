import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args)throws Exception {
        InputStreamReader r =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter your name");
        String name =br.readLine();
        System.out.println("welcome " +name);
        String nam=" ";
        while(!nam.equals("stop")){
            System.out.println("Enter data: ");
            nam=br.readLine();
            System.out.println("Data is: "+nam);
        }
        br.close();
        r.close();
        ////////////// /Users/renxing/QAAEB2201Java/src/Assignment/testout.txt
        FileReader fr=new FileReader("src/Assignment/testout.txt");
        BufferedReader bfr=new BufferedReader(fr);
        int i;
        while ((i=fr.read())!=-1) {
            System.out.print((char)i);
           //bfr.close();
          //fr.close();
        }
        }
    }

