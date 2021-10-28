package com.laboratorio;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]s_nombres	= null;
		Float[] f_notas 	= null;
		
		String[]s_nombres_aux	= null;
		Float[] f_notas_aux 	= null;
		
		int		i_cantidad	= 0;
		int		i			= 0;
		int		j			= 0;
		Float	f_aux		= 0f;
		String	s_aux		= null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("************PRACTICA DE LABORATORIO************");
		System.out.print("Por favor ingrese la cantidad de notas: ");
	
		i_cantidad = sc.nextInt();
		
		s_nombres 	= new String[i_cantidad];
		f_notas		= new Float[i_cantidad];
		
		System.out.println("************INGRESO DE DATOS************");
		
		i = 0;
		while (i<i_cantidad) {
			System.out.print("Ingrese el nombre: ");
			s_nombres[i]= sc.next();
			System.out.print("Ingrese la nota de "+s_nombres[i].toString()+": ");
			f_notas[i]  = sc.nextFloat();
			i++;
		}
		
		i = 0;
		j = 0;
	
		//Metodo de ordenamiento por inserccion directa
		for (i=0; i < i_cantidad; i++) {
			f_aux = f_notas[i];
			s_aux = s_nombres[i];
			j = i;
			while (j>0 && f_notas[j-1]>f_aux) {
				f_notas[j] = f_notas[j-1];
				s_nombres[j] = s_nombres[j-1];
				j = j - 1;						
			}
			f_notas[j]	= f_aux;
			s_nombres[j]= s_aux;		
		}
	
		System.out.println("************NOTAS************");
		i = 0;
		while(i<i_cantidad) {
			System.out.println(s_nombres[i]+" "+f_notas[i].toString());
			i++;
		}

	}

}
