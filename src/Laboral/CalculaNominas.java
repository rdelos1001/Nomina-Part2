package Laboral;
import java.util.Scanner;
/**
 * Esta clase posee el método principal
 * @author Raúl;
 * */
public class CalculaNominas {

	/**
	 * Este es el método principal que crea dos empleados, muestra sus atributos 
	 * incrementa en 1 el año de antiguedad en la empresa del segundo empleado, cambia la categoria del primer
	 * empleado a 9 y por último vuelve a mostrar la información de los 2 empleados
	 * */
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		Empleado empleado1 = new Empleado("James Cosling","32000032G",'H',4,7);	
		Empleado empleado2 = new Empleado("Ada Lovelace","32000031R",'M');
		escribe(empleado1,empleado2);
		empleado2.incrAnyo();
		empleado1.setCategoria(9);
		escribe(empleado1,empleado2);
		
		String respuesta;
		do {
			System.out.println("Quieres introducir un nuevo empleado");
			respuesta= sc.nextLine();
			if(respuesta.toUpperCase().equals("SI")) 
			{
				String nombre;
				char sexo;
				String dni;
				int categoria;
				int anyos;
				System.out.print("Nombre:");
				nombre= sc.nextLine();
				
				do {
					System.out.print("Sexo (H o M):");
					sexo= sc.nextLine().charAt(0);
				}while(sexo!='H' && sexo!='M');
				
				do {
					System.out.print("Dni:");
					dni= sc.nextLine();
				}while(dni.length()!=9);
				
				do {
					System.out.print("Categoria:");
					categoria= sc.nextInt();
				}while(categoria<1 || categoria>10);
				
				do {
					System.out.print("Años de antiguedad:");
					anyos= sc.nextInt();
				}while(anyos<0);
				
				Empleado empleadoNuevo = new Empleado(nombre,dni,sexo,categoria,anyos);
				Fichero.altaEmpleado(empleadoNuevo);
			}
		}while(respuesta.toUpperCase().equals("SI"));
		
		//Ejercicio 3
		Fichero.altaEmpleado("/home/raul/eclipse-workspace/NominaPart2/fichero/fichero.txt");
		
		//Ejercicio 4
		
	}
	
	/**
	 * Este método muestra los atributos de dos empleados y su correspondiente sueldo
	 * @param empleado1 Es el primer empleado
	 * @param empleado2 Es el segundo empleado
	 * */
	private static void escribe (Empleado empleado1,Empleado empleado2) 
	{
		System.out.println("------------------------------------");
		empleado1.imprime();
		System.out.println("Sueldo: "+Nomina.sueldo(empleado1));
		System.out.println("------------------------------------");
		empleado2.imprime();
		System.out.println("Sueldo: "+Nomina.sueldo(empleado2));
	}
	

}
