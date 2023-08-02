package Taller2Punto2;

public class Empresa {
	String nombre;
	String apellido;
	String documento;
	String direccion;
	double cantidad;
	String gama;
	public Empresa(String nombre, String apellido, String documento, String direccion, double cantidad, String gama) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.direccion = direccion;
		this.cantidad = cantidad;
		this.gama = gama;
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
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getGama() {
		return gama;
	}
	public void setGama(String gama) {
		this.gama = gama;
	}
	public String calculo() {
		double valor=0;
		if(gama.equals("1")) {
			valor=120000*cantidad;
		}
		else if (gama.equals("2")) {
			valor=180000*cantidad;
		}
		return  "Cliente [ nombre=" + nombre +", apellido="+apellido+", direccion="+direccion+", cantidad de dias ="+cantidad+", Valor a pagar="+valor+"]";

	}
}
