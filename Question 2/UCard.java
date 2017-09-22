/**
This is the class definition for the object 'UCard' which will
be used to track several attributes to be defined later on.
@author Justin Kaulback
*/
public class UCard {

    /**
    The name of the student.
    */
    
    private String studentName;
    
    /**
    The student's unique Student Number.
    */
    
    private int studentNumber;
    
    /**
    The balance left on the card (in dollars).
    */
    
    private double balance;
    
    /**
    The total money saved off discounts (in dollars).
    */
    
    private double saved;
    
    
    /**
    This constructor method creates a UCard object with the student name 
    and student number.
    The balance and money saved have nothing initially.
    @param nameIn The name of the student.
    @param studentNumberIn The students Student Number.
    */
    public UCard(String nameIn,int studentNumberIn) {
        studentName = nameIn;
        studentNumber = studentNumberIn;
        balance = 0.00;
        saved = 0.00;
    }
    
    /**
    This method shows the students name.
    @return The students name.
    */
    public String getName() {
        return studentName;
    }

    /**
    This method shows the students number.
    @return The students number.
    */
    public int getNumber() {
        return studentNumber;
    }

    /**
    This method shows the balance left on the card.
    @return The balance on the card.
    */
    public double getBalance() {
        return balance;
    }

    /**
    This method shows the total money saved using the card.
    @return The total savings.
    */
    public double getSaved() {
        return saved;
    }

    /**
    This method adds money to the total balance.
    @param toAdd The money added (in dollars).
    */
    public void addBalance(double toAdd) {
        balance += toAdd;
    }

    /**
    This method takes in a total purchase amount, adding the money saved
    to the total savings, and subtracting the discounted amount from the
    total balance.
    @param netCost The total cost of the purchase.
    @param discount The percent value of a discount of the purchase.
    */
    public void makePurchase(double netCost,double discount) {
        saved += netCost * discount;
        balance -= netCost * (1 - discount);
    }



}
