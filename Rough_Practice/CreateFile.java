package Rough_Practice;
import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\krish\\OneDrive\\Desktop\\Mohan.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File created successfully " + f.getName());
            } else {
                System.out.println("file already exist");
            }
        }
            catch(IOException e){
                System.out.println("An error occur");
//                e.printStackTrace();
            }

        }
    }

