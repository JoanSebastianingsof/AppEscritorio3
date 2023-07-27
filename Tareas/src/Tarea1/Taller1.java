package Tarea1;
import java.util.Scanner;

public class Taller1 {
	public static void main(String[] args) {
		//1.Crear un algoritmo y ejecutarlo en java donde se calcule la potencia 
		System.out.println("Ejercicio 1");
     
		int num1 =5;
		int potencia=3;
		int resultado1=1;
		for(int i=0;i<potencia;i++) {
			resultado1=resultado1*num1;
		}
		System.out.println(resultado1);

		//2.Dado dos números enteros, donde estos números formaran un intervalo, es decir el primer número debe ser menor que el segundo (se debe ejecutar hasta que sea válido el intervalo), y se deben sumar los números del intervalo.
		System.out.println("Ejercicio 2");

		int a=10;
		int resultado = 0;

		for (int i=resultado; i<a;i++) {
			resultado=resultado+i;

		}	
		System.out.println("La suma de los numeros del intervalos es:"+resultado);

	/*	3Ejercicio 5: La conjetura de Ulam afirma que dado un entero y siguiendo los pasos
		siguientes siempre obtenemos un 1.
		• Si el número es par se divide por 2.
		• Si es impar se multiplica por 3 y se suma 1.
		Escribe un programa que le pida al usuario un número entero y que compruebe si la
		conjetura de Ulam es cierta, el programa deberá escribir toda la secuencia hasta llegar al
		uno. Por ejemplo, si el usuario introduce un 5 la secuencia sería: 5, 16, 8, 4, 2, 1.*/
		System.out.println("Ejercicio 3");

	    int num5=5;
	    int resultado5=0;
	    if(num5%2==0) {
	    	resultado5=num5/2;
	    	
	    }else {
	    	resultado5=num5*3+1;
	    	while(resultado5>1) {
	    		System.out.println(resultado5);

	    		resultado5=resultado5/2;

	    	}
	    }
		

		
		
		//4 Escribe un programa que calcule la factorial de un número introducido por
		//teclado. Para todo número natural n, se llama n factorial o factorial de n al producto de
		//todos los enteros entre 1 y n.
		System.out.println("Ejercicio 4");
		
		Scanner read4 = new Scanner (System.in); 
		System.out.println("Ingrese un numero:");
		int valor4=read4.nextInt();
		int resultado4=1;
		valor4+=1;
		for(int i=1;i<valor4;i++) {
			resultado4=resultado4*i;

		}
		System.out.println("Resultado factorial es:"+resultado4);

		//5.Dado un número entero positivo N, escribe un programa que determine cuántos dígitos
		//se necesitan para escribir el valor N. Por ejemplo, 99 necesita 2 dígitos, 115 necesita 3,
		//para 1000 la salida es 4.
		System.out.println("Ejercicio 5");
		int num4= 300;
		String numero= String.valueOf(num4);
		int contarCadena = numero.length();
		System.out.println(contarCadena);
	
		/*6. Escribe un programa que lea un número e imprime un triángulo de números de la forma
		siguiente. Si el número leído es 4, imprimirá:*/
		System.out.println("Ejercicio 6");

		Scanner read = new Scanner (System.in); 
		System.out.println("Ingrese un numero");
		int valor=read.nextInt();
		

			for (int i = 1; i <= valor; i++) {

	            for (int k = 1; k <= i; k++) {
	                System.out.print(i);
	            }

	         System.out.println();
	        }
	    
		
		/*7.Dado un número natural N, se calcula la raíz digital de N sumando los dígitos que lo
		componen. El proceso se repite sobre el nuevo número hasta que el resultado obtenido
		tiene un sólo dígito. Este último número es la raíz digital del número N.*/
			System.out.println("Ejercicio 7");
			Scanner read7 = new Scanner (System.in); 
			System.out.println("Ingrese un numero");
			int valor7=read7.nextInt();		
			String numero7= String.valueOf(valor7);
			int contarCadena7 = numero7.length();
            int c1=0;
            int resultado7=0;
            int c2=0;
            int resultadoFinal=0;

			for(int i=0;i<contarCadena7;i++) {
			      c1 =Integer.parseInt(numero7.charAt(i)+"");
                  resultado7+=c1;

                  if(resultado7>=10) {
             		 String resultadoF=String.valueOf(resultado7); 
                      resultadoFinal=0;
                	  for(int o=0;o<resultadoF.length();o++) {
                     	 c2=Integer.parseInt(resultadoF.charAt(o)+"");
                     	resultadoFinal+=c2;
                	  }
                    	
                   }
                  else {
                           resultadoFinal = resultado7;
                   }
                 
			}
			 
			  

		        System.out.println("La raíz digital del número es: " + resultadoFinal);
			
		//8. Según N cantidad de precios de productos decir cuál es el precio mayor?
			System.out.println("Ejercicio 8");
			Scanner read8 = new Scanner (System.in); 
			System.out.println("Ingrese una cantidad");
			int valor8=read8.nextInt();
			int myArray[]=new int [valor8];
			int resultado8=0;
			for(int i=0;i<valor8;i++) {
				Scanner read8mnum = new Scanner (System.in); 
				System.out.println("Ingrese el precio");
				int valor8num=read8mnum.nextInt();
				myArray[i]=valor8num;
				if(myArray[i]>resultado8) {
					resultado8=myArray[i];
				}
			}
			System.out.println("El precio mayor es =" + resultado8);

	}
}
