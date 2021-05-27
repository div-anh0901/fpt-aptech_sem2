import java.util.Scanner;

public class UncheckedException {
    
    public UncheckedException(){

    }

    public static void main(String[] args){
        int i ,n=2 ;
        int a[] = new int[n];
        Scanner sc = new Scanner(System.in);

        for(i =0; i<=n ;i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
    }

}
/*
✔ Compile and run the test class.
✔ How many Exceptions may occur in the above code?
có 1 ngoại lê sảy ra ở đoạn mã trên
✔ Please correct the above code to be able to catch every Exception that.

*/