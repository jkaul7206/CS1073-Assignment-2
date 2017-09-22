public class UCard {

    private String studentName;
    private int studentNumber;
    private double balance = 0.00;
    private double saved = 0.00;

    public UCard(String nameIn,int studentNumberIn) {
        name = nameIn;
        studentNumber = studentNumberIn;
    }

    public String getName() {
        return studentName;
    }

    public int getNumber() {
        return studentNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getSaved() {
        return saved;
    }

    public addBalance(double toAdd) {
        balance += toAdd;
    }

    public makePurchase(double netCost,double discount) {
        saved += netCost * discount
        balance -= netCost * (1 - discount)
    }



}
