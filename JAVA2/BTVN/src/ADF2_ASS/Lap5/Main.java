package ADF2_ASS.Lap5;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static List<Student> studentList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//    Student std1 = new Student();
//        std1.input();
//        std1.display();
        int choose;
        do{
            showMenu();
            choose = input.nextInt();
            switch (choose){
                case  1 : {
                    inputSudent();
                    break;
                } case  2 : {
                    for(Student student : studentList){
                        student.display();
                    }
                    break;
                }
                case  3: {
                    saveFile();
                    break;
                }
                case  4 : {
                    readFile();
                    break;
                }
                default: {
                    System.out.println("Nhap sai");
                    break;
                }
            }
        }while (choose != 5);

    }

    static  void showMenu(){
        System.out.println("1 . Them sinh vien");
        System.out.println("2 . thong tin sin vien");
        System.out.println("3 . Lua thong tin vao file student.txt");
        System.out.println("4. Doc not dung sinh vien tu student.txt");
        System.out.println("5 . exit ");
    }

    private static  void inputSudent(){
        System.out.println("Nhap so sinh vien can nhap");
        int n = input.nextInt();
        for(int i=0; i < n; i++){
            Student std = new Student();
            std.input();
            studentList.add(std);
         }

    }

    private  static void saveFile(){
        System.out.println("Lua File : ");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("student.txt",true);

            //lua du lieu
            for(Student student : studentList){
                String line = student.getFileLine();
                byte[] b = line.getBytes();
                fos.write(b);

            }
        }catch (FileNotFoundException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
        }catch (UnsupportedEncodingException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
        }catch (IOException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);

        }finally {
            if(fos != null){
                try {
                    fos.close();
                }catch ( IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);

                }
            }
        }
    }

    public static  void readFile(){
    FileInputStream fis = null;
    InputStreamReader reader = null;
    BufferedReader bufferedReader = null;
    try {
        fis = new FileInputStream("student.txt");

        reader = new InputStreamReader(fis);

        bufferedReader = new BufferedReader(reader);
        String line = null;


        while ((line = bufferedReader.readLine()) !=null){
                if(line.isEmpty()){
                    continue;
                }
                Student std = new Student();
               // std.parse(line);
                studentList.add(std);
        }
    }catch (FileNotFoundException e){
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
    }catch (IOException e){
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);

    }finally {
        if(fis != null){
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
        if(reader != null){
            try{
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }

        if(bufferedReader != null){
            try{
                bufferedReader.close();
            }catch (IOException e){
e.printStackTrace();
            }

        }
    }


    }
}
