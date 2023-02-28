/*
	Ime datoteke:	PivskaSteklenicaTableModel.java
	Avtor:			Boris Volarič
*/
import javax.swing.table.*;

public class PivskaSteklenicaTableModel extends DefaultTableModel {
	
	// Konstruktor
	public PivskaSteklenicaTableModel() {
		
		// Kliče konstruktor nadrazreda
		super();
		
		// V tabelo dodamo stolpce
		addColumn("Znamka");
		addColumn("Stopnja alkohola");
		
		// Dodamo naslovno vrstico
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {"Znamka test", "Stopnja test"};
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
		
	}
	
	// Vhodni parametri: ps - PivskaSteklenica
	// Potek/opis: Metoda, ki doda pivsko steklenico na seznam in v tabelo
	// Vrne vrednost: /
	public void addPivskaSteklenica(PivskaSteklenica ps) {
		
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {ps.getZnamkaKolicina(), ps.getStopnjaAlkohola()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
	}
	
}