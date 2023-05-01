package hora;

public class hora {
protected int hora , minutos; //atributos para heredar
hora (int hora, int minutos) {
	this.hora=0;//valores por defecto
	this.minutos = 0;
	if (!sethora(hora)) {
		System.out.println("La hora es incorrecta");
	}
	if (!setminutos(minutos) ) {
		System.out.println("Loa minutos no son validos");
	}	
}
public void inc() {
	minutos++;
	if (minutos > 59) {
		minutos = 0;
		hora++;
		if (hora > 23) {
			hora = 0;
		}
	}
}
public boolean setminutos(int minutos) {
	boolean correcto = false;
	if (0 <= minutos && minutos <60) {
		this.minutos = minutos;
		correcto = true;
	}
	return correcto;
}
public boolean sethora (int hora) {
	boolean correcto = false;
	if (0 <= hora && hora < 24) {
		this.hora=hora;
		correcto = true;
	}
	return correcto;
}

public String toString() {
	String result;
	result = hora + ":" + minutos;
	return result;
}
}
