package javaBootCamp2;

public class AttMain {

	public static void main(String[] args) {
		// video 31-32-33-34, bu videolarda bahsedilen kodlar aynı proje ve ayrı sınıflar içerinde birleştirilmiştir.
		
				Product1 product=new Product1();
				Product1 product2=new Product1(2,"smart phone","Samsung smart phone",5500,6,"kırmızı");
				product.setId(1);
				product.setName("Laptop");
				product.setDescription("Asus Leptop");
				product.setPrice(5000);
				product.setStockAmount(3);
				product.setRenk("siyah");
				
			

				
				ProductMenager productMenager=new ProductMenager();
				productMenager.add(product);
				System.out.println(product.getKod());
			}
	}


