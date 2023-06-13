package com.psr;
import java.util.Scanner;

public class Main {

	static double sumar(double unNumero, double otroNumero) {
		double resultado = unNumero + otroNumero;
		return resultado;}
	
	static double restar(double unNumero, double otroNumero) {
		double resultado = unNumero - otroNumero;
		return resultado;}

	static double multiplicar(double unNumero, double otroNumero) {
		double resultado = unNumero * otroNumero;
		return resultado;}

	static double dividir(double unNumero, double otroNumero) {
		double resultado = unNumero / otroNumero;
		return resultado;}

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		double unNumero;
		double otroNumero;
		unNumero = 0;
		otroNumero = 0;
		
		int opcion = 0;
		while (opcion != 5) {
			System.out.println("Opcion 1: Sumar");
			System.out.println("Opcion 2: Restar");
			System.out.println("Opcion 3: Multiplicar");
			System.out.println("Opcion 4: Dividir");
			System.out.println("Opcion 5: Salir");
			System.out.println("Elija una opcion");
			opcion = datos.nextInt();
			if (opcion == 5) {
				System.out.println("Has salido");
				break;}
			else if (opcion < 1 || opcion > 4) {
				System.out.println("Opcion incorrecta, intenta nuevamente");}
			else {
				try {
				System.out.println("Ingrese primer numero");
				unNumero = datos.nextDouble();
				System.out.println("Ingrese segundo numero");
				otroNumero = datos.nextDouble();}
				catch (Exception e){
					System.out.println("Ocurrio un error, intenta nuevamente");
				}
			}
			if (opcion == 1) {
				double resultado = sumar(unNumero, otroNumero);
				System.out.println(resultado);}
			else if (opcion == 2) {
				double resultado = restar(unNumero, otroNumero);
				System.out.println(resultado);}
			else if (opcion == 3) {
				double resultado = multiplicar(unNumero, otroNumero);
				System.out.println(resultado);}
			else if (opcion == 4) {
				try {
					double resultado = dividir(unNumero, otroNumero);
					if (resultado == Double.POSITIVE_INFINITY ||
						resultado == Double.NEGATIVE_INFINITY ||
						Double.isNaN(resultado))
			            throw new ArithmeticException();
					System.out.println(resultado);}
				catch (ArithmeticException ae){
					System.out.println("Ocurrio un error, intenta nuevamente");}
				}
			}
		}
	}