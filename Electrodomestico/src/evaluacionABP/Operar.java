package evaluacionABP;

/**
 * 
 * @author katramlar
 *
 */

public class Operar {
	public static void main(String[] args) {
		
		/**
		 * Array de electrodomesticos
		 */
		Electrodomestico[] electrodomesticos =  new Electrodomestico[10];
		
		/**
		 * Array de lavadoras para invocar precioFinal()
		 */
		Lavadora[] lavadoras = new Lavadora[5];
		
		/**
		 * Array de televisores para invocar precioFinal()
		 */
		Televisor[] televisores = new Televisor[5];
		
		/**
		 * Variable para almacenar suma total de precios
		 */
		double precioTotal = 0;
		
		/**
		 * Array con datos de electrodomesticos
		 */
		electrodomesticos[0] = new Lavadora(40, 50000, "azul", 'F', 50);
		electrodomesticos[1] = new Lavadora(5, 10000, "rosado", 'K', 20);
		electrodomesticos[2] = new Lavadora(10, 70000, "blanco", 'A', 50);
		electrodomesticos[3] = new Lavadora(30, 20000, "rojo", 'B', 30);
		electrodomesticos[4] = new Lavadora(25, 50000, "azul", 'F', 50);
		electrodomesticos[5] = new Televisor(10, false, 30000, "negro", 'D', 10);
		electrodomesticos[6] = new Televisor(55, true, 100000, "rojo", 'B', 20);
		electrodomesticos[7] = new Televisor(30, false, 20000, "verde", 'C', 30);
		electrodomesticos[8] = new Televisor(62, true, 200000, "dorado", 'A', 50);
		electrodomesticos[9] = new Televisor(10, false, 100000, "negro", 'D', 10);
		
		
		/**
		 * <p> Cambia color y consumo a valores por defecto si son incorrectos </p>
		 */
		for(Electrodomestico e : electrodomesticos) {
			e.comprobarColor(e.getColor());
			e.comprobarConsumoEnergetico(e.getConsumoEnergetico());
		}
		
		
		System.out.println("\n" + "------------ Electrodomesticos ------------" + "\n");
		/**
		 *  Mostrar array de electrodomesticos
		 */
		for(Electrodomestico e: electrodomesticos) {
			System.out.println(e.toString());
		}
		
		System.out.println("\n" + "------------ Lavadoras ------------" + "\n");
		
		/**
		 *  Mostrar lavadoras en array de electrodomesticos
		 */
		for(int i=0;i<electrodomesticos.length;i++) {
			if(electrodomesticos[i] instanceof Lavadora) {
				System.out.println(electrodomesticos[i]);				
			}
		}
		
		
		System.out.println("\n" + "------------ Televisores ------------" + "\n");
		
		/**
		 *  Mostrar televisores en array de electrodomesticos
		 */
		for(int i=0;i<electrodomesticos.length;i++) {
			if(electrodomesticos[i] instanceof Televisor) {
				System.out.println(electrodomesticos[i]);				
			}
		}
		
		
		/**
		 * Array de objetos Lavadora con datos (permite calcular precio final)
		 */
		//lavadora = carga, precioBase, color, consumoEnergetico, peso. 
		lavadoras[0] = new Lavadora(40, 50000, "azul", 'F', 50);
		lavadoras[1] = new Lavadora(5, 10000, "rosado", 'K', 20);
		lavadoras[2] = new Lavadora(10, 70000, "blanco", 'A', 50);
		lavadoras[3] = new Lavadora(30, 20000, "rojo", 'B', 30);
		lavadoras[4] = new Lavadora(25, 50000, "azul", 'F', 50);
		
		
		/**
		 * Array de objetos Televisor con datos (permite calcular precio final)
		 */
		//televisor = resolucion, sintonizadorTDT, preciobase, color, consumoenergetico, peso
		televisores[0] = new Televisor(10, false, 30000, "negro", 'D', 10);
		televisores[1] = new Televisor(55, true, 100000, "rojo", 'B', 20);
		televisores[2] = new Televisor(30, false, 20000, "verde", 'C', 30);
		televisores[3] = new Televisor(62, true, 200000, "dorado", 'A', 50);
		televisores[4] = new Televisor(10, false, 100000, "negro", 'D', 10);
		
		/**
		 * Cambia color y consumo a valores por defecto si son incorrectos
		 */
		for(Lavadora e : lavadoras) {
			e.comprobarColor(e.getColor());
			e.comprobarConsumoEnergetico(e.getConsumoEnergetico());
		}
		/**
		 * Calcular precio final de lavadoras
		 */
		for(Lavadora e : lavadoras) {
			e.setPrecioFinal(e.getCarga(), 
					e.aumentarPrecio(e.getConsumoEnergetico(), e.getPeso(), e.getPrecioBase()));
		}
		System.out.println("\n" + "------------ Precio Lavadoras ------------" + "\n");
		
		/**
		 * Mostrar precio final de lavadoras
		 */
		double precioTotalL =0;
		for(int i=0;i<lavadoras.length;i++) {
			System.out.println("El precio final de la lavadora " + i + " es: " + lavadoras[i].getPrecioFinal());
			precioTotalL = precioTotalL + lavadoras[i].getPrecioFinal();		
			}
		System.err.println("El precio TOTAL de las lavadoras es: " + precioTotalL);
		
		System.out.println("\n" + "------------ Precio Televisores ------------" + "\n");
		
		/**
		 * Cambia color y consumo a valores por defecto si son incorrectos
		 */
		for(Televisor e: televisores) {
			e.comprobarColor(e.getColor());
			e.comprobarConsumoEnergetico(e.getConsumoEnergetico());
		}
		/**
		 * Calcular precio final de televisores 
		 */
		for(Televisor e: televisores) {
			e.setPrecioFinal(e.getResolucion(), e.isSintonizadorTDT(), 
					e.aumentarPrecio(e.getConsumoEnergetico(), e.getPeso(), e.getPrecioBase()));
		}
		/**
		 * Mostrar precio final de televisores
		 */
		double precioTotalT = 0;
		for(int i=0;i<televisores.length;i++) {
			System.out.println("El precio final del televisor " + i + " es: " + televisores[i].getPrecioFinal());
			precioTotalT = precioTotalT + televisores[i].getPrecioFinal();
		}
		System.err.println("El precio TOTAL de televisores es: " + precioTotalT);
		System.out.println("\n" + "------------ Precio Total ------------" + "\n");
		
		/**
		 * Pasar valores totales de cada array a variable precioTotal
		 */
		precioTotal = precioTotalL + precioTotalT;
		
		System.err.println("El precio TOTAL de electrodomésticos es: " + precioTotal);
	}
}