package com.EstructurasdeControl.Condicionales;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese el dia:");

		String dia = in.nextLine();
		// ejemplo de comparacion

		boolean resultadoNum = 5 == 5;
		boolean resultadoString = dia.equals("Lunes");

		if (dia.equals("Lunes")) {

			System.out.println("lunes de rapido");

		} else if (dia.equals("Martes")) {

			System.out.println("Martes con m de me beso");

		} else if (dia.equals("Miercoles")) {

			System.out.println("Mierda con m de me beso");

		} else if (dia.equals("Jueves")) {

			System.out.println("juernes");

		} else if (dia.equals("Viernes")) {

			System.out.println("viernes joder");

		} else {

			System.out.println("el valor no concide con los dias laborales");

		}
	}

}

