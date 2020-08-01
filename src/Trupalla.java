
public class Trupalla extends Carro{

	public final int ESPACIOT=1; //1 CELDA
	
	int armadura;			//NIVEL ENTRE 1 - 5
	String nombre;			//NOMBRE CONDUCTOR
	
	
	
	public Trupalla() {
		super();
		
	}
	public Trupalla(int ocupantes, int fecha, int fila, int columna, int armadura, String nombre) {
		super(ocupantes, fecha, fila, columna);
			this.armadura=armadura;
			this.nombre=nombre;
			
	}
	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
