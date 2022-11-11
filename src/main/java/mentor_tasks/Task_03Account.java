package mentor_tasks;

public class Task_03Account {
    int accountNumber; // müşteri hesap no
    private double balance; // bakiye
    private static int Number = 1; // otomatik verilecek sayac
    public Task_03Account() {
        this.accountNumber = Number++;
    }
    public void deposit(double incomeMoney) // gelen para
    {
        this.balance += incomeMoney;
    }
    public void withdraw(double outcomeMoney) // giden para
    {
        if (outcomeMoney > 5000)
            throw new RuntimeException("Günlük Limiti aştınız");
        if (outcomeMoney > this.balance)
            throw new RuntimeException("Yetersiz Bakiye..");
        this.balance -= outcomeMoney;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
}

