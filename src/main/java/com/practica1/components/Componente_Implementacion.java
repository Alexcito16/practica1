package com.practica1.components;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Componente_Implementacion implements Componente_Dependencia {

	

	@Override
	public String leer_teclado() {
		Scanner leer=new Scanner(System.in);
		System.out.println("`porfavor ingrese un nombre");
		return leer.nextLine();
	}

	@Override
	public void salida_mensaje(String mensaje) {
		System.out.println(mensaje);
		
	}

}
