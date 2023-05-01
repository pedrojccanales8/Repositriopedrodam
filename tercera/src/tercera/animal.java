package tercera;

public class animal {
	protected String name;
	protected int edad;
	public animal (String name) {
		this.name=name;
		
	}
	public void makeSound() {
		System.out.println("El animal hace ruidos");
	}
	 public void datosAnimal() {
	        System.out.println("El nombre del gato es " + this.name + " y tiene " + this.edad + " años");
	    }
}

 