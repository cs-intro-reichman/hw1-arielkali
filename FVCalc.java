// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// save variables
		int current_value = Integer.parseInt(args[0]);
		double rate_precentage = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		// caculate data
		double future_value = current_value * Math.pow((1+rate_precentage),years);
		// print data
		System.out.println("After " + years + ", " + current_value + "$ saved at " + rate_precentage + "% will yield " + (int) future_value + "$" );


	}
}