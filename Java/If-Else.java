import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if (n%2!=0)
            System.out.print("Weird");
        else{
            if(n>=2&&n<=5)
                System.out.print("Not Weird");
            else if(n>=6&&n<=20)
                System.out.print("Weird");
            else
                System.out.print("Not Weird");
        }
    }
}
