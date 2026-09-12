package oop.ej1.src;

import java.util.List;

public class Alumno {
	private final int padron;
	private String nombre;
	private List<Carrera> carreras;
	private List<Materia> materias_aprobadas;

	public Alumno(int padron,  String nombre) {
		this.padron = padron;
		this.nombre = nombre;
	}
	public String getNombre() { return nombre; }
	public void inscribirCarrera(Carrera c) {
		if (!carreras.contains(c)) {
			carreras.add(c);
			return;
		}
			System.out.println("Ya estaba inscripto a esta carrera.");
	}
	public void aprobarMateria(codigoMateria codigo) {}
	public List<Carrera> getCarrerasTerminadas() {}
}