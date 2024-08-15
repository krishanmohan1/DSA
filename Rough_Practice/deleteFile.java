package Rough_Practice;
import java.io.*;

public class deleteFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\krish\\OneDrive\\Desktop\\mohan.txt");
        if(f.delete()){
            System.out.println("File Deleted " );
        }else{
            System.out.println("Failed to delete ");
        }
    }
}
