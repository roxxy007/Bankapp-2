public class HDFCAccount implements BankAccount{

    private int balance ;

    public HDFCAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public Boolean withdrawMoney(int money) {
        if (this.balance >= money) {
            this.balance = this.balance - money;
            return true;
        }
        return false ;
    }
}
