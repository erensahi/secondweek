package javaBootCamp2;

public class Methods2 {

	public static void main(String[] args) {
		String sehir=sehirVer();
		System.out.println(sehir);
		int toplam=topla(5,7);
		System.out.println(toplam);
		System.out.println(sehir.substring(0, 2));
		int k=toplama(2,3,4,5,6,7,8);
		System.out.println(k);

	}

	public static void ekle() {
		
	}
	public static void sil() {
		
	}
	public static void guncelle() {
		
	}
	public static int topla(int a,int b) {
		return a+b;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	public static int toplama(int...sayilar) {
		int toplam2=0;
		for (int sayi:sayilar)
		{  toplam2=toplam2+sayi;
	}
		return toplam2;
}
}
