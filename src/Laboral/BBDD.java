package Laboral;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BBDD {
	
	public static boolean altaEmpleadoBBDD(Empleado empleadonuevo) {
		Connection conn=null;
		Statement st=null;
		boolean check=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:4080/NominaPart2","root","");
			st= conn.createStatement();
			st.executeUpdate("INSERT INTO empleado VALUES('"+empleadonuevo.nombre+"','"+empleadonuevo.dni+"','"
			+empleadonuevo.sexo+"',"+empleadonuevo.getCategoria()+","+empleadonuevo.anyos+")");
			check=true;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(conn!=null)conn.close();
				if(st!=null)st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}
	public static boolean actualizarNominas (Empleado empleado) 
	{
		double sueldo=0;
		sueldo=Nomina.sueldo(empleado);
		
		Connection conn=null;
		Statement st=null;
		boolean check=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:4080/NominaPart2","root","");
			st= conn.createStatement();
			st.executeUpdate("INSERT INTO nominas VALUES('"+empleado.dni+"',"+sueldo+")");
			check=true;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(conn!=null)conn.close();
				if(st!=null)st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}
	
	public static void backup()
	{
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		String tabla="empleado";
		boolean check=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:4080/NominaPart2","root","");
			st= conn.createStatement();
			
			check=true;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(conn!=null)conn.close();
				if(st!=null)st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
