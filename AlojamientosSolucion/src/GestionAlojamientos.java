import java.util.ArrayList;
/**
 * Clase GestionAlojamientos - Clase lanzadora.Punto de entrada del programa ejecutable,donde se inicia y finaliza el control del programa
 * @author Mohamad
 * @author Victor
 *@version 1.0
 */
public class GestionAlojamientos {

	public static void main(String[] args) {
		ArrayList<Alojamiento> alojamientos = new ArrayList<>();
		Alojamiento alojamiento;
		crearAlojamientos(alojamientos);

		mostrarAlojamientos(alojamientos);
		System.out.println();
		alojamiento = new Caravana("car01", 4, 2, 750);
		AltaAlojamiento(alojamientos, alojamiento);
		System.out.println();
		alojamiento = new Caravana("car05", 7, 2, 1250);
		AltaAlojamiento(alojamientos, alojamiento);
		mostrarAlojamientos(alojamientos);

		calculaPrecioAlquiler(alojamientos);
		mostrarPreciosDeTodos(alojamientos);
	}//main
	
	/**
	 * Metodo crearAlojamientos - recibe una coleccion que guarda los objetos Alojamiento que se crean
	 * @param alojamientos - array donde estan guardados todos los alojamientos
	 */
	public static void crearAlojamientos(ArrayList<Alojamiento> alojamientos) {
		alojamientos.add(new Caravana("car01", 4, 2, 750));		
		alojamientos.add(new Bungalow("bung01", 4, 3, 12));
		alojamientos.add(new Bungalow("bung02", 2, 3, 8));
		alojamientos.add(new Caravana("car02", 6, 2, 850));
		alojamientos.add(new Apartamento("apart01", 4, 130));
		alojamientos.add(new Apartamento("apart02", 6, 140));
		alojamientos.add(new Bungalow("bung03", 6, 3, 15));
		alojamientos.add(new Bungalow("bung04", 8, 3, 20));
		alojamientos.add(new Apartamento("apart03", 5, 135));
		alojamientos.add(new Apartamento("apart04", 8, 170));
		alojamientos.add(new Caravana("car03", 4, 2, 750));
		alojamientos.add(new Caravana("car04", 3, 2, 750));
	}//crearAlojamientos
	/**
	 * Metodo mostrarAlojamientos - recibe una coleccion que guarda objetos Alojamiento, la recorre e imprime por pantalla
	 * @param alojamientos - array donde estan guardados todos los alojamientos
	 */
	public static void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos) {
		System.out.println("Listado de los datos de los alojamientos");
		for(int i = 0; i < alojamientos.size(); i++) {
			System.out.println(alojamientos.get(i));
		}

	}//mostrarAlojamientos
	/**
	 * Metodo mostrarAlojamientos - Guarda el objeto alojamiento dentro de la coleccion alojamientos
	 * @param alojamientos - array donde estan guardados todos los alojamientos
	 * @param alojamiento - objeto de tipo Alojamiento
	 */
	public static void AltaAlojamiento(ArrayList<Alojamiento> alojamientos, Alojamiento alojamiento) {
		int posicion = buscar(alojamientos,alojamiento);

		if(posicion == -1) {
			alojamientos.add(alojamiento);
		}else {
			System.out.println("Alojamiento con código repetido. No se puede añadir");
		}


	}//AltaAlojamiento
	/**
	 * Metodo buscar - Busca el objeto alojamiento dentro de la coleccion alojamientos
	 * @param alojamientos - array donde estan guardados todos los alojamientos
	 * @param alojamiento - objeto de tipo Alojamiento
	 * @return - Devuelve la posicion del alojamiento dentro de la coleccion o -1 si no se encuentra
	 */
	public static int buscar(ArrayList<Alojamiento> alojamientos,Alojamiento alojamiento) {
		for(int i = 0; i < alojamientos.size(); i++) {
			if(alojamientos.get(i).getCodigo().equals(alojamiento.getCodigo())) {
				return i;
			}
		}
		return -1;
	}//buscar
	/**
	 * Metodo calculaPrecioAlquiler - Calcula el precio del  alojamiento seleccionado para el numero de dias deseados
	 * @param alojamientos - array donde estan guardados todos los alojamientos
	 * 
	 */
	public static void calculaPrecioAlquiler(ArrayList<Alojamiento> alojamientos) {
		// Los datos de entrada serán el código del alojamiento y
		// el número de días que ha durado el alquiler
		String codigo;
		int dias, posAlojamiento;
		codigo = Leer.pedirCadena("Codigo del alojamiento:");
		posAlojamiento = -1;
		for(int i = 0; i < alojamientos.size(); i++) {
			if(alojamientos.get(i).getCodigo().equals(codigo)) {
				posAlojamiento = i;
			}
		}
		if(posAlojamiento != -1) {
			do {
				dias = Leer.pedirEntero("Dias de alquiler:");
			}while(dias < 0);
			System.out.println(codigo + " --> " + alojamientos.get(posAlojamiento).precioAPagar(dias));
		}
	}//calculaPrecioAlquiler

	/**
	 * Metodo mostrarPreciosDeTodos - Calcula el precio de todos los alojamientos guardados en la coleccion para el numero de dias deseados
	 * @param alojamientos - array donde estan guardados todos los alojamientos
	 * 
	 */
	public static void mostrarPreciosDeTodos(ArrayList<Alojamiento> alojamientos) {
//		 Se da como dato de entrada un número de días de alquiler y 
//		 se obtiene un listado con los datos de cada alojamiento y lo que costaría su alquiler 
//		 para el número de días indicado
		int dias;
		do {
			dias = Leer.pedirEntero("Dias de alquiler:");
		}while(dias < 0);
		for(int i = 0; i < alojamientos.size(); i++) {
			System.out.println(alojamientos.get(i).getCodigo() + " --> " + alojamientos.get(i).precioAPagar(dias));
		}
	}//mostrarPreciosDeTodos
}
