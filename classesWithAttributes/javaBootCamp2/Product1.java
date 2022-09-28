package javaBootCamp2;

public class Product1 {
	public Product1(int id,String name,String description,double price,int stockAmount,String renk) {
		  System.out.println("Yapıcı metod çalıştırıldı." + "Bu "+description +" ürünü " +price +" liradır. ");
		  this.id=id;
		  this.name=name;
		  this.description=description;
		  this.price=price;
		  this.stockAmount=stockAmount;
		  this.renk=renk;
		  
	  }
	
	  // attribute || field
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
    String renk;
    String kod;
    
    
    public Product1 (){
  	  System.out.println("Hello world!");
  	  
    }
	
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0, 1) + id +" "+renk;
	}
}
