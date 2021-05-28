import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import jdk.jfr.Percentage;

import java.util.Scanner;
import java.util.ArrayList;




public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> markList = new ArrayList<Integer>();

        System.out.println("Enter the number of sucjects");
        int size = input.nextInt();
        System.out.println("Enter the marks for each subject(<=100)");
        for(int i =0 ;  i<size; i++){
            markList.add(input.nextInt());
        }
        System.out.println("Displaying all the marks");
        sortMarks(markList, m-> true);
        System.out.println("Displaying the marks <60");
        sortMarks(markList, m-> m<60);
        System.out.println("Displaying the marks >= 60 && < 70");
        sortMarks(markList, m-> m>=60 && m<70);
        System.out.println("Displaying the marks >= 70 && < 80");
        sortMarks(markList, m-> m>= 70&& m<80);
        System.out.println("Displaying the marks >= 80 && < 100");
        sortMarks(markList, m-> m>= 80 && m<100);
        System.out.println("Sorting the  even marks");
        sortMarks(markList,m-> m%2==0);
        System.out.println("Souting the odd marks");
        sortMarks(markList,m-> m%2!=0);
    }

    public  static void sortMarks(List<Integer> list, Predicate<Integer> predicate ){
        System.out.println("Marks List");
        for(Integer m:list){
            if(predicate.test(m)){
                System.out.println(m+ " ");
            }
        }
    }
}
