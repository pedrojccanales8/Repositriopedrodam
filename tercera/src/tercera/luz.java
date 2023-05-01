package tercera;

public class luz {

	public static void main(String[] args) {

		bombilla b1, b2;
		b1 = new bombilla();
		b2 = new bombilla();
		b1.enciende();
		b2.apaga();
		System.out.println("b1: " + b1.muestraEstado());
		System.out.println("b2: " + b2.muestraEstado());
		bombilla.interruptorGeneral = false; //cortamos la luz
		System.out.println("\nCortamos la luz");
		System.out.println("b1: " + b1.muestraEstado());
		System.out.println("b2: " + b2.muestraEstado());
		bombilla.interruptorGeneral=  true;
		System.out.println("\nActivamos la luz");
		System.out.println("b1: " + b1.muestraEstado());
		System.out.println("b2: " + b2.muestraEstado());
	}

}
