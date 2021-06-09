package IO;

import java.io.*;

public class ReadingBuffered {

    public static void main(String[] args) throws  IOException {
        InputStream inputStream = new FileInputStream("D:\\FPT-Apech\\fptaptech-sem2\\fpt-aptech_sem2\\JAVA2\\data.txt");
        Reader reader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(reader);
        String message = "";
        int i=0;
        while ((message = bufferedReader.readLine())!=null){
            i++;
            System.out.println(message);
        }


    }
}
