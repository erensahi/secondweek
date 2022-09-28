package javaBootCamp2;

public class Methods {

	public static void main(String[] args) {
		// int [] sayi = new int [] {1,2,4,6,7,8,9};
		sayiBulmaca();
		
				
	}
	 public static void sayiBulmaca() {
		 int [] sayi = {1,2,3,5,7,8,9,76};
	        int aranacakSayi =13;
	       boolean k=false;
	        
	        for(int deger: sayi){
	        	if (deger==aranacakSayi) {
	        		k=true;
	        		break;
	        	}
	        }
	        
	        if (k) {
	        	mesajVer("Aranan sayı dizide mevcuttur: "+aranacakSayi);
	        }
	        else {
	        	mesajVer("Aranan sayı dizide bulunmamaktadır: "+aranacakSayi);
            }
	 }
	 
	 public static void mesajVer(String mesaj) {
		 System.out.println(mesaj);
	 }
}
