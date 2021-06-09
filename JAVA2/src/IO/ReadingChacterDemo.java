package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingChacterDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader =  new BufferedReader(inputStreamReader);
        try{
            String str = "";
            str = bufferedReader.readLine();

            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
