import java.util.*;


public class Tablero {
	Scanner leer = new Scanner(System.in);
	
	private int fila;
	private int columna;
	private char [][] matriztablero = new char [15][15];
	int puntaje=0;
		
	private ArrayList<Carro> vehiculos =new ArrayList <Carro>(18);		//Cantidad ya definida
	private ArrayList<Huevo> proyectiles=new ArrayList <Huevo>()	;		//sin limite
		
	
public Tablero() {				//CONSTRUCTOR X DEFECTO
	
	
	for (int i = 0; i < 10; i++) { // INSERTA 10 TRUPALLAS
		insertarTrupalla();
	}
	
	for (int i = 0; i < 5; i++) { // INSERTA 5 CAGUANOS
		insertarCaguano();
	}
	
	for (int i = 0; i < 3; i++) { // INSERTA 3 KROMIS
		insertarKromi();
	} 
	 	
			
}
	
public void crearCarro() {							
			

} //FIN CREAR CARRO 
	
public void insertarTrupalla() {
		fila=0;
		columna=0;
		
		do {
			
			fila= (int) (Math.random()*15);	
			columna= (int) (Math.random()*15);
		
		}while (!validarCelda(fila, columna)); // VERIFICO SI LA CELDA ESTA VACIA
		
		
		matriztablero[fila][columna]='T';   // INSERTO LA TRUPALLA EN TABLERO
		

		Trupalla trupalla1 =new Trupalla(); // CREO LA TRUPALLA Y LA AGREDO AL ARRAY
		vehiculos.add(trupalla1);
}
	


public void insertarCaguano() {
			fila=0;
			columna=0;
	
		do {				
			fila= (int) (Math.random()*15);
			columna= (int) (Math.random()*14);
			
		}while (!validarCelda(fila, columna)||!validarCelda(fila, columna+1));
	
		
		if (columna<=13) {
			matriztablero[fila][columna]='C';
			matriztablero[fila][columna+1]='C';	
			}else if (columna==14) {
				matriztablero[fila][columna]='C';
				matriztablero[fila][columna-1]='C';		
				}
				
		Carro caguano1 =new Caguano();
		vehiculos.add(caguano1);
	
		
}	
	
	
	
public void insertarKromi() {
		fila=0;
		columna=0;
		
	do {
	
		fila= (int) (Math.random()*13);
		columna= (int) (Math.random()*15);

	}while (!validarCelda(fila, columna)||!validarCelda(fila+1, columna)||!validarCelda(fila+2, columna));
		
		matriztablero[fila][columna]='K';
		matriztablero[fila+1][columna]='K';	
		matriztablero[fila+2][columna]='K';	
	
				
		Carro kromi1 =new Kromi();
		vehiculos.add(kromi1);		
		
}
	

	
	
	
public void dibujartablero() {
	
	
		System.out.println("============================================================");
		System.out.println("***************** TABLERO  DE EFECTIVOS PKS ****************");
		System.out.println("____________________________________________________________");
							
			for (int i = 0; i < 15; i++) {  //DIBUJA EL TABLERO
				for (int j = 0; j < 15; j++) {
					System.out.print("|");
					System.out.print("_" + matriztablero[i][j] + "_");
				}
				System.out.println("|");
		 	}
		
}//FIN DIBUJAR TABLERO
	
	
	
	
public boolean validarCelda(int fila, int columna) {
	
		if (matriztablero[fila][columna]=='T' || matriztablero[fila][columna]=='C' || matriztablero[fila][columna]=='K') {
			return false;
		}else{
			return true;
		}

				
}//FIN VALIDAR CELDA 
	

public void lanzarHuevo() { //CREA INSTANCIA CLASE HUEVO Y PIDE COORD DE LANZAMIENTO
								//ASIGNA PUNTAJE Y ALMACENA EN LISTA CORRESPONDIENTE 
	
		System.out.println("*****************************     ");
		System.out.println("*COORDENADAS DE LANZAMIENTO *     ");
		System.out.println("*****************************     ");
		System.out.print("***  Ingresa N° de Fila   (Entre 0 y 14):");
		fila=leer.nextInt();
		System.out.print("***  Ingresa N° de Columna (Entre 0 y 14):");
		columna=leer.nextInt();
		
		
		if(fila=='T' && columna =='T') {
			System.out.println("...LE DISTE A UN TRUPALLA.LE SACASTE LA CHUCHA...");
			puntaje =puntaje+1; 
		}else if (fila=='C'&& columna=='C') {
			System.out.println("...LE DISTE A UN CAGUANO .LE SACASTE LA CONCHA...");
				puntaje=puntaje+2;
			}else if (fila=='K' && columna=='K') {
				System.out.println("...LE DISTE A UN KROMI.LE SACASTE LA CRESTA...");
					puntaje=puntaje+3;
			}
		
		
}//FIN LANZAR HUEVO		*/
	
	
	
	
	
	public void mostrarMatriz () { //MUESTRA TABLERO CON CARROS Y LANZAMIENTOS (H) AL MOMENTO
									//CALCULA PUNTAJE HASTA EL MOMENTO
			
	}//FIN MOSTRAR MATRIZ
	
	public void calcularPuntaje() { //SUMA Y ENTREGA LOS PUNTAJES DE CADA LANZAMIENTO
									//VISIBLE Y USADA  DENTRO DE LA CLASE
									//CLASE HUEVO DEFINE CADA LANZAMIENTO REALIZADO
	//SI HUEVO CAE EN 3a TRUPALLA ADD 10 PUNTOS; EN 2o CAGUANO ADD 7 PUNTOS
		
		
	}//FIN CALCULARPUNTAJE


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
	
	
	
	
	
	
}//FIN CLASE
