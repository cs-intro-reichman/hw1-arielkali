// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// takes num from args
		int lim = Integer.parseInt(args [0]);
		//generate 3 random numbers
		int rand_num_1 = (int) (Math.random() * (lim+1));
		int rand_num_2 = (int) (Math.random() * (lim+1));
		int rand_num_3 = (int) (Math.random() * (lim+1));

		//calc max min and middle

		int max = Math.max(Math.max(rand_num_1, rand_num_2),rand_num_3);
		int min = Math.min(Math.min(rand_num_1, rand_num_2),rand_num_3);
		int temp1 = Math.max(rand_num_1, rand_num_2);
		int temp2 = Math.max(rand_num_3, rand_num_2);
		int temp3 = Math.max(rand_num_1, rand_num_3);
		int middle = Math.min(Math.min(temp1, temp2),temp3);

		System.out.println(rand_num_1 + " " + rand_num_2 + " " + rand_num_3);
		System.out.println(min + " " + middle + " " + max);

		
	}
}
