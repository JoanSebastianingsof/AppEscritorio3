package Taller2punto4;

public class Estudiante {
  String nombre;
  String apellido;
  int semestre;
  String carrera;
  double promedio[];
public Estudiante(String nombre, String apellido, int semestre, String carrera, double[] promedio) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.semestre = semestre;
	this.carrera = carrera;
	this.promedio = promedio;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getSemestre() {
	return semestre;
}
public void setSemestre(int semestre) {
	this.semestre = semestre;
}
public String getCarrera() {
	return carrera;
}
public void setCarrera(String carrera) {
	this.carrera = carrera;
}
public double[] getPromedio() {
	return promedio;
}
public void setPromedio(double[] promedio) {
	this.promedio = promedio;
}
public String promedio() {
	double numero=0;
	for (int i=0;i<promedio.length;i++) {
		numero+=promedio[i];
	}
	numero=numero/promedio.length;
	return  "Estudiante [Nombre=" + nombre + ", Apellido=" + apellido + ", Semestre=" + semestre + ", Carrera ="+carrera +", Promedio="+numero+ "]";

}

}
