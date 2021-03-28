import java.sql.SQLOutput;
import java.util.Scanner;
public class uas_2005551050_jordysalimyudistira{

	int stokawal = 100;
	String kodevendor;
	Scanner input = new Scanner(System.in);

	void penjualan(int hargabarang){
		int jumlahbeli;
		int uanganda, kembali;
		System.out.print("Masukkan jumlah beli : ");
			jumlahbeli = input.nextInt();
		int totalbayar= jumlahbeli * hargabarang;
		System.out.print("Input uang anda: Rp.");
			uanganda = input.nextInt();
			kembali = uanganda - totalbayar;
		if(uanganda < totalbayar){
			System.out.print("Uang anda kurang.");}else{
				System.out.println("Total bayar: Rp."+ totalbayar);
				System.out.println("Kembalian: Rp."+ kembali);}
		}

	void vendor(){
		System.out.print("Input kode vendor(A001, B001, C001) : ");
			kodevendor = input.next();
		String namavendor;

		switch(kodevendor){
			case "A001" :
			namavendor = "Cussons";
			break;

			case "B001" :
			namavendor = "Mustika Ratu";
			break;

			case "C001" :
			namavendor = "Purbasari";
			break;

			default :
			namavendor = "Vendor Baru";
			break;
			}
		System.out.println("Nama Vendor: "+namavendor);
		}

	void cekstok(){
		System.out.println("Stok Awal: "+stokawal);
		}
	}