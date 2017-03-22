package dto;

import java.io.Serializable;
import java.util.Vector;

public class CursoVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4030066553343894303L;
	
	private int numeroCurso;
	private MateriaVO materia;
	private ProfesorVO profesor;
	private Vector<AlumnoVO> alumno;
	private int cantidadMaxima;
	
	public CursoVO(int numeroCurso, MateriaVO materia, ProfesorVO profesor,
			Vector<AlumnoVO> alumno, int cantidadMaxima) {
		super();
		this.numeroCurso = numeroCurso;
		this.materia = materia;
		this.profesor = profesor;
		this.alumno = alumno;
		this.cantidadMaxima = cantidadMaxima;
	}

	public int getNumeroCurso() {
		return numeroCurso;
	}

	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}

	public MateriaVO getMateria() {
		return materia;
	}

	public void setMateria(MateriaVO materia) {
		this.materia = materia;
	}

	public ProfesorVO getProfesor() {
		return profesor;
	}

	public void setProfesor(ProfesorVO profesor) {
		this.profesor = profesor;
	}

	public Vector<AlumnoVO> getAlumno() {
		return alumno;
	}

	public void setAlumno(Vector<AlumnoVO> alumno) {
		this.alumno = alumno;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}



}
