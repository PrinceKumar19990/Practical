package Array;
import java.util.*;
public class IndexOfAnArray {
public static void main(String[] args) {
Scanner Sc = new Scanner(System.in);
System.out.print("Enter your number: ");
int number = Sc.nextInt();

int[] a = {4, 5, 3, 1, 9, 8};
System.out.println("Index position of " + number + " is " + indexCheck(a, number));
}
public static int indexCheck(int[] a, int number) {
for(int i = 0; i < a.length; i++) {
if(a[i] == number) {
return i;
}
}
return -1;
}}