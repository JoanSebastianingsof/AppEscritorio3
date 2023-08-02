package Taller2punto4;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Ingrese el numero de estudiantes");
	Scanner scanner = new Scanner (System.in); 
	int estudiantes=scanner.nextInt();	
		
		
	
	for(int a=0;a<estudiantes;a++) {
		
		System.out.println("Ingrese el nombre");
	//	Scanner N = new Scanner (System.in); 
		String nombre=scanner.next();
		
		System.out.println("Ingrese el apellido");
		//Scanner A = new Scanner (System.in); 
		String apellido=scanner.next();
		
		System.out.println("Ingrese la carrera");
		//Scanner scanner = new Scanner (System.in); 
		String carrera=scanner.next();
		
		System.out.println("Ingrese el semestre");
		//Scanner S = new Scanner (System.in); 
		int semestre=scanner.nextInt();
		
	    System.out.println("Ingrese la cantidad de notas");
		//Scanner lectura = new Scanner (System.in); 
		int numeroNotas=scanner.nextInt();
		double promedio[]=new double[numeroNotas];
	    int e = 0;
		for(int i=0;i<numeroNotas;i++) {
			e+=1;
			System.out.println("Ingrese nota "+e);
			promedio[i]=scanner.nextDouble();

		}
		Estudiante Pr = new Estudiante(nombre,apellido,semestre,carrera,promedio);
		System.out.println(Pr.promedio());


	}
	
    scanner.close();

	}
}
