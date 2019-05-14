package Exercise2;

import java.io.FileInputStream;

public class FileData {
    public static void main(String[] args) throws Exception {
        String fileP="/home/sakshi/external.txt";
        FileInputStream fs=new FileInputStream(fileP);
        int count=0;

        int data=0;
        while((data=fs.read())!=-1)
        {
            if(Character.isLowerCase(data))
            {
                data=Character.toUpperCase(data);
            }
            System.out.print((char)data);
            count++;
        }
        System.out.println(count-1);
    }
}
