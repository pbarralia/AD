package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

import dto.AlumnoVO;
import dto.CursoVO;
import dto.MateriaVO;
import dto.ProfesorVO;

public interface Negocio extends Remote {
	
	public void agregarAlumno(AlumnoVO alumno) throws RemoteException;
	public void agregarMateria(MateriaVO materia) throws RemoteException;
	public void agregarProfesor(ProfesorVO profesor) throws RemoteException;
	
	public void eliminarAlumno(AlumnoVO alumno) throws RemoteException;
	public void eliminarMateria(MateriaVO materia) throws RemoteException;
	public void eliminarProfesor(ProfesorVO profesor) throws RemoteException;
	
	public AlumnoVO obtenerAlumnoPorLegajo(AlumnoVO alumno) throws RemoteException;
	public CursoVO obtenerCursoPorNumero(CursoVO curso) throws RemoteException;
	public MateriaVO obtenerMateriaPorNumero(MateriaVO materia) throws RemoteException;
	public ProfesorVO obtenerProfesorPorLegajo(ProfesorVO profesor) throws RemoteException;
	
	public Vector<AlumnoVO> obtenerAlumnos() throws RemoteException;
	public Vector<CursoVO> obtenerCursos() throws RemoteException;
	public Vector<MateriaVO> obtenerMaterias() throws RemoteException;
	public Vector<ProfesorVO> obtenerProfesores() throws RemoteException;

	public void nuevoCurso(MateriaVO materia, ProfesorVO profesor, int cantidadMaxima) throws RemoteException;
	public void asignarMateriaProfesor(MateriaVO materia, ProfesorVO profesor) throws RemoteException;
	public void asignarAlumnoCurso(CursoVO curso, AlumnoVO alumno) throws RemoteException;
	public void eliminarAlumnoCurso(CursoVO curso, AlumnoVO alumno) throws RemoteException;
	
}
