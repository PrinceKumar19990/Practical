package ArrayEG;

public class ArraySum {
	public static void main(String[] args) {
	int sum = 0;
	 int Num_array[] = {1,2,4,6,4};
	 for (int i:Num_array) {
     sum +=i;
     System.out.println(" The sum is "+sum);
	}
	// calculate the average value
	  double average = sum/Num_array.length;
	     System.out.println("Average value of the array elemenmt is:"+average);
}}
