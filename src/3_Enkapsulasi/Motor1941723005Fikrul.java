public class Motor1941723005Fikrul {
	private int kecepatan = 0;
	private boolean kontakOn = false;
	
	public void nyalakanMesin(){
		kontakOn = true;
	}
	public void matikanMesin(){
		kontakOn = false;
		kecepatan = 0;
	}
	public void tambahKecepatan(){
		if (kontakOn == true ){
			kecepatan += 5;
		}
		else{
			System.out.println("Kecepatan tidak bisa bertambah karena Mesin Mati! \n");
		}
	}
	public void kurangiKecepatan(){
		if (kontakOn == true){
			kecepatan -= 5;
		}
		else{
			System.out.println("Kecepatan tidak bisa berkurang karena Mesin Tidak Aktif! \n");
		}
	}
	public void printStatus(){
		if (kontakOn == true){
			System.out.println("Kontak On");
		}
		else{
			System.out.println("Kontak Off");
		}
		System.out.println("Kecepatan " + kecepatan +"\n");
		
		if (kontakOn == true && kecepatan>100){
			System.out.println("Anda sudah mencapai batas maksimum kecepatan (100), Kecepatan anda: " +kecepatan);
		}
	}
}