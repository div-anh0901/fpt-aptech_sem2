public class MoreClass{

public static void main(String[] args) {
    Object obj1 = new Object();

    System.out.println(obj1);

    Object obj2 = new Object(){
        public String toString(){
            return "this is obj2";
        };
    };

    System.out.println(obj2);

}

}

/*
Compile and run the test class has written.
✔ Why System.out.println(obj1); could be displayed?

✔ What&#39;s the difference between two objects obj1 and obj2?
*/