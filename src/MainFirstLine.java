import java.util.*;
public class MainFirstLine {

	public static Scanner leer = new Scanner(System.in);
	public static Tablero tablero= new Tablero();
	
	public static void main(String[] args) {
		
 	
		System.out.println("************************************************************************************");
		System.out.println("*                      ��BIENVENIDO A OSCURILANDIA!!                               *");
		System.out.println("*                                                                                  *");
		System.out.println("*       En Oscurilandia se encuentra desplegada la �LITE DE SEGURIDAD PKS,         *");
		System.out.println("*            para restaurar el orden en torno a la C�mara Secreta.                 *");
		System.out.println("* La Flota de veh�culos se encuentra desplegada en el tablero y est� compuesta por *");
		System.out.println("*                      KROMIS, CAGUANOS Y TRUPALLAS                                *");
		System.out.println("*          Deber�s derrotarlas con tus proyectiles...Los HUEVOS.                   *");
		System.out.println("*         L�nzalos con tu mejor precisi�n y suma el m�ximo de puntos.              *");
		System.out.println("*                              ��A JUGAR!!                                         *");
		System.out.println("*                                                                                  *");
		System.out.println("************************************************************************************");
									
		menuPrincipal();					//LLAMAMOS MENU PRINCIPAL
		
			
	} //FIN DE MAIN
		
	
	
	public static void  menuPrincipal() {
			
			int op=0;
			
		do {
		
			System.out.println("*****   ELIGE UNA OPCION:    *****");
			System.out.println("**                              **");
			System.out.println("*   1.INICIAR JUEGO              *");
			System.out.println("*   2.LANZAR HUEVO               *");
			System.out.println("*   3.MOSTRAR UBICACION CARROS   *");
			System.out.println("*   4.MOSTRAR PUNTAJE Y DATOS    *");
			System.out.println("*   5.SALIR                      *");
			System.out.println("**                              **");
			System.out.println("**********************************");
			
			System.out.print(" :" );
			op=leer.nextInt();
			
			switch (op) {
			
			case 1:	tablero.dibujartablero();;break;		//DIBUJAMOS TABLERO
			
			case 2:	lanzarProyectil();break;
							
			case 3:	mostrarMatriz();break; 
			
			case 4:	mostrarPuntajeydatos(); break;
				
			case 5:	System.out.println("���GRACIAS POR USAR EL PROGRAMA!!!"); break;
			
			default: System.err.println("Error! Selecione Opcion Correcta"); break;
			
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
	
	
