package Array;

public class SumValeOfArray {

	public static void main(String[] args) {
		int student_php[]= { 1, 2, 3,4,5,6,};
       int sum = 0;
       
       for (int i : student_php)
    	   sum += i;
       System.out.println(" The sum of array"+" "+ sum);
	}

}
