package SS06;

class ArthimeticExceptionApp {
    public static void main(String[] args) {
        try {

            int a = 50, b=0;
            int result = a/b;
            System.out.println(result);
            
        } catch (ArithmeticException e) {
            //TODO: handle exception

            System.out.println("Loi");
        }
    }
}
