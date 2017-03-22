package dto;

import java.io.Serializable;
import java.util.Vector;

public class ProfesorVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4102357834365670330L;
	
	private int numeroLegajo;
	private String nombre;
	private DireccionVO direccion;
	private Vector<MateriaVO> materias;

	public ProfesorVO(int numeroLegajo, String nombre, DireccionVO direccion,
			Vector<MateriaVO> materias) {
		super();
		this.numeroLegajo = numeroLegajo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.materias = materias;
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DireccionVO getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionVO direccion) {
		this.direccion = direccion;
	}

	public Vector<MateriaVO> getMaterias() {
		return materias;
	}

	public void setMaterias(Vector<MateriaVO> materias) {
		this.materias = materias;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	

}
