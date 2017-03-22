package dto;

import java.io.Serializable;

public class MateriaVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3502582195391808088L;
	
	private String nombre;
	private String numero;
	
	public MateriaVO(String nombre, String numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	


}
