public interface BankAccount {

    //withdraw money
    // check balance
    // add money
    // get rate of intrest
    // get total intrest


    Boolean withdrawMoney(int money);

    Boolean addMoney(int money);

    int checkBalance();
    int getROI();
    int getTotalIntrest(int amount , int TimeInYears);



}
