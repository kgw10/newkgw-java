package java0712;

public class Asset {

    private String bank;
    private String accountNum;
    private String holder;
    private int balance;

    public Asset(String bank, String accountNum, String holder, int balance) {
        this.bank = bank;
        this.accountNum = accountNum;
        this.holder = holder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return bank + "(" + accountNum + "), " + holder + ", " + balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
}