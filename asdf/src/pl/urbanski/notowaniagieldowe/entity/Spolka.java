package pl.urbanski.notowaniagieldowe.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Spolka {

	private String nazwa;
	private String symbol;
	private String sektor;
	private List <Notowanie> notowania;
	private Notowanie ostatnie;
	
	public Spolka() {
		
	}
	
	public Spolka(String nazwa, String symbol, String sektor) {
		this.nazwa = nazwa;
		this.symbol = symbol;
		this.sektor = sektor;
	}

	public Spolka(String nazwa, String symbol, String sektor, double cena, double zmiana, Date dzien) {
		this(nazwa, symbol, sektor);
		this.notowania = new ArrayList<>();
		this.notowania.add(new Notowanie(cena, dzien, zmiana, this));
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSektor() {
		return sektor;
	}

	public void setSektor(String sektor) {
		this.sektor = sektor;
	}

	public List<Notowanie> getNotowania() {
		return notowania;
	}

	public void setNotowania(List<Notowanie> notowania) {
		this.notowania = notowania;
	}

	public Notowanie getOstatnie() {
		if(this.ostatnie == null) {
			if(this.getNotowania() != null && !this.getNotowania().isEmpty()) {
				this.ostatnie = this.getNotowania().get(this.getNotowania().size()-1);
			}
		}
		return ostatnie;
	}

	public void setOstatnie(Notowanie ostatnie) {
		this.ostatnie = ostatnie;
	}
}

