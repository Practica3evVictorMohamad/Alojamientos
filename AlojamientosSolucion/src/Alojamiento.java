/**
 * Clase Alojamiento - Esta clase pretende definir la contruccion del objeto
 * @author Mohamad
 * @author Victor
 * @version 1.0
 *
 */
public abstract class Alojamiento {
	private String codigo;
	private static final int PRECIO_POR_DIA = 50;
	private int numPlazas;
	private int suplemento;
	
	/**
	 * Constructor - Define los parametros de entrada para construir el objeto Alojamiento
	 * @param codigo - cadena unica asociada al alojamiento
	 * @param numPlazas - numero entero que define el numero de plazas
	 * @param suplemento - cargo extra asociado a cada tipo de Alojamiento. 
	 */
	
	public Alojamiento(String codigo, int numPlazas, int suplemento) {
		super();
		this.codigo = codigo;
		this.numPlazas = numPlazas;
		this.suplemento = suplemento;
	}
	/**
	 * precioApagar - Metodo abstracto que calcula el precio total para los dias especificados.
	 * @param dias - dato numerico entero que representa los dias de instancia
	 * @return - Devuelve el precio en formato numerico real
	 */

	public abstract double  precioAPagar(int dias);
	
	/**
	 * getCodigo - Metodo getter
	 * @return - Devuelve el codigo asociado al objeto en cuestion
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * getPrecioPorDia - Metodo getter
	 * @return Devuelve el valor de la variable PRECIO_POR_DIA asociada al objeto en cuestion
	 */
	public static int getPrecioPorDia() {
		return PRECIO_POR_DIA;
	}
	
	/**
	 * getNumPlazas - Metodo getter
	 * @return Devuelve el valor de la variable numPlazas asociada al objeto en cuestion
	 */
	public int getNumPlazas() {
		return numPlazas;
	}
	
	/**
	 * getSuplemento - Metodo getter 
	 * @return Devuelve el valor de la variable suplemento asociada al objeto en cuestion
	 */

	public int getSuplemento() {
		return suplemento;
	}
	
	
	/**
	 * Metodo toString - define el formato en que se imprime el objeto por pantalla
	 */

	@Override
	public String toString() {
		return String.format("codigo: %-8s, precio por dia:%3d, plazas:%3d", codigo, PRECIO_POR_DIA, numPlazas);
	}
	
	
}
