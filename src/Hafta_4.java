import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hafta_4 {
	// G�zden ge�irme sorular� 
	// Soru 1
	// class, public, int, x, y, radius
	
	// Soru 2
/*
	 * public static void main(String[] args) { 
	 * double mil = 100; 
	 * double donusum = 1.609;
	 * double kilometre = (mil * donusum); System.out.print(kilometre);
	 * 
	 * }
 */
	
	// Soru 3 bu sorular� a'lar� int d'leri ise double alarak kontrol sa�layabilirsiniz.
	// Soru 4 ilk �ekli string kullanarak DRY ilkesine uygun olmayarak yaz�lm��t�r.
/*
	public static void main(String[] args) { 
		String bugun = "Sal�";
		String carsamba = "Car�amba";
		String persembe = "Per�embe";
		String cuma = "Cuma";
		String cumartesi = "Cumartesi";
		String pazar = "Pazar";
		String pazartesi = "Pazartesi";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ka� g�n sonra? = ");
		int kac_gun = scanner.nextInt();
		int art�k = kac_gun % 7;
		if (art�k == 0) {
			System.out.println(bugun);	
		}
		else if (art�k == 1) {
			System.out.println(carsamba);	
		}
		else if (art�k == 2) {
			System.out.println(persembe);	
		}
		else if (art�k == 3) {
			System.out.println(cuma);	
		}
		else if (art�k == 4) {
			System.out.println(cumartesi);	
		}
		else if (art�k == 5) {
			System.out.println(pazar);	
		}
		else if (art�k == 6) {
			System.out.println(pazartesi);	
		}
		
			
	}
*/
	// Soru 4 ikinci y�ntem  not = Burada arrayList y�ntemi kullan�lm��t�r 
	// e�er derste g�rmediyseniz kafan�z� kar��t�raca�� i�in bakmay�n
/*
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Sal�");
		list.add("�ar�amba");
		list.add("Per�embe");
		list.add("Cuma");
		list.add("Cumartesi");
		list.add("Pazar");
		list.add("Pazartesi");
		// Burada kodu uzatmamak ad�na sorudaki gibi bug�n�n sal� oldu�unu kabul edece�im
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ka� g�n sonra? = ");		
		int kac_gun = scanner.nextInt();
		int art�k = kac_gun % 7;		
		System.out.println(list.get(art�k));
		
		
		
		
	}
	*/
	// Soru 5-6 Sorumuzu en ba�ta mant�ksal olarak inceleyelim. 25/4 sorusunu kayan noktal� say� olarak bulmak istiyoruz.
	// �lk a��klamam�z gereken olay kayan noktal� say�n�n ne oldu�udur. Kayan noktal� say�lar� matematikteki
	// reel say�larla e�le�tirebiliriz. Yani bir de�i�kenin ba��na float yahut double yazd���m�zda say�n�n her zaman 
	// bir noktal� k�sm� olu�acakt�r.
	// Sorumuzu koda d�kelim ve inceleyelim.
/*
	public static void main(String[] args) {
		double a_25_d = 25;
		double b_4_d = 4;
		int a_25_i = 25;
		int b_4_i = 4;
		// Al�nabilinecek b�t�n ihtilalleri olu�turduk �imdi yukar�daki ifadelerin 25/4'� veren t�m olas�
		// ��kt�lar�n� olu�tural�m
		System.out.println(a_25_d/b_4_i); // 6.25
		System.out.println(a_25_d/b_4_d); // 6.25
		System.out.println(a_25_i/b_4_i); // 6
		System.out.println(a_25_i/b_4_d); // 6.25
		// Yukar�daki sonu�lara bakt���m�zda int / int b�l�m hari� b�t�n b�lme i�lemlerinde kayan noktal� say� 
		// �eklinde ��kt� al�r�z.
		
		
		
	}
*/
	// Soru 7 Sorumuzda verilen abcdr bilinmeyenlerini istedi�iniz say�larla doldurabilirsiniz
/*
	public static void main(String[] args) {
		double a, b, c, d, r;
		double istenen = (4 / (3 * (r + 34))) - (9 * (a + (b * c))) + ((3 + d *( 2 + a) ) / (a + (b * d)) );
	}
*/
	//Soru 8 m ve r yi int yani tamsay� de�erleri �zerinden al�yoruz. 
/*
	public static void main(String[] args) {
		int m = 3;
		int r = 5;
		int cevap = (m * (r*r));
		int cevap_2 = (int) (m * (Math.pow(r, 2)));
		// �ok ekstrem bir �ekilde bilgisayar�n yapt��� gibi yapal�m. Not: Bilgisayarlar 4 i�lem i�erisinde sadece toplama yapar.
		int r_toplam = 0;
		int toplam_toplam = 0;
		for (int i = 1; i <= r; i++) {
			r_toplam = r_toplam + r;
		}
		for (int a = 1; a <= m; a++) {
			toplam_toplam = toplam_toplam + r_toplam;
		}
		System.out.println(toplam_toplam);
		
				
				
	}
*/
	// Soru 9 Soruda int i ' ye de�er verilmesi gerekiyor int i = 0 gibi
	// Soru 10 i = 12 f = 12.5
	// Soru 12 ��kt�lar s�ras�yla b, c, -2 'dir.
	// Soru 13 print ile println aras�nda println'in sonundaki ln eklemesi new line (yeni sat�r) manas�na gelmektedir.
    // Soru 14 kodun do�ru yaz�lm�� hali a�a��da verilmi�tir ��kt�s� hepsini Stringin harflerini b�y�k harflere �evir.
/*
	public static void main(String []args){
        String cumle="Merhaba JaVa";
        cumle = cumle.toUpperCase();
        System.out.println(cumle);
     }
*/
	// Soru 15 noprs ��kt�s�n� verir
}












