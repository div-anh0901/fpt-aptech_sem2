

public class Client {
     public Client(){

     }

     public void doUnchecked(String value){
         int result = canThrowUncheckerException(value);
         System.out.println("result =" + result);
     }

     private int canThrowUncheckerException(String value){
         return Integer.parseInt(value);
     }


    public void doChecked(){
        try {
            canThrowUncheckerException();
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private int canThrowUncheckerException() throws Exception{
        throw new Exception("Failse");
    }
    
    public static void main(String[] args) {
      Client client = new Client();
      client.doUnchecked("49");
        client.doChecked();
   
    }
    
}

/*
 Distinguishing unchecked Checked Exception and Exception?
-) unchecked Exeption :Còn đối với unchecked exception, việc xác định có exception xảy ra hay không chỉ có thể thực hiện ở thời điểm runtime, và các IDE sẽ không giúp chúng ta xác định được chuyện đó
việc kiểm tra được thực hiện ngay thời điểm compile time, một số IDE sẽ giúp chúng ta bằng cách hiển thị lỗi cú pháp nếu ta gọi một method throw ra bất kỳ checked exception nào mà không được catch
-) Exception : 


● Using Checked Exception and use unchecked Exception?

-)  Checked Exception: sử dụng từ khoá throws đẩy lên cho method tầng trên xử lý
,Sử dụng từ khoá throws liệt kê tất cả các exception có thể xảy ra bên trong method.
-) Bắt buộc chúng ta phải thêm các điều kiện để kiểm tra dữ liệu nhầm đảm bảo chương trình chạy đúng cho mọi trường hợp. 
● Why should not catch (Exception ex)?
    Bởi vì khi bạn bắt được ngoại lệ, bạn phải xử lý nó đúng cách . Và bạn không thể mong đợi xử lý tất cả các loại ngoại lệ trong mã của mình. Ngoài ra, khi bạn nắm bắt tất cả các ngoại lệ, bạn có thể nhận được một ngoại lệ không thể xử lý và ngăn mã nằm trên ngăn xếp để xử lý nó đúng cách.
*/