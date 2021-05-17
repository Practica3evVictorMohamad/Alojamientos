/**
 * Clase Bungalow - Clase hija de Alojamiento.java. Define la construccion de objetos Bungalow.
 * @author Mohamad
 * @author Victor
 *@version 1.0
 */
public class Bungalow extends Alojamiento{

	private int superficiePorche;
		
	/**
	 * Constructor - Define los parametros de entrada para construir el objeto Bungalow
	 * @codigo - Parametro heredado de la superclase.Cadena unica asociada al apartamento
	 * @param numPlazas - Parametro heredado de la superclase.Numero entero que define el numero de plazas
	 * @param suplemento - Parametro heredado de la superclase.Cargo extra asociado a cada tipo de Alojamiento.
	 * @param superficiePorche - Dato numerico entero que representa la superficie del porche
	 */

	public Bungalow(String codigo, int numPlazas, int suplemento, int superficiePorche) {
		super(codigo, numPlazas, suplemento);
		this.superficiePorche = superficiePorche;
	}

	// En los bungalows se suma el suplemento multiplicado por el número de plazas independientemente de los días que se hayan alquilado
	/**
	 * precioApagar - Metodo que calcula el precio total para los dias especificados.
	 * @param dias - Dato numerico entero que representa los dias de instancia
	 * @return - Devuelve el precio en formato numerico real
	 */
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + getSuplemento()*getNumPlazas();
	}
	
	/**
	 * Metodo toString - Metodo sobreescrito que define el formato en que se imprime el objeto por pantalla
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "Superficie del porche:", superficiePorche);
	}
}
