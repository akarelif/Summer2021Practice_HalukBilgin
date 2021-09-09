package proje6_depo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Met01 extends V01{
	Scanner scan = new Scanner (System.in);
	
	List<V01> urun = new ArrayList<>();
	//HashMap< Integer,String> urunmap= new HashMap<>();
	
	String secim;
	int count=100;
	
	
	//====================================================================================
	public List<V01> urunTanimlama(){
		System.out.println("====URUN TANIMLAMA====");
		do {
			scan.nextLine();
			System.out.print("�R�N �SM� : ");
			String name = scan.nextLine();
			super.setUrunAdi(name);			
						
			System.out.print("�RET�C� �SM� : ");
			String producer=scan.nextLine();
			super.setUretici(producer);
			
			System.out.print("B�R�M : ");
			String unit = scan.next();
			super.setBirim(unit);
			super.setId(count++);
			V01 objv =new V01(super.getId(), super.getUrunAdi(), super.getUretici(), super.getMiktar(), super.getBirim(), super.getRaf());
			urun.add(objv);
			
			
			System.out.println("------------------------------------");
			System.out.println(objv.getId()+"\t"+objv.getUrunAdi()+"\t"+objv.getUretici()
								+"\t"+objv.getMiktar()+"\t"+objv.getBirim()+"\t"+objv.getRaf());
			System.out.println("------------------------------------");
			System.out.println("�R�N�N�Z BA�ARILI B�R �EK�LDE EKLENM��T�R. BA�KA B�R �R�N EKLEMEK �STER M�S�N�Z? (E/H)");
			secim=scan.next();	
			
			
			
		} while (secim.equalsIgnoreCase("E"));
		System.out.println("ANA MENUYE Y�NLEND�R�L�YORSUNUZ.");
		return urun;
		
	}
	//====================================================================================
	public void urunListele() {
		System.out.println("====URUN L�STES�====");
		for (V01 each : urun) {
			System.out.println(each.getId()+"\t"+each.getUrunAdi()+"\t"+each.getUretici()
		+"\t"+each.getMiktar()+"\t"+each.getBirim()+"\t"+each.getRaf());
			
			
		}
	}
	//====================================================================================
	public List<V01> urunGirisi() {
		urunListele();
		System.out.println("====URUN G�R�� EKRANI====");
		
		System.out.println("URUN ID : ");
		int urunNo= scan.nextInt();
		System.out.println("URUN M�KTARI : ");
		int urunmiktar�= scan.nextInt();
		
		for (V01 each : urun) {
			if (each.getId()==urunNo) {
				each.setMiktar(each.getMiktar()+urunmiktar�);
			}
		}
		
		return urun;
		
		
		
	}
	//====================================================================================
	public void urunuRafaKoy() {
		urunListele();
		System.out.println("====URUN RAF G�R�� EKRANI====");
		System.out.println("URUN ID : ");
		int urunNo= scan.nextInt();
		System.out.println("URUN RAFI : ");
		String urunrafi= scan.next();
		
		for (V01 each : urun) {
			if (each.getId()==urunNo) {
				each.setRaf(urunrafi);
				
			}
		}
		
	}
	//====================================================================================
	public void urunCikisi() {urunListele();
	System.out.println("====URUN �IKI� EKRANI====");
	
	System.out.println("URUN ID : ");
	int urunNo= scan.nextInt();
	System.out.println("URUN M�KTARI : ");
	int urunmiktar�= scan.nextInt();
	
	for (V01 each : urun) {
		if (each.getId()==urunNo) {			
			if (each.getMiktar()>0 && urunmiktar�<=each.getMiktar()) {
				each.setMiktar(each.getMiktar()-urunmiktar�);
			}
		}
	}
		
		
	}
	//====================================================================================
}
