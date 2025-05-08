package proyecto_jgym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectarBD {
    Connection conexion;
    Statement sql;
    //ResultSet registro;
    int filasAfectadas;
    public void InsertarBD(String contrasenya, Persona persona, Cliente cliente, Empleado empleado, Clases clases, Equipamiento equipamiento){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/VideoClub?serverTimezone=Europe/Madrid","root", contrasenya);
            System.out.println("Conexión establecida satisfactoriamente");
            
            //Tabla clientes
            String consulta = "insert into Cliente(idCliente, DNI, nombre, telefono, direccion) "
                    + "values ('" 
                    + cliente.getIdCliente() + "', '" 
                    + cliente.getDNI() + "', '" 
                    + cliente.getNombre() + "', '" 
                    + cliente.getTelefono() + "', '" 
                    + cliente.getDireccion() + "');";
            sql = conexion.createStatement();
            filasAfectadas = sql.executeUpdate(consulta);
            consulta = null;
            
            //Tabla empleados
            consulta = "insert into Empleado(idEmpleado, DNI, nombre, telefono, direccion) "
                    + "values ('" 
                    + empleado.getIdEmpleado() + "', '" 
                    + empleado.getDNI() + "', '" 
                    + empleado.getNombre() + "', '" 
                    + empleado.getTelefono() + "', '" 
                    + empleado.getDireccion() + "');";
            filasAfectadas = sql.executeUpdate(consulta);
            consulta = null;
            
            //Tabla clases
            consulta = "insert into Clases(numClase, nombreClase, fecha_hora) "
                    + "values ('" 
                    + clases.getNumClase() + "', '" 
                    + clases.getNombreClase() + "', '" 
                    + clases.getFecha_hora() + "');";
            filasAfectadas = sql.executeUpdate(consulta);
            consulta = null;
            
            //Tabla equipamiento
            consulta = "insert into Equipamiento(idEquipamiento, nombreMaterial) "
                    + "values ('" 
                    + equipamiento.getIdEquipamiento() + "', '" 
                    + equipamiento.getNombreMaterial() + "');";
            filasAfectadas = sql.executeUpdate(consulta);
            consulta = null;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (sql != null) {
                    sql.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            }
            catch(SQLException ex) {
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, "Error al cerrar la conexión", ex);
            }
        }
    }
}
