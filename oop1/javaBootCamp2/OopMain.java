package javaBootCamp2;


public class OopMain {

	public static void main(String[] args) {

		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		// set value
		product1.setName("Demonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("bilmemne.jpg");

		         // get value
		//System.out.println(product1.name);
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitInStock(4);
		product2.setImageUrl("bilmemne2.jpg");
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(6);
		product3.setUnitPrice(6000);
		product3.setUnitInStock(4);
		product3.setImageUrl("bilmemne3.jpg");
		
		Product [] products= {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) 
		{
			System.out.println("<li>" +product.getName() + "/<li>");	
		}
		System.out.println("</ul>");
		
		IndivudualCustomer indivudualCustomer =new IndivudualCustomer();
		indivudualCustomer.setId(1);
		indivudualCustomer.setCustomerNumber("12345");
		indivudualCustomer.setPhone("05334677157");
		indivudualCustomer.setFirstName("Eren");
		indivudualCustomer.setLastName("Şahin");
		
		CorporateCustomer corporateCustomer =new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("05246776612");
		corporateCustomer.setTaxNumber("11111111111");
		
		Customer [] customers = {indivudualCustomer,corporateCustomer}; 

	}

}

