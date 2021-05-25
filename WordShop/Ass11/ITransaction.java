public interface ITransaction {
    public void checkBanlce(String accountNumber);
    public void depositCash(String accountNumber , double amount);
    public void withdrawCash(String accountNumber,double amount);
}
