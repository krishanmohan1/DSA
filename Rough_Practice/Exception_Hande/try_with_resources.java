package Rough_Practice.Exception_Hande;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;

public class try_with_resources {
    public static void main(String[] args) throws Exception
    {


        // Try with resources java 1.7
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        br.close();

    }
}