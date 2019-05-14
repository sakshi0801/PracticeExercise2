package Exercise2;

import java.io.File;
import java.util.Scanner;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String path="/home/sakshi/Downloads/files";
        File f=new File(path);
        String files[]=f.list();
        for(String names:files)
        {
            System.out.println(names);
        }
        String fname;
        // enter filename with extension to open and read its content
        System.out.print("Enter File Name to Open (with extension like file.txt) : ");
        fname = sc.nextLine();

        // this will reference only one line at a time
        String line = null;
        try
        {
            // FileReader reads text files in the default encoding
            FileReader fReader = new FileReader(path+"/"+fname);
            BufferedReader bufferedReader = new BufferedReader(fReader);
            System.out.println("Original content:");
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            // always close the file after use
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}