package tercera;
import tercera.cuenta;


public class cuenta1 {
	public static void main(String[] args) {
		cuenta c1,c2,c3;
		 gestor g1 = new gestor("Antonio gonzalez", "666555444");
		  gestor g2 = new gestor("Bea rodriguez", "957190210" , 12000.0);
		  c1 = new cuenta("12345678-A", "Pepita", g1);
		  c2 = new cuenta("98765432-B", "Ana", g1);
		  c3 = new cuenta("112233445-C", "Sancho");
		  c1.mostrarInformacion();
		  c2.mostrarInformacion();
		  c3.mostrarInformacion();
		  c1.setgestor(g2);
		  c1.mostrarInformacion();
		 
 
    
	}
}