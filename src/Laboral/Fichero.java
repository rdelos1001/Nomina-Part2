package Laboral;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero {
	public static void altaEmpleado(Empleado empleadoNuevo) {
		boolean check = BBDD.altaEmpleadoBBDD(empleadoNuevo);
		if (check) {
			System.out.println("Se ha añadido un empleado con éxito");
			BBDD.actualizarNominas(empleadoNuevo);
		}else {
			System.out.println("Ha habido un error al añadir el empleado");
		}
	}
	
	public static void altaEmpleado(String rutaArchivo) 
	{
		try {
			File archivo = new File(rutaArchivo);
			FileReader fr= new FileReader(archivo);
			BufferedReader br=new BufferedReader(fr);
			String linea;
			
			//Formato nombre-DNI-sexo-categoria-añostrabajados
			while((linea=br.readLine()) != null)
			{
				String []datos= linea.split("-");
				Empleado empleadoNuevo= new Empleado(datos[0],datos[1],datos[2].charAt(0),Integer.parseInt(datos[3]),Integer.parseInt(datos[4]));
				altaEmpleado(empleadoNuevo);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
