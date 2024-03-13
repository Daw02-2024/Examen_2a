package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest3 {

	@Test
	void testValidarFecha(int anio, int mes, int dia ) {
		boolean fechavalida = false;
		anio = 0;
		mes = 0;
		dia = 0;
		System.out.println(fechavalida);
	}



@Test
void testValidarFecha1(int anio, int mes, int dia ) {
	boolean fechavalida = false;
	anio = 1;
	mes = 13;
	dia = 32;
	System.out.println(fechavalida);
}




@Test
void testValidarFecha2(int anio, int mes, int dia ) {
	boolean fechavalida = false;
	anio = 1;
	mes = 2;
	dia = 27;
	fechavalida = dia <= 28;
	System.out.println(fechavalida);
}




@Test
void testValidarFecha3(int anio, int mes, int dia ) {
	boolean fechavalida = false;
	anio = 1;
	mes = 2;
	dia = 27;
	fechavalida = dia <= 28;
	System.out.println(fechavalida);
}

}



