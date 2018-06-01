package pl.urbanski.notowaniagieldowe.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menedzer {

	private List<Spolka> spolki;
	
	public Menedzer() {
		spolki = new ArrayList<>(3);
		Date d = new Date();
		
		spolki.add(new Spolka("Kocia spolka weglowa", "KSW", "energetyczny", 20.0, 11.1, d));
		spolki.add(new Spolka("KitKompDotCom", "KKDC", "informatyczny", 90.0, 3.4, d));
		spolki.add(new Spolka("Kocie dance studio", "sds", "rozrywkowy", 15.0, -11.7, d));
		
	}

	public List<Spolka> getSpolki() {
		return spolki;
	}

	public void setSpolki(List<Spolka> spolki) {
		this.spolki = spolki;
	}
}
