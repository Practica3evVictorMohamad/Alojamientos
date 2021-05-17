
public class PruebaPush {
	private Integer numeroprueba;
	private String nombre;
	public PruebaPush(Integer numeroprueba, String nombre) {
		this.numeroprueba = numeroprueba;
		this.nombre = nombre;
	}
	public Integer getNumeroprueba() {
		return numeroprueba;
	}
	public void setNumeroprueba(Integer numeroprueba) {
		this.numeroprueba = numeroprueba;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "PruebaPush [numeroprueba=" + numeroprueba + ", nombre=" + nombre + "]";
	}
	
	
}
