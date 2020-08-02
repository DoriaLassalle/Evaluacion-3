import java.util.*;
public class MainFirstLine {

	public static Scanner leer = new Scanner(System.in);
	public static Tablero tablero= new Tablero();
	
	public static void main(String[] args) {
		
 	
		
									
			tablero.dibujartablero();			//DIBUJAMOS TABLERO
		
			menuPrincipal();					//LLAMAMOS MENU PRINCIPAL
		
			
	} //FIN DE MAIN
		
	
	
	public static void  menuPrincipal() {
			
			int op=0;
			
		do {
			System.out.println("");
			System.out.println("*******\\ OSCURILANDIA //*********");
			System.out.println("*        ==============          *");
			System.out.println("*   1.LANZAR HUEVO              *");
			System.out.println("*   2.MOSTRAR UBICACION CARROS   *");
			System.out.println("*   3.MOSTRAR PUNTAJE Y DATOS    *");
			System.out.println("*   4. SALIR                     *");
			System.out.println("**********************************");
			System.out.println("**                              **");
			System.out.println("****   SELECCIONA TU OPCION   ****");
			System.out.println("**                              **");
			System.out.println("**********************************");
			System.out.print(" :" );
			op=leer.nextInt();
			
			switch (op) {
				
			case 1:	lanzarProyectil();break;
							
			case 2:	mostrarMatriz();break; 
			
			case 3:	mostrarPuntajeydatos(); break;
				
			case 4:	System.out.println("Gracias!!! por usar el programa"); break;
			
			default: System.err.println("Error selecione Opcion Correcta"); break;
			
			}
			
		}while(op!=4);


	} //FIN MENU PRINCIPAL
	
	
public static void lanzarProyectil() {
	tablero.lanzarHuevo();
}
	
	
	

public static void mostrarMatriz() {
	
}
	
public static void mostrarPuntajeydatos() {

	
	for (Carro index:tablero.getVehiculos()) {
		System.out.println(index.toString());
	}
	
	
	
}
	
	
	
}// FIN CLASE
	
	
