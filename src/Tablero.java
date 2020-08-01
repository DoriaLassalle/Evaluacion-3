import java.util.*;


public class Tablero {
	Scanner leer = new Scanner(System.in);
	
	private int fila;
	private int columna;
	private char [][] matriztablero = new char [15][15];
	int puntaje=0;
		
	private ArrayList<Carro> vehiculos =new ArrayList <Carro>(18);		//Cantidad ya definida
	private ArrayList<Huevo> proyectiles=new ArrayList <Huevo>()	;		//sin limite
			
			
	public void Tablero() {				//CONSTRUCTOR X DEFECTO
	
			
	}
	
	/*	
	public void crearCarro() {			
				
		Carro kromi1 = new Kromi();
		//vehiculos.add(new Carro());			
		
		fila= (int) (Math.random()*14+1);
		System.out.println(fila);

		columna= (int) (Math.random()*14+1);
		System.out.println(columna);		

		} //FIN CREAR CARRO */
	
public void insertarTrupalla() {
	
		Trupalla trupalla1 =new Trupalla();
		Caguano caguano2 =new Caguano();
		
		
		vehiculos.add(trupalla1);
		vehiculos.add(caguano2);
		
		fila= (int) (Math.random()*15);	
		columna= (int) (Math.random()*15);
		
		matriztablero[fila][columna]='T';
		
			
}
	


public void insertarCaguano() {
		do {	
				Carro caguano1 =new Caguano();
				vehiculos.add(caguano1);
				
				
				fila= (int) (Math.random()*15);
				columna= (int) (Math.random()*15);
				if (columna<=13) {
					matriztablero[fila][columna]='C';
					matriztablero[fila][columna+1]='C';	
				}else if (columna==14) {
						matriztablero[fila][columna]='C';
						matriztablero[fila][columna-1]='C';	
									
				}
				
		}while (!(validarCelda(fila, columna)));
			
	
	
	
}	
	
	
	
	public void insertarKromi() {
	//do {
		Carro kromi1 =new Kromi();
		vehiculos.add(kromi1);
		
		fila= (int) (Math.random()*15);
		columna= (int) (Math.random()*15);
		if (fila<=12) {
			matriztablero[fila][columna]='K';
			matriztablero[fila+1][columna]='K';	
			matriztablero[fila+2][columna]='K';	
		}else if (fila==13) {
				matriztablero[fila][columna]='K';
				matriztablero[fila+1][columna]='K';	
				matriztablero[fila-1][columna]='K';	
			}else if (fila==14) {
					matriztablero[fila][columna]='K';
					matriztablero[fila-1][columna]='K';	
					matriztablero[fila-2][columna]='K';	
			}
	//	}while ();
	}
	

	
	
	
	public void dibujartablero() {
		for (int i = 0; i < 10; i++) {
			insertarTrupalla();
		}
		/*
		for (int i = 0; i < 5; i++) {
			insertarCaguano();
		}
		
		for (int i = 0; i < 3; i++) {
			insertarKromi();
		} */
		 	
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					System.out.print("|");
					System.out.print("_" + matriztablero[i][j] + "_");
				}
				System.out.println("|");
		 	}
		
	}//FIN DIBUJAR TABLERO
	
	public boolean validarCelda(int fila, int columna) {
		if (matriztablero[fila][columna]=='T'){
			return true;
			} else {
	
		return false;
		}
	}//FIN VALIDAR CELDA 
	
	
	/*
	public void lanzarHuevo() { //CREA INSTANCIA CLASE HUEVO Y PIDE COORD DE LANZAMIENTO
								//ASIGNA PUNTAJE Y ALMACENA EN LISTA CORRESPONDIENTE 
	
		
		System.out.println("         ****************************          ");
		System.out.println("      *** COORDENADAS DE LANZAMIENTO ***       ");
		System.out.println("         ****************************          ");
		System.out.println("***   Ingresa N° de Fila (Entre 1 y 15):    ***");
		fila=leer.nextInt();
		System.out.println("***  Ingresa N° de Columna (Entre 1 y 15):  ***");
		columna=leer.nextInt();
		if(fila=='T' && columna =='T') {
			puntaje =puntaje+1;
		}else if (fila=='C'&& columna=='C') {
				puntaje=puntaje+2;
			}else if (fila=='K' && columna=='K') {
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
