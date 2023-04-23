package ArrayEG;
import java.util.Arrays; 
public class ArrayToString {
	public static void main(String[] args){   
	    
	    int Num_Array[] = {1,4,3,7,8,5,3,7,9,6,};
	    String str_Array[] = {"A","D","C","F","E","H","G",};      
	    
	    System.out.println("Original numeric array : "+Arrays.toString(Num_Array));
	    Arrays.sort(Num_Array);
	    System.out.println("Sorted numeric array : "+Arrays.toString(Num_Array));
	    System.out.println("--------------------------------------------------------------");
	    System.out.println("Original numeric array : "+Arrays.toString(str_Array));
	    Arrays.sort(str_Array);
	    System.out.println("Sorted numeric array : "+Arrays.toString(str_Array));
	    }}