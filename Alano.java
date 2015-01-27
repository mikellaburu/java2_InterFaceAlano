
public class Alano extends Perro implements Dogo, Lebrel {
	

	//abstracto heredado
	public final void tipoPerro() {
		System.out.println("Es un perro Alano");
	}
	
	//IF
	public void esDogo() {
		System.out.println("Es cruce de Dogo");
	}
	
	public void esLebrel() {
		System.out.println("Es cruce de Lebrel");
	}
}
