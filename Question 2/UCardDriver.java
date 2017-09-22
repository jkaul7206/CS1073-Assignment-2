public class UCardDriver {

    public static void main(String[] args) {


        UCard sarahsUCard = new UCard("Sarah Flynn",12345);
        sarahsUCard.addBalance(85.00);

        UCard johnsUCard = new UCard("John Smith",67812);

        UCard alexsUCard = new UCard("Alex Blair",99223);
        alexsUCard.addBalance(50.00);
        
        UCard janesUCard = new UCard("Jane Mills",55256);
        janesUCard.addBalance(35.50);
        janesUCard.addBalance(100.00);
        
        johnsUCard.addBalance(60.75);
        johnsUCard.makePurchase(12.75,0.10);
        
        alexsUCard.makePurchase(18.95,0.10);
        alexsUCard.addBalance(80.00);
        
        sarahsUCard.addBalance(60);
        sarahsUCard.makePurchase(32.75,0.25);
        
        janesUCard.makePurchase(54.75,0.20);
        
        alexsUCard.makePurchase(36.50,0.20);
        
        System.out.println("");
        System.out.println("Student: " + sarahsUCard.getName()
                           + "\n[Student Number: " + sarahsUCard.getNumber()
                           + "\nAccount Balance: " + sarahsUCard.getBalance()
                           + "\nTotal Saved: " + sarahsUCard.getSaved() + "]\n");
        
        System.out.println("Student: " + johnsUCard.getName()
                           + "\n[Student Number: " + johnsUCard.getNumber()
                           + "\nAccount Balance: " + johnsUCard.getBalance()
                           + "\nTotal Saved: " + johnsUCard.getSaved() + "]\n");
        
        System.out.println("Student: " + alexsUCard.getName()
                           + "\n[Student Number: " + alexsUCard.getNumber()
                           + "\nAccount Balance: " + alexsUCard.getBalance()
                           + "\nTotal Saved: " + alexsUCard.getSaved() + "]\n");
        
        System.out.println("Student: " + janesUCard.getName()
                           + "\n[Student Number: " + janesUCard.getNumber()
                           + "\nAccount Balance: " + janesUCard.getBalance()
                           + "\nTotal Saved: " + janesUCard.getSaved() + "]\n");
    }
}
