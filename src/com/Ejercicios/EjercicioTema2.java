package com.Ejercicios;

import java.util.Scanner;

public class EjercicioTema2 {
	
	public static void main(String[] args) {
		
     Scanner in = new Scanner(System.in);
     
     System.out.println("Ingrese precio: ");
      double precio = in.nextDouble();
      
     System.out.println( getPrecio(precio));
		
	}

	private static double getPrecio(double valor) {
		return valor += (valor/1.19)*0.19;
		
	}

}
