import java.util.Scanner;
	public class TUGAS{
		public static void main (String args []){
 
	Scanner id=new Scanner(System.in);
 	double alas,tinggi,luas,sisimiring,keliling;
	
	HitungLagi();
	
	
	public static void hitungLagi(){
		
		int menu;
		System.out.println("\n\nPilihan Menu");
		System.out.println("1. Menghitung Luas jajargenjang");
		System.out.println("2. Menghitung Keliling Jajargenjang");
		
		System.out.print("Masukan Kode : ");
		
		menu = id.nextInt();
		switch(menu){
			case 1:
		System.out.println("==========SELAMAT DATANG==========");
		System.out.println("===MENGHITUNG LUAS JAJARGENJANG===");
	

		//Rumus menghitung luas jajargenjang
		System.out.print("Masukkan alas : ");
		alas = id.nextDouble();
	
		System.out.print("Masukkan tinggi : ");
		tinggi = id.nextDouble();
	
		luas=alas*tinggi;
		System.out.println("Luas Jajargenjang : "+luas);
		MenghitungLagi();
		break;

			case 2:
		System.out.println("==========SELAMAT DATANG==========");
		System.out.println("===MENGHITUNG KELILING JAJARGENJANG===");
	
	

		//Rumus menghitung keliling jajargenjang
		System.out.println("Masukkan alas : ");
		alas = id.nextDouble();

		System.out.println("Masukkan Sisi miring : ");
		sisimiring = id.nextDouble();

		keliling=(2*alas)+(2*sisimiring);

		System.out.println("Keliling Jajargenjang  : "+keliling);
		MenghitungLagi();
		}

		public static void MenghitungLagi(){
		System.out.println("menghitung Lagi?\n\n1. Untuk Menghitung Lagi\n2. Untuk Keluar");
		System.out.print("Masukan Kode : ");
		MenghitungLagi = id.nextInt();
		if (MenghitungLagi == 1){
			HitungLagi();
		} else if (MenghitungLagi == 2){
			System.out.println("HAVE A NICE DAY");
		} else {
			System.out.print("Kode Yang Anda Masukan Salah\n\n");
			MenghitungLagi();
		}
	

		
		}

		
	}

}



