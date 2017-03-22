package negocio;

import java.util.Vector;

public class Profesor {
	
	private int numeroLegajo;
	private String nombre;
	private Direccion direccion;
	private Vector<Materia> materias;

	public Profesor(int numeroLegajo, String nombre, Direccion direccion,
			Vector<Materia> materias) {
		super();
		this.numeroLegajo = numeroLegajo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.materias = materias;
	}

	public void agregarMateria (Materia materia) {
		
	}
	
	public void eliminarMateria (Materia materia) {
		
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Vector<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Vector<Materia> materias) {
		this.materias = materias;
	}


}
