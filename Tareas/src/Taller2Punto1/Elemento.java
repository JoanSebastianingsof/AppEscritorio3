package Taller2Punto1;

import java.util.Arrays;

public class Elemento {
  int myArray[];



public Elemento(int[] myArray) {
	this.myArray = myArray;
}



public int[] getMyArray() {
	return myArray;
}



public void setMyArray(int[] myArray) {
	this.myArray = myArray;
}



public String comparacionNumeros() {
	int mayor=myArray[0];
	int menor=myArray[0];
	for(int i=0;i<myArray.length;i++) {
		if(myArray[i]>mayor) {
			mayor = myArray[i];
		}else if(myArray[i]<menor) {
			menor = myArray[i];

		}
	}
	System.out.println(Arrays.toString(myArray));

	return  "[Numero mayor=" + mayor + ", Numero menor=" + menor + "]";


}
}
