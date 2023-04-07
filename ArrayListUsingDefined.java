package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListUsingDefined {
public static void main(String[] args) {
	Bank b= new Bank(12345,"Mamta", 50000.64,20);
	Bank b1= new Bank(12354,"Kiran", 7000.64,51);
	Bank b2= new Bank(12453,"sam", 5400.64,41);
	Bank b3= new Bank(13452,"ramesh", 4000.64,31);
	Bank b4= new Bank(23451,"geeta", 8000.64,54);
	Bank b5= new Bank(2345,"pooja", 9000.64,26);
	
	ArrayList<Bank> al= new ArrayList<Bank>();
	al.add(b);
	al.add(b1);
	al.add(b5);
	al.add(b3);
	al.add(b2);
	al.add(b4);
	
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		Bank obj =(Bank) itr.next();
		System.out.println(obj.accountNo+""+obj.CostumerName+" "+obj.balance+" "+obj.age);
		
	}

	
}
}