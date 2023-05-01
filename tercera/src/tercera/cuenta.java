package tercera;

	class cuenta {
		String dni;
		public String nombre;
		double saldo;
		gestor gestor;
		static private String nombreBanco = "International Java Bank";
		static void  setBanco(String nuevoNombre) {
			nombreBanco = nuevoNombre;		
		}
		static String getBanco() {
			return nombreBanco;
		}
		
		
		cuenta(String dni, String nombre) { //constructor
			this.dni =dni;
			this.nombre = nombre;
			saldo = 0;
		}
		
		
		
		cuenta (String dni, double saldo) { //consturctor
			this.dni =dni;
			this.nombre = nombre;
			this.saldo = saldo;
		}
		
		
		
		cuenta (String dni , String nombre , double saldo) {
			this.dni =dni;
			this.nombre = nombre;
			this.saldo = saldo;
		}
		cuenta(String dni, String nombre, gestor gestor) {
			this(dni, nombre);
			this.gestor= gestor;
		}
		

		void setgestor (gestor gestor) {
			this.gestor = gestor;
			
		}
		
		
		boolean egreso(double cant) {
			boolean operacionPosible;
			if (saldo>= cant) {
				saldo -= cant;
			operacionPosible = true;
			}else {
				System.out.println("No hay saldo disponible");
				operacionPosible = false;
			}
			return (operacionPosible);
		}
		void ingreso (double cant) {
			saldo += cant;
		}
		void mostrarInformación() {
			System.out.println("Nombre: " + nombre);
			System.out.println("Dni: " +dni);
			System.out.println("Saldo: " + saldo + " euros ");
		}
			void mostrarInformacion() {
				if (gestor == null) {
					System.out.println("Cuenta sin gestor");
				} else {
					System.out.println("Información del gestor");
					gestor.mostrarInformación();
				}
				System.out.println("Información de la cuenta");
				System.out.println("Nombre: " +nombre);
				System.out.println("Dni: " +dni);
				System.out.println("Saldo: " +saldo);
				
			}
	}

