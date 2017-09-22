/**
This class makes two unique phone cards
@author Justin Kaulback
*/


public class PhoneCardDriver {

	public static void main(String[] args) {

		PhoneCard phoneCard1 = new PhoneCard("Mabel Gilbert", 0.50);
		PhoneCard phoneCard2 = new PhoneCard("Jenson Miller", 0.40);

		phoneCard1.addFunds(50);
		phoneCard2.addFunds(80);

		phoneCard1.subtractFunds(32);
		phoneCard2.subtractFunds(113);

		System.out.println("");

		System.out.println("Customer: " + phoneCard1.getCustomerName());
		System.out.println("[Calling Rate: " + phoneCard1.getTalkRate()
				  + "\nFunds Available: " + phoneCard1.getCardFunds()
				  + "]\n");

		System.out.println("Customer: " + phoneCard2.getCustomerName());
		System.out.println("[Calling Rate: " + phoneCard2.getTalkRate()
				  + "\nFunds Available: " + phoneCard2.getCardFunds()
				  + "]\n");


	}

}
