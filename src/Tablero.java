import java.util.*;




public class Tablero {
	Scanner leer = new Scanner(System.in);
	
	private int fila;
	private int columna;
	
	
	public ArrayList<Carro> vehiculos =new ArrayList <Carro>(18);		//Cantidad ya definida
	public ArrayList<Huevo> proyectiles=new ArrayList <Huevo>()	;		//sin limite
	
	public void Tablero() {
				
		}
		
	public void crearCarro() {			
		
		
		Carro kromi1 = new Kromi();
		vehiculos.add(new Carro());			
		
		fila= (int) (Math.random()*14+1);
		System.out.println(fila);

		columna= (int) (Math.random()*14+1);
		System.out.println(columna);

		}
	
	
	
	
	public void dibujartablero() {
		

	char [][] matriz = new char [15][15];
	
	
		matriz[fila][columna]='K';
		
			
	for (int i = 0; i < 15; i++) {
	
		for (int j = 0; j < 15; j++) {
	
			System.out.print("|");
			System.out.print("_" + matriz[i][j] + "_");
		}
		
		
		System.out.println("|");
		
	}
		
		
		
	}
	
	
	
	public void lanzarHuevo() { //crea la instancia de la clase Huevo, solicita la coordenada de lanzamiento
								//asigna el puntaje al movimiento y la almacena en la lista correspondiente
		
		System.out.println("Ingrese las coordenadas: ");
		
		System.out.println("Ingrese la fila: ");
		fila=leer.nextInt();
		
		System.out.println("Ingrese la columna: ");
		columna=leer.nextInt();
		
	}
	
	public void mostrarMatriz () { //muestra como matriz c/u de los carros existentes y los lanzamientos registrados hasta el mommento
									//Donde hubo lanzamiento debe haber H
									//luego calcula el puntaje obt hasta el momento
			
	}
	
	public void calcularPuntaje() { //Suma los puntajes asignados a cada lanzamiento y loes entrega como resultado.
									//debe ser visible solo denro de la clase y utilizado en todos los metodos de la misma clase.
									//clase Huevo es la que define cada lanzamiento realizado dentro del tablero
		
	}


	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public int getColumna() {
		return columna;
	}


	public void setColumna(int columna) {
		this.columna = columna;
	}


	public ArrayList<Carro> getVehiculos() {
		return vehiculos;
	}


	public void setVehiculos(ArrayList<Carro> vehiculos) {
		this.vehiculos = vehiculos;
	}


	public ArrayList<Huevo> getProyectiles() {
		return proyectiles;
	}


	public void setProyectiles(ArrayList<Huevo> proyectiles) {
		this.proyectiles = proyectiles;
	}
	
	
	
	
	
	
}
