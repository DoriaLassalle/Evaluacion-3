import java.util.*;


public class Tablero {
	Scanner leer = new Scanner(System.in);
	
	private int fila;
	private int columna;
	private char [][] matriztablero = new char [15][15];
	private char [][] matrizghost= new char [15][15];
	int puntaje=0;
		
	private ArrayList<Carro> vehiculos =new ArrayList <Carro>(18);		//Cantidad ya definida
	private ArrayList<Huevo> proyectiles=new ArrayList <Huevo>();		//sin limite
		
	
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
		

		Trupalla trupalla1 =new Trupalla(fila, columna); // CREO LA TRUPALLA Y LA AGREDO AL ARRAY
		vehiculos.add(trupalla1);
}
	


public void insertarCaguano() {
			fila=0;
			columna=0;
	
		do {				
			fila= (int) (Math.random()*15);
			columna= (int) (Math.random()*14);
			
		}while (!validarCelda(fila, columna)||!validarCelda(fila, columna+1));
	
		
			matriztablero[fila][columna]='C';
			matriztablero[fila][columna+1]='C';	
			
				
		Carro caguano1 =new Caguano(fila, columna);
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
	
				
		Carro kromi1 =new Kromi(fila, columna);
		vehiculos.add(kromi1);		
		
}
	
	
	
public void dibujartablero() {
	
	
		System.out.println("============================================================");
		System.out.println("***************** TABLERO  DE EFECTIVOS PKS ****************");
		System.out.println("  0   1   2   3   4   5   6   7   8   9   10  11  12  13  14");
		System.out.println("____________________________________________________________");
							
			for (int i = 0; i < 15; i++) {  //DIBUJA EL TABLERO
				for (int j = 0; j < 15; j++) {
					
					System.out.print("|");
					System.out.print("_" + matriztablero[i][j] + "_");
				}
				System.out.println("|"+i);
				
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
	int filahuevo;
	int columnahuevo;
	int aux1=0;
	int aux2=0;
	int aux3=0;
	int aux4=0;
	int aux5=0;
	int aux6=0;
		
		System.out.println("");
		System.out.println("      *****************************     ");
		System.out.println("      *COORDENADAS DE LANZAMIENTO *     ");
		System.out.println("      *****************************     ");
		System.out.print("***  Ingresa N° de Fila    (Entre 0 y 14):");
		System.out.println("");
		filahuevo=leer.nextInt();
		System.out.print("***  Ingresa N° de Columna (Entre 0 y 14):");
		System.out.println("");
		columnahuevo=leer.nextInt();
		
		for (int i = 0; i < matriztablero.length; i++) {
			for (int j = 0; j < matriztablero.length; j++) {
				
				if(matriztablero[i][j]=='T') {
					aux1=i;
					aux2=j;
				}	
				if(matriztablero[i][j]=='C') {
					aux3=i;
					aux4=j;
							
				}
				if(matriztablero[i][j]=='K') {
					aux5=i;
					aux6=j;
				}
					 
			}
						
		}
		
		if (matriztablero[aux1][aux2]==matriztablero[filahuevo][columnahuevo]) {
				System.out.println("BIEN! LE DISTE A UNA TRUPALLA");
				 puntaje++;
		}	 
		else if (matriztablero[aux3][aux4]==matriztablero[filahuevo][columnahuevo]) {
						System.out.println("BIEN! LE DISTE A UN CAGUANO");
						 puntaje=puntaje +2;		 
					}
		else if (matriztablero[aux5][aux6]==matriztablero[filahuevo][columnahuevo]) {
							System.out.println("BIEN! LE DISTE A UNA KROMI");
							puntaje=puntaje +3;		 
						}else  System.out.println("FALLASTE!! INTENTALO DE NUEVO...");
		
		Huevo huevo1=new Huevo(puntaje, filahuevo, columnahuevo);
		proyectiles.add(huevo1);
		
		mostrarMatrizactualizada(filahuevo, columnahuevo);
		
		
}//FIN LANZAR HUEVO		
	

	
	
	
	public void mostrarMatrizactualizada (int filahuevo, int columnahuevo) { //MUESTRA TABLERO CON CARROS Y LANZAMIENTOS (H) AL MOMENTO
		char vault=' ';									//CALCULA PUNTAJE HASTA EL MOMENTO
		
		
		System.out.println("============================================================");
		System.out.println("***************** TABLERO  DE EFECTIVOS PKS ****************");
		System.out.println("  0   1   2   3   4   5   6   7   8   9   10  11  12  13  14");
		System.out.println("____________________________________________________________");
		
		matrizghost[filahuevo][columnahuevo]='H';	
		
		for (int i = 0; i < 15; i++) {  //DIBUJA EL TABLERO
			for (int j = 0; j < 15; j++) {
				
			//	matriztablero[filahuevo][columnahuevo]=vault;
				
					
					System.out.print("|");
					System.out.print("_" + matrizghost[i][j]+ "_");
									
				
			//	}else {
			//		System.out.print("|");
				//	System.out.print("_" +" "+ "_");	
					
			//	}
				
			}
			System.out.println("|"+i);
			
	 	}
		
		
		
		
		
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
	
	public char [][] getMatrizghost() {
		return matrizghost;
	}
	
	
	
	
}//FIN CLASE
