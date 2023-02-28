/**
 * Razred za delo s steklenicami
 * @author Boris Volaric
 *
 */
public class Steklenica {

	/**
	 * staticna konstantna lastnost material 
	 */
	public static final String material = "Steklo";

	// Deklariramo zasebne lastnosti razreda Steklenica
	private int kolicinaVsebine;	// v ml
	private String vrstaVsebine;
	private boolean jeOdprta;
	private int kapaciteta;			// v ml

	/**
	 * Javni konstruktor
	 * ustvari nov objekt tipa Steklenica
	 */
	public Steklenica() {
		
		// Inicializiramo lastnosti objekta
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = 0;
		
		System.out.println("Ustvarjam nov objekt tipa Steklenica");
	}

	/**
	 * Javni konstruktor
	 * @param k kapaciteta steklenice
	 */
	public Steklenica(int k) {
		
		// Inicializiramo lastnosti objekta
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = k;
		
		System.out.println("Ustvarjam nov objekt tipa Steklenica s kapaciteto " + k);
	}

	/**
	 * Javna metoda za polnjenje steklenice
	 * pristeje natoceno kolicino in doda vrsto vsebine
	 * 
	 * @param k kolicina vsebine
	 * @param v vrsta vsebine
	 * @return kolicina vsebine po polnjenju
	 * @throws Exception vrze izjemo, ce je steklenica zaprta
	 */
	public int napolni(int k, String v) throws Exception {
		
		System.out.println("Steklenico polnim z " + v);
		System.out.println("Količina vsebine pred polnjenjem: " + kolicinaVsebine);
		
		// Če je steklenica odprta, poskusi napolniti
		if(jeOdprta) {
		
			// prištejemo količino vsebine
			kolicinaVsebine = kolicinaVsebine + k;
			
			// dodamo vrsto vsebine
			vrstaVsebine = vrstaVsebine + v;

			System.out.println("Količina vsebine po polnjenju: " + kolicinaVsebine);
			
		}
		else {
			
			// vržemo izjemo za neuspešno polnjenje
			throw new Exception("Steklenica je zaprta!");
		}
		
		// vrnemo količino vsebine
		return kolicinaVsebine;
	}

	/**
	 * Javna metoda za odpiranje steklenice
	 * spremeni vrednost jeOdprta na true
	 * 
	 * @return true - odpiranje uspesno, false - odpiranje ni uspesno
	 */
	public boolean odpri() {
		
		System.out.println("Odpiram steklenico ..."); 
		
		// Če je steklenica že odprta
		if(jeOdprta) {
			
			// Vrnemo false
			return false;
			
		}
		// sicer - če je zaprta
		else {
			
			// Odpremo steklenico
			jeOdprta = true;
			// Vrnemo true
			return true;
			
		}
	}
	
	/**
	 * Javna metoda za zapiranje steklenice
	 * spremeni vrednost jeOdprta na false
	 * @return true - zapiranje uspesno, false - zapiranje ni uspesno
	 */
	public boolean zapri() {
		
		System.out.println("Zapiram steklenico ..."); 
		
		// Če je steklenica že zaprta
		if(!jeOdprta) {
			
			// Vrnemo false
			return false;
			
		}
		// če je odprta
		else {
			
			// Zapremo steklenico
			jeOdprta = false;
			// Vrnemo true
			return true;
			
		}
	}
	
	/**
	 * Javna metoda vrne kolicino vsebine
	 * @return kolicina vsebine
	 */
	public int getKolicinaVsebine() {
		
		return kolicinaVsebine;
	}
	
}