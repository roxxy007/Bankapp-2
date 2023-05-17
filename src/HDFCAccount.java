import java.util.UUID;

public class HDFCAccount implements BankAccount{


    private int balance ;
    private int roi; // 5% =5
    private String accountNo;


    public HDFCAccount(int balance) {
        this.balance = balance;

        this.accountNo = String.valueOf(UUID.randomUUID());
        this.roi=5;
    }

    public HDFCAccount(int balance, int roi) {
        this.balance = balance;
        this.roi = roi;
         this.accountNo = String.valueOf(UUID.randomUUID());        

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
        return false;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    @Override
    public Boolean addMoney(int money) {
        this.balance += money;
        return true;

    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int getROI() {
        return roi;
    }

    @Override
    public int getTotalIntrest(int amount, int TimeInYears) {
        return ((amount * TimeInYears * roi)/100);
    }

    // min balance =500
    // roi should be depended on age
    // more age more roi

}
