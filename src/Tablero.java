import java.util.*;

public class Tablero {

	public ArrayList<Carro> vehiculos =new ArrayList <Carro>(18);		//Cantidad ya definida
	public ArrayList<Huevo> proyectiles=new ArrayList <Huevo>()	;		//sin limite
	
	public void Tablero() {
		
	}
	
	
	public void crearCarro() {			//crea una subclase de la clase carro y la asigna a la lista respectiva
										//las coord del carro se asignan aleatorias y no se puede traslapar un carro con otro
		
		vehiculos.add(new Carro());			
				
	}
	
	public void lanzarHuevo() { //crea la instancia de la clase Huevo, solicita la coordenada de lanzamiento
								//asigna el puntaje al movimiento y la almacena en la lista correspondiente
		
	}
	
	public void mostrarMatriz () { //muestra como matriz c/u de los carros existentes y los lanzamientos registrados hasta el mommento
									//Donde hubo lanzamiento debe haber H
									//luego calcula el puntaje obt hasta el momento
			
	}
	
	public void calcularPuntaje() { //Suma los puntajes asignados a cada lanzamiento y loes entrega como resultado.
									//debe ser visible solo denro de la clase y utilizado en todos los metodos de la misma clase.
									//clase Huevo es la que define cada lanzamiento realizado dentro del tablero
		
	}
	
}
