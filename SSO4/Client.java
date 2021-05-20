

public class Client {
    public static void main(String args[]) {
        Student studentA = new Student();
        Student studentb = new Student(1,"Hoang van anh ", true);

        studentb.printInfo();
        studentb.setName("Nguyen van B");
        studentb.printInfo();
    }
}
