public class Q2{
    public static void main(String[] args) {
        bankAccount newAccount = new bankAccount(33000, 6.7);
        System.out.println(newAccount.displayInfo());
    }

}
class bankAccount{
    static int count = 0;
    private int id;
    private double balance;
    private double annualInterestRate;

    public bankAccount(double balance, double annualInterestRate){
        setValues(balance, annualInterestRate);
    }

    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }

    public int getId(){ return id; }
    public double getBalance(){ return balance; }
    public double getAnnualInterestRate(){ return annualInterestRate; }
    public double getMonthlyInterest(){ return (annualInterestRate/1200) * balance; }

    public void setValues(double b, double a){
        count += 1;
        id = count; //unsure if this is what the instructions were asking
        balance = b;
        annualInterestRate = a;
    }

    public String displayInfo(){
        return ("Account ID: " + this.getId() + "\nCurrent Balance: " + this.getBalance() + "\nAnnual Interest Rate: " + this.getAnnualInterestRate() + "%\nMonthly Interest Rate: " + (this.getAnnualInterestRate()/12) + "%\nMonthly Interest: " + this.getMonthlyInterest());
    }
}