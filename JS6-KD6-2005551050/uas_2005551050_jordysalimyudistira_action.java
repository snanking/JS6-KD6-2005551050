import java.util.Scanner;
public class uas_2005551050_jordysalimyudistira_action{

	public static void main(String[] args){

	for(String ulang = "y"; ulang.equals("y") || ulang.equals("Y");){

	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);

	int pilih;
	uas_2005551050_jordysalimyudistira uas = new uas_2005551050_jordysalimyudistira();

	System.out.println("====== Penjualan Erpan Serum ====== \n");
	System.out.println("1. Cek Stok");
	System.out.println("2. Penjualan");
	System.out.println("3. Data Vendor");
	System.out.println("4. Keluar");
	System.out.println("===========================");
	System.out.print("Silahkan Pilih : ");
		pilih = input.nextInt();

	switch(pilih){
		case 1:
		System.out.print("\n");
		uas.cekstok();
		break;

		case 2:
		System.out.println("\n===========================");
		uas.penjualan(20000);
		break;

		case 3:
		System.out.println("\n===========================");
		uas.vendor();
		break;

		case 4:
		System.exit(5);
		break;
		}

	System.out.print("\nApakah Anda Ingin Kembali? (Y/T) ");
		ulang = input.next();
	System.out.print("\n");
		}
		}
	}