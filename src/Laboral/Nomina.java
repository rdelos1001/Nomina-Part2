package Laboral;

/**
 * Esta clase posee el sueldo base según la categoria y calcula el sueldo total.
 * @author Raúl
 *
 */
public class Nomina {
	
	/**
	 * Sueldo base de los empleados según su categoria
	 */
	private static final int SUELDO_BASE[]= 
		{50000, 70000, 90000, 110000, 130000,150000, 170000, 190000, 210000, 230000};
	
	/**
	 * Este método calcula el sueldo de un empleado teniendo en cuenta el sueldo base, su categoria y sus años tranajados en la empresa
	 * @param empleado todos los datos del empleado del cual se desea calcular su sueldo
	 * @return sueldo Sueldo total ya calculado
	 * */
	public static double sueldo(Empleado empleado) 
	{
		double sueldo=SUELDO_BASE[empleado.getCategoria()-1]+5000*empleado.anyos;
		return sueldo;
	}
	
}
