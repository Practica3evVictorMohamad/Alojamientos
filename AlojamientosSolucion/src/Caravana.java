/**
 * Clase Caravana - Clase hija de Alojamiento.java. Define la construccion de objetos Caravana.
 * @author Mohamad
 * @author Victor
 *@version 1.0
 */
public class Caravana extends Alojamiento{

	int pesoMaximo;

	
	/**
	 * Constructor - Define los parametros de entrada para construir el objeto Caravana
	 * @codigo - Parametro heredado de la superclase.Cadena unica asociada al apartamento
	 * @param numPlazas - Parametro heredado de la superclase.Numero entero que define el numero de plazas
	 * @param suplemento - Parametro heredado de la superclase.Cargo extra asociado a cada tipo de Alojamiento.
	 * @param pesoMaximo - Dato numerico entero que representa el peso maximo de la caravana
	 */
	public Caravana(String codigo, int numPlazas, int suplemento, int pesoMaximo) {
		super(codigo, numPlazas, suplemento);
		this.pesoMaximo = pesoMaximo;
	}

	// A las caravanas se les suma el suplemento multiplicado por el número de plazas y los días de alquiler
	/**
	 * precioApagar - Metodo que calcula el precio total para los dias especificados.
	 * @param dias - Dato numerico entero que representa los dias de instancia
	 * @return - Devuelve el precio en formato numerico real
	 */
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + getSuplemento()*getNumPlazas()*dias;
	}
	
	/**
	 * Metodo toString - Metodo sobreescrito que define el formato en que se imprime el objeto por pantalla
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "PesoMaximo:",pesoMaximo);
	}
	
}
