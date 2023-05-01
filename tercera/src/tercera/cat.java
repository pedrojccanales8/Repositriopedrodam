package tercera;

public class cat  extends animal{
		private int edad;
		public cat(String name, int edad) {
			super(name);// llama alconstructor de la clase
			this.edad=edad;
		}
	  public void makesound() {
		  super.makeSound();//llamada al metodo de la superclase
		  System.out.println("El gato esta maullando");
	  }
}

