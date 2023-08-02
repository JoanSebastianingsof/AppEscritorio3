package Taller2Punto2;

import java.util.Scanner;

import Taller2punto4.Estudiante;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su nombre");
		Scanner N = new Scanner (System.in); 
		String nombre=N.next();
		
		System.out.println("Ingrese su apellido");
		Scanner a = new Scanner (System.in); 
		String apellido=a.next();
		
		System.out.println("Ingrese su documento");
		Scanner D = new Scanner (System.in); 
		String documento=D.next();
		
		System.out.println("Ingrese su direccion");
		Scanner Dir = new Scanner (System.in); 
		String direccion=Dir.next();
		
		System.out.println("Ingrese la cantidad de dias");
		Scanner C = new Scanner (System.in); 
		double cantidad=C.nextDouble();
		
		
		System.out.println("Ingrese 1 si desea un carro de baja gama familiar o ingrese 2 si desea in carro de alta gama familiar");
		Scanner G = new Scanner (System.in); 
		String gama=G.next();
		
		Empresa empresa = new Empresa(nombre,apellido,documento,direccion,cantidad,gama);
		System.out.println(empresa.calculo());
		
	}

}
