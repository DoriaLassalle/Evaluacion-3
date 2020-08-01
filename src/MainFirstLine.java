import java.util.*;
public class MainFirstLine {

	public static Scanner leer = new Scanner(System.in);
		
	
	public static void main(String[] args) {
				/**ALEATORIO 3 KROMI  3 CELDAS VERTICALES
		 		*						5 CAGUANO  2 CELDAS HORIZ
		 		*						  10 TRUPALLA 1 CELDA
		 		*		 		NO VEHICULO ENCIMA DE OTRO		
		 		*SE PUEDEN CREAR OTRAS CLSES
		 		*MENU DE ACCION REPETITIVO HASTA QUE EL USUARIO LO DECIDA					
		 		**/
 
				
			Tablero tablero1= new Tablero(); 
			tablero1.dibujartablero();			//DIBUJAMOS TABLERO
		
			menuPrincipal();					//LLAMAMOS MENU PRINCIPAL
		
			
	} //FIN DE MAIN
		
	
	
	public static void  menuPrincipal() {
			
			int op=0;
			
		do {
			
			System.out.println("*******\\ OSCURILANDIA //*********");
			System.out.println("*        ==============          *");
			System.out.println("*       1. LANZAR HUEVO          *");
			System.out.println("*   2.MOSTRAR UBICACION CARROS   *");
			System.out.println("*   3.MOSTRAR PUNTAJE Y DATOS    *");
			System.out.println("*           4. SALIR             *");
			System.out.println("**********************************");
			System.out.println("**                              **");
			System.out.println("****   SELECCIONA TU OPCION   ****");
			System.out.println("**                              **");
			System.out.println("**********************************");
			op= leer.nextInt();
			
			switch (op) {
				
			case 1:	lanzarHuevo();break;
							
			case 2:	mostrarMatriz();break; //CREAR ESTE METODO
			
			case 3:	mostrarPuntajeydatos(); 
			break;
				
			case 4:	System.out.println("Gracias!!! por usar el programa"); break;
			
			default: System.out.println("Error"); break;
			
			}
			
		}while(op!=4);


	} //FIN MENU PRINCIPAL

public static void lanzarHuevo() {
	

}

public static void mostrarMatriz() {
	
}
	
public static void mostrarPuntajeydatos() {
	Tablero tablero2 =new Tablero();
	tablero2.insertarTrupalla();
	
	for (Carro index:tablero2.getVehiculos()) {
		
		System.out.println(index.toString());
	}
	
	
	
}
	
	
	
}// FIN CLASE
	
	
