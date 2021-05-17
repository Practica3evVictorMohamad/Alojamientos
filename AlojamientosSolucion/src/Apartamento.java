/**
 * Clase Apartamento - Clase hija de Alojamiento.java. Define la construccion de objetos Apartamento.
 * @author Mohamad
 * @author Victor
 *@version 1.0
 */
public class Apartamento extends Alojamiento{

	private int gastosComunidad;
	
	
	/**
	 * Constructor - Define los parametros de entrada para construir el objeto Apartamento
	 * @codigo - Parametro heredado de la superclase.Cadena unica asociada al apartamento
	 * @param numPlazas - Parametro heredado de la superclase.Numero entero que define el numero de plazas
	 * @param suplemento - Parametro heredado de la superclase.Aqui se define a 0
	 * @param  gastosComunidad - Dato numerico entero asociado al apartamento
	 */
	public Apartamento(String codigo, int numPlazas, int gastosComunidad) {
		super(codigo, numPlazas, 0);
		this.gastosComunidad = gastosComunidad;
	}

	// En los apartamentos se calcula el suplemento por d�a
	// dividiendo la cuota mensual de los gastos de comunidad por 30 y multiplicarla por el n�mero de d�as que se han alquilado
	
	/**
	 * precioApagar - Metodo que calcula el precio total para los dias especificados.
	 * @param dias - Dato numerico entero que representa los dias de instancia
	 * @return - Devuelve el precio en formato numerico real
	 */
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + (double)gastosComunidad*dias/30;
		
	}
	
	/**
	 * Metodo toString - Metodo sobreescrito que define el formato en que se imprime el objeto por pantalla
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "Gastos de comunidad:", gastosComunidad);
	}
}
