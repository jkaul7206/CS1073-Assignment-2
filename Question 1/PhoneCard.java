/**
*This class represents a pre-paid phone card.
*@author Leah Bidlake
*/
public class PhoneCard{

	/**
	*The name of the customer.
	*/

	private String customerName;

	/**
	*The cost of calling (in dollars/min).
	*/

	private double talkRate;

	/**
	*The amount of funds on the pre-paid card (in dollars).
	*/

	private double cardFunds = 0.00;

	/**
	*This method constructs a pre-paid phone card with the customer, and the calling rate.
	*There are no funds on the phone card initially.
	*@param nameIn The name of the customer.
	*@param talkRateIn The calling rate (in dollars/min).
	*/

	public PhoneCard(String nameIn, double talkRateIn) {

		customerName = nameIn;
		talkRate = talkRateIn;

	}

	/**
	*This method retrieves the name of customer.
	*@return The name of the customer.
	*/

	public String getCustomerName () {

		return customerName;

	}


	/**
	*This method retrieves the calling rate.
	*@return The calling rate (in dollars/min).
	*/

	public double getTalkRate() {

		return talkRate;

	}

	/**
	*This method retrieves the amount of funds on the card.
	*@return The current amount of funds on the card (in dollars).
	*/

	public double getCardFunds() {

		return cardFunds;

	}

	/**
	*This method makes a call on the phone for a certain amount of time,
	*reducing the amount of funds left on the card.
	*You may assume that the customer will never use more funds then is available on the card
	*(you do NOT need to include a check for this in your solution).
	*@param talkTime The calling time (in min).
	*/

	public void subtractFunds(double talkTime){

		cardFunds -= talkRate * talkTime;

	}

	/**
	*This method adds funds to the pre-paid card.
	*@param fundsAdded The funds added to the card (in dollars).
	*/

	public void addFunds(double fundsAdded) {

		cardFunds += fundsAdded;

	}
} //end PhoneCard
