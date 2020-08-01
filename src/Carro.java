
public class Carro {
	
	private int ocupantes;
	private int fecha;			//fecha de ingreso
	private int fila;
	private int columna;
	
	
	public Carro() {
		super();
	}


	public Carro(int ocupantes, int fecha, int fila, int columna) {
		super();
		this.ocupantes = ocupantes;
		this.fecha = fecha;
		this.fila = fila;
		this.columna = columna;
	}


	public int getOcupantes() {
		return ocupantes;
	}


	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}


	public int getFecha() {
		return fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
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


	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fecha=" + fecha + ", fila=" + fila + ", columna=" + columna + "]";
	}
	
	
	
	
	
}//FIN CLASE
