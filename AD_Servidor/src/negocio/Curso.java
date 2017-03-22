package negocio;

import java.util.Vector;

public class Curso {
	
	private int numeroCurso;
	private Materia materia;
	private Profesor profesor;
	private Vector<Alumno> alumno;
	private int cantidadMaxima;

	public Curso(int numeroCurso, Materia materia, Profesor profesor,
			Vector<Alumno> alumno, int cantidadMaxima) {
		super();
		this.numeroCurso = numeroCurso;
		this.materia = materia;
		this.profesor = profesor;
		this.alumno = alumno;
		this.cantidadMaxima = cantidadMaxima;
	}

	public void agregarAlumno(Alumno alumno){
		
	}
	
	public void eliminarAlumno(Alumno alumno){
		
	}
	
	public void reasignarProfesor(Profesor profesor){
		
	}

	public Vector<Alumno> obtenerAlumnos(){
		Vector<Alumno> alumnos = null;
		return alumnos;
	}

	public int getNumeroCurso() {
		return numeroCurso;
	}

	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Vector<Alumno> getAlumno() {
		return alumno;
	}

	public void setAlumno(Vector<Alumno> alumno) {
		this.alumno = alumno;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	
}
