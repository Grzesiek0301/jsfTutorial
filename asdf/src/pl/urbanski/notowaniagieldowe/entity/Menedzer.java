package pl.urbanski.notowaniagieldowe.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menedzer {

	private List<Spolka> spolki;
	private String symbolAktywnejSpolki;
	
	public Menedzer() {
		spolki = new ArrayList<>(3);
		Date d = new Date();


//		komentarz pierwszy
		spolki.add(new Spolka("Kocia spolka weglowa", "KSW", "energetyczny", 20.0, 11.1, d));
		spolki.add(new Spolka("KitKompDotCom", "KKDC", "informatyczny", 90.0, 3.4, d));
		spolki.add(new Spolka("Kocie dance studio", "sds", "rozrywkowy", 15.0, -11.7, d));
		//komentarz3
		Date wczoraj =new Date(d.getTime()-86400000);
		spolki.get(0).getNotowania().add(0,new Notowanie(18, wczoraj, 4.0, spolki.get(0)));
		spolki.get(1).getNotowania().add(0,new Notowanie(87, wczoraj, -2.0, spolki.get(1)));
		spolki.get(2).getNotowania().add(0,new Notowanie(17, wczoraj, 10.0, spolki.get(2)));
	}

	public List<Spolka> getSpolki() {
		return spolki;
	}
//komentarz
	public void setSpolki(List<Spolka> spolki) {
		this.spolki = spolki;
	}

	public String getSymbolAktywnejSpolki() {
		return symbolAktywnejSpolki;
	}

	public void setSymbolAktywnejSpolki(String symbolAktywnejSpolki) {
		this.symbolAktywnejSpolki = symbolAktywnejSpolki;
	}
	
	public Spolka getAktywnaSpolka() {
		for(Spolka s: this.spolki) {
			if(s.getSymbol().equals(symbolAktywnejSpolki)) {
				return s;
			}
		}
		return null;
			
		}
}
