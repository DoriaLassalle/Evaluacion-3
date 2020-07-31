
public class Kromi extends Carro {
	

	public final int LARGOK=3;		//metros

	int fabricacion;					//año
	String marca;
	int largo;
	
	
	public Kromi() {
		super();
	}


	public Kromi(int ocupantes, int fecha, int fila, int columna, int fabricacion, String marca) {
		super(ocupantes, fecha, fila, columna);
		// TODO Auto-generated constructor stub
		this.fabricacion=fabricacion;
		this.marca=marca;
		this.largo=LARGOK;
		
	}
	public void transportarPKS() {
		
	}



	public int getFabricacion() {
		return fabricacion;
	}




	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public int getLargo() {
		return largo;
	}




	public void setLargo(int largo) {
		this.largo = largo;
	}


	@Override
	public String toString() {
		return "Kromi [LARGOK=" + LARGOK + ", fabricacion=" + fabricacion + ", marca=" + marca + ", largo=" + largo
				+ "]";
	}



}
