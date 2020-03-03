package evaluacionABP;
/**
 * 
 * @author katramlar
 *
 */
public class Televisor extends Electrodomestico {

	
	/**
	 * Resolución del monitor del televisor
	 */
	private int resolucion;
	
	/**
	 * Televisor puede o no poseer sintonizador
	 */
	private boolean sintonizadorTDT;
	
	/**
	 * Precio final de televisor
	 */
	private double precioFinal;
	
	/**
	 * <p> Constructor por defecto </p>
	 */
	public Televisor() {
		super();
		this.resolucion = 20;
		this.sintonizadorTDT = false;
		this.precioFinal = this.getPrecioFinal();
	}
	
	/**
	 * <p> Constructor solo con variables precioBase y peso </p>
	 */
	public Televisor(int precioBase, int peso) {
		super(precioBase, peso);
	}

	
	/**
	  * <p> Constructor con todos los parámetros </p>
	  */
	public Televisor(int resolucion, boolean sintonizadorTDT, int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	
	/**
	 * <p> Método get de resolucion </p>
	 */
	public int getResolucion() {
		return resolucion;
	}
	
	/**
	 * <p> Método get de sintonizadorTDT </p>
	 */	

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * <p> Método set de precio final:
	 * Aumenta precio del electrodomestico según su resolucion y sintonizador </p>
	 */
	public void setPrecioFinal(int resolucion, boolean sintonizadorTDT, int precioAumentado) {
		//super(precioBase);
		precioFinal = precioAumentado;
		if(resolucion>40) {
			precioFinal = precioFinal + ((precioFinal * 30)/100);
		}
		if(sintonizadorTDT) {
			precioFinal += 50;
		}
		
	}

	
	/**
	 * <p> Método get de precioFinal </p>
	 */	
	public double getPrecioFinal() {
		return precioFinal;
	}
	
	
	/**
	 * <p> Mostrar datos como String </p>
	 */	
	@Override
	public String toString() {
		return "Televisor [Resolucion: " + resolucion + ", SintonizadorTDT: " + sintonizadorTDT
				+ ", Precio Base: " + getPrecioBase() + ", Color: " + getColor() +
				", Consumo Energetico: " + getConsumoEnergetico() + ", Peso: " + getPeso() + "]";
	}
	
	
		
}
