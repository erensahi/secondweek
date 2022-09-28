package javaBootCamp2;

public class ClassMain {

	public static void main(String[] args) {
		CustomerMenager customerMenager = new CustomerMenager();
		CustomerMenager customerMenager2 = new CustomerMenager();
		
	    customerMenager=customerMenager2;
	    customerMenager.add();
	    customerMenager.delete();
	    customerMenager.update();
	    
	    
	    int sayi1=10;
	    int sayi2=20;
	    sayi2=sayi1;
	    sayi1=30;
	    System.out.println(sayi2);

	    int [] sayi3= {1,2,3};
	    int [] sayi4= new int[] {4,5,6};
	    sayi4=sayi3;
	    sayi3[0]=10;
	    System.out.println(sayi4[0]);

	}

}
