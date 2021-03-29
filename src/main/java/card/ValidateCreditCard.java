package card;

public class ValidateCreditCard {

	public static void main(String[] args) {
		
		String input="4180210000829688";
		System.out.println(ValidateCreditCardNumber(input));

	}
public static boolean ValidateCreditCardNumber(String input) {
	//convert input to Int
	int [] creditCardInt = new int [input.length()];
	
	for (int i=0;i<input.length(); i++)
	{
		creditCardInt[i] = Integer.parseInt(input.substring(i,i+1));
				
	}
	//starting from the right, double each other digit, if greater than 9 mode 10 add +1 to the reminder
	for (int i=creditCardInt.length - 2; i>=0;i=i-2)	
	{
		int tempValue = creditCardInt[i];
		tempValue = 2*tempValue;
		if (tempValue > 9) 
		{
			tempValue = tempValue % 10 +1;
		}
		
		creditCardInt[i]=tempValue;
	}
	//Add up all digits
	int sum =0;
	for (int i=0;i<creditCardInt.length; i++)
	{
		sum += creditCardInt[i];
	}
	//if the number is multiple of 10 it is valid
	 if (sum % 10 == 0)
	 { return true;}
	 else
	{ return false;}
}

}
