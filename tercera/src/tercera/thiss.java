package tercera;

public class thiss {
 int edad; // atributo entero
 void metodo() {
	 double edad; // oculta el atributo edad;
	 edad = 20.0; // variable local no el atributo
	 this.edad= 30; //atributo de la clase
 }
}
