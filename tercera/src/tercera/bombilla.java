package tercera;

public class bombilla {
public static boolean interruptorGeneral = true;
private boolean interruptor;
public bombilla( ) {
	interruptor = false;
}
public void enciende() {
	interruptor= true;
}
public void apaga() {
	interruptor = false;
}
public boolean estado() {
	return interruptorGeneral && interruptor;
}
public String muestraEstado() {
	return estado() ? "Encendida" : "Apagada";
}
}
