package evaluacionABP;

/**
 * @author katramlar
 */


public class Electrodomestico {

	/**
	 * Precio inicial de electrodomestico
	 */
	private int precioBase;
	
	/**
	 * Color del electrodomestico
	 */
	private String color;
	
	/**
	 * Cantidad de energía consumida por electrodoméstico
	 * (Letras entre A - F)
	 */
	private char consumoEnergetico;
	
	/**
	 * Peso del electrodoméstico en kg
	 */
	private int peso;


	
	/**
	 * <p> Constructor por defecto </p>
	 */
	 Electrodomestico() {
		super();
		this.precioBase = 100000;
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.peso = 5;
		
	}

	 /**
	  * <p> Constructor solo con variables precioBase y peso </p>
	  */
	 public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	
	 /**
	  * <p> Constructor con todos los parámetros </p>
	  */
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	
	/**
	 * <p> Getter de precioBase </p>
	 */
	public int getPrecioBase() {
		return precioBase;
	}

	/**
	 * <p> Getter de color </p>
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * <p> Getter de consumoEnergetico </p>
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	/**
	 * <p> Getter de peso </p>
	 */
	public int getPeso() {
		return peso;
	}
	
	/**
	 * <p> Comprueba que la letra de consumo es correcta, de no ser correcta utiliza
	 * letra por defecto. Se invoca al crear objeto y no es visible al usuario. </p>
	 * @return retorna verdadero si el consumo es correcto
	 */	 
	public boolean comprobarConsumoEnergetico(char consumoEnergetico) {
		
		if(consumoEnergetico == 'A' || consumoEnergetico == 'B' || 
				consumoEnergetico == 'C' || consumoEnergetico == 'D' ||
						consumoEnergetico == 'E' || consumoEnergetico == 'F' ||
							consumoEnergetico =='G') {
			return true;
		}else {
			this.consumoEnergetico = 'F';	
			return false;
		}
		
	}
	
	/**
	 * <p> Comprueba que el color es correcto, de no ser correcto utiliza
	 * color por defecto. Se invoca al crear objeto y no es visible al usuario. </p>
	 * @return retorna verdadero si el color es correcto
	 */
	public boolean comprobarColor(String color) {
		if(color == "blanco" || color == "negro"|| color == "rojo" || color == "azul"
				|| color == "gris") {
			return true;
		}else {
			this.color = "blanco";
			return false;
		}
	}
	
	/**
	 * <p> Aumenta precio del electrodomestico según su consumo y tamaño. </p>
	 * @return precio aumentado
	 */
	public int aumentarPrecio(char consumoEnergetico, int peso, int precioBase) {
		
		int precioAumentado = precioBase;
		int aumento = 0;
		switch(consumoEnergetico) {
		case 'A':
			aumento = 100;
			break;
		case 'B':
			aumento = 80;
			break;
		case 'C':
			aumento = 60;
			break;
		case 'D':
			aumento = 50;
			break;
		case 'E':
			aumento = 30;
			break;
		case 'F':
			aumento = 10;                        
		default:
			break;
		}                                                                 
		
		int aumento2=0;
			
		if(0>=peso & peso <=19){
			aumento2 = 10;			
		}else if(20>=peso & peso <=49) {
			aumento2 = 50;	
		}else if(50>=peso & peso <=79) {
			aumento2 = 80;	
		}else{
			aumento2 = 100;	
		}
		
		precioAumentado+=aumento;
		precioAumentado+=aumento2;	  
		
		return precioAumentado;
	}
	

	/**
	 * <p> Mostrar datos como String </p>
	 */	
	@Override
	public String toString() {
		return "Electrodomestico [getPrecioBase()=" + precioBase + ", getColor()=" + color
				+ ", getConsumoEnergetico()=" + consumoEnergetico + ", getPeso()=" + peso
				+"]";
	}
	
	
	
			
	}
	

