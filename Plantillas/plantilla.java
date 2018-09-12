import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.math.BigInteger;

public class Plantilla
{
    private  void solve() throws IOException 
    {
         //aca resuelves todo       
    }
    public static void main(String[] args) 
    {
        Plantilla p=new Plantilla();
        p.run();
    }
//cosas de la plantilla 		
    BufferedReader scan;
    StringTokenizer tokenizer;
    PrintWriter wr;
    public  int readInteger() throws  IOException
    {
        return Integer.parseInt(read());
    }
    public  long readLong()throws IOException
    {
        return Long.parseLong(read());
    }
    public  double readDouble()throws IOException
    {
        return Double.parseDouble(read());
    }
    public  String read() throws IOException
    {
        String res="";
        if(tokenizer.hasMoreTokens())
        {
            res=tokenizer.nextToken();
        }
        else
        {
            String aux=scan.readLine();
//              if(aux.isEmpty())
//              {
//                  wr.close();
//                  System.exit(0);
//              }
            tokenizer=new StringTokenizer(aux," ");

            res=tokenizer.nextToken();
        }
        return res;
    }

    public  void run() 
    {
        try 
        {
            scan= new BufferedReader(new InputStreamReader(System.in));
            tokenizer = new StringTokenizer("","");
            wr = new PrintWriter(System.out);

            solve();

            scan.close();
            wr.close();
        } catch (Exception e) {
            e.printStackTrace();
            wr.close();
        System.exit(0);
        }
    }
}
