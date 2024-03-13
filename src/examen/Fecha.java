/*
 * Esto es la recuperacion de entorgos giogogo
 * 
 * @author Alejandro Eraso
 * @version 1.0
 * 
 * */

/*Paquete donde esta el examen
 * 
 * <TEXTO DESCRIPTIVO>*/
package examen;

public class Fecha {// Clase fecha

	/* @desc Booleano fechavalida */
	/* @desc Booleano fechavalida */
	public static boolean fechaValida;

	
public static boolean validarFecha (int anio, int mes, int dia) {
	/*
	 * <Metodo con parametros>
	 * 
	 * @param anio 
	 * 
	 * @param mes 
	 * 
	 * @param dia 
	 * @retun
	 */	
		fechaValida = false;
		/* Comprobamos que todos los datos son mayores que 0 y si es así, proseguimos */
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			/* Comporbamos que el mes es menor que 12 y el dia es menor que 31 */
			if ((mes <= 12) && (dia <= 31)) {
				/* Si el mes es igual a 2 fechavalida será = <"dia <= 28"> */
				if (mes == 2) {
					fechaValida = dia <= 28;
					/* Si el mes se puede % entre 2 y es igual a 0 */
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					/* Si el mes no es % entre 2 fecha valida obtendra el siguiente valor */
					fechaValida = dia <= 31;
				}
			}
		}
		/* Devolvemos fecha valida */
		return fechaValida;
	}
}