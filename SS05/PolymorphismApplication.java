 import java.util.Arrays;
import java.util.List;
public class PolymorphismApplication {
    void sort(int[] list){
        Arrays.parallelSort(list);
        System.out.println("Array after sort : " +Arrays.toString(list));
    }

    void sort(String[] name){
        Arrays.parallelSort(name);
        System.out.println("String Array after sort : " + Arrays.toString(name));
    }

    public static void main(String[] args) {
        PolymorphismApplication polymorphismApplication = new PolymorphismApplication();
        int list [] = {6,3,9,12,50};
        
        
        polymorphismApplication.sort(list);
        String name[] = {"hoang anh","Thinh"};
        polymorphismApplication.sort(name);

    }
}
