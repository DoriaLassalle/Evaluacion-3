
public class Caguano extends Carro{
		
	
		public final int LARGOC=2; //metros
		
		int alcance;					//del confeti
		String color;
		
	

	public Caguano() {
		super();
		
	}

	public Caguano(int ocupantes, int fecha, int fila, int columna, int alcance, String color ) {
		super(ocupantes, fecha, fila, columna);
			this.alcance=alcance;
			this.color=color;	
					
	}
	
	public void lanzarConfeti() {
		
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Caguano [LARGOC=" + LARGOC + ", confeti=" + alcance + ", color=" + color + "]";
	}
	
	
	
	
}
