package evaluacionABP;

	/**
	 * 
	 * @author katramlar
	 *
	 */

public class Lavadora extends Electrodomestico{

	/**
	 * Carga de lavadora en kg
	 */
	private int carga;
	
	/**
	 * Precio final de lavadora
	 */
	private double precioFinal;
	
	
	/**
	 * <p> Constructor por defecto </p>
	 */
	public Lavadora() {
		super();
		this.carga = 5;
		this.precioFinal = this.getPrecioFinal();
	}
	
	/**
	 * <p> Constructor solo con variables precioBase y peso </p>
	 */
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
	}

	 /**
	  * <p> Constructor con todos los parámetros </p>
	  */
	public Lavadora(int carga, int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	/**
	 * <p> Método get de carga </p>
	 */
	public int getCarga() {
		return carga;
	}
	
	/**
	 * <p> Metodo set de precioFinal:
	 * Aumenta precio del electrodomestico según su carga </p>
	 */
	public void setPrecioFinal(int carga, int precioAumentado) {
		//super(precioBase);
		precioFinal = precioAumentado;
		if(carga>30) {
			precioFinal += 50;
		}		
	}

	
	/**
	 * <p> Metodo get de precioFinal:
	 */
	public double getPrecioFinal() {
		return precioFinal;
	}

	
	/**
	 * <p> Mostrar datos como String </p>
	 */	
	@Override
	public String toString() {
		return "Lavadora [Carga: " + getCarga() + ", Precio Base: " + getPrecioBase() + 
				", Color: " + getColor() + ", Consumo Energetico: " + getConsumoEnergetico()
				+ ", Peso: " + getPeso() + "]";
	}


		
	
}




