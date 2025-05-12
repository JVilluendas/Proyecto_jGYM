package proyecto_final_jgym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionjGym {
    Connection conexion;
    Statement sql;
    ResultSet registro;
    int filasAfectadas;
    private void InsertarTabla(String consulta){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://172.26.190.120:3306/jgym?serverTimezone=Europe/Madrid","conexionbd","1234");
            System.out.println("Conectado satisfatoriamente");
            
            sql = conexion.createStatement();
            
            filasAfectadas = sql.executeUpdate(consulta, Statement.RETURN_GENERATED_KEYS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error en la conexión", ex);
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
                Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error al cerrar la conexión", ex);
            }
        }
    }
    
    public boolean comprobarUsuario(String idUsuario, String contrasenya){
        boolean correcto = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://172.26.190.120:3306/jgym?serverTimezone=Europe/Madrid","conexionbd","1234");
            System.out.println("Conectado satisfatoriamente");
            
            String consulta1 = "select id_persona, contraseña from empleado where id_persona like " + idUsuario + " and contraseña like '" + contrasenya + "';";
            
            sql = conexion.prepareStatement(consulta1);
            registro = sql.executeQuery(consulta1);
            if (registro.next()) {
                correcto = true;
                return correcto;
            }
            else {
                return correcto;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error en la conexión", ex);
        }
        finally {
            if (sql != null) {
                try {
                    sql.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error al cerrar el Statement", ex);
                }
            }
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error al cerrar el SQL", ex);
                }
            }
        }
        return correcto;
    }
    
    public void meterPersona(Personas persona){
        String consulta = "insert into persona(nombre, dni, direccion, telefono) "
                + "values('" + persona.getNombre()
                + "', '" + persona.getDNI()
                + "', '" + persona.getDireccion()
                + "', '" + persona.getTelefono()
                + "');";
        InsertarTabla(consulta);
        consulta = null;
    }
    
    public void meterCliente(Cliente cliente){
        String consultaID = "select max(id_persona) as id_persona from persona;";
        meterPersona(cliente);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://172.26.190.120:3306/jgym?serverTimezone=Europe/Madrid","conexionbd","1234");
            System.out.println("Conectado satisfatoriamente");
            
            sql = conexion.createStatement();
            registro = sql.executeQuery(consultaID);
            if(registro.next()){
                cliente.setIdPersona(registro.getInt("id_persona"));
                consultaID = null;
                String consulta1 = "insert into cliente(id_persona, fecha_inscripcion) "
                        + "values('" + cliente.getIdPersona() + "', '"
                        + cliente.getDate()
                        + "')";
                filasAfectadas = sql.executeUpdate(consulta1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error en la conexión", ex);
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
                Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error al cerrar la conexión", ex);
            }
        }
        consultaID = null;
    }
    
    public void meterEmpleado(Empleado empleado){
        String consultaID = "select max(id_persona) as id_persona from persona;";
        meterPersona(empleado);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://172.26.190.120:3306/jgym?serverTimezone=Europe/Madrid","conexionbd","1234");
            System.out.println("Conectado satisfatoriamente");
            
            sql = conexion.createStatement();
            registro = sql.executeQuery(consultaID);
            if(registro.next()){
                empleado.setIdPersona(registro.getInt("id_persona"));
                String consulta1 = "insert into empleado(id_persona, salario, puesto, contraseña) "
                    + "values ('" + empleado.getIdPersona()
                    + "', '" + empleado.getSalario()
                    + "', '" + empleado.getPuesto()
                    + "', '" + empleado.getContrasenya()
                    + "');";
                filasAfectadas = sql.executeUpdate(consulta1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error en la conexión", ex);
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
                Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error al cerrar la conexión", ex);
            }
        }
        consultaID = null;
        
    }
    
    public void meterEquipamiento(Equipamiento equipamiento, int cantidad){
        String consulta = "insert into equipamiento(nombre) values('" + equipamiento.getNombre()
                + "')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://172.26.190.120:3306/jgym?serverTimezone=Europe/Madrid","conexionbd","1234");
            System.out.println("Conectado satisfatoriamente");
            
            for (int i = 0; i < cantidad; i++) {
                sql = conexion.createStatement();
                filasAfectadas = sql.executeUpdate(consulta, Statement.RETURN_GENERATED_KEYS);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error en la conexión", ex);
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
                Logger.getLogger(ConexionjGym.class.getName()).log(Level.SEVERE, "Error al cerrar la conexión", ex);
            }
        }
        consulta = null;
    }
    
    public void meterClase(ClasesGym clasesGym){
        String consulta = "insert into clase(nombre, fechaHora, realizado, id_persona) "
                + "values('" + clasesGym.getNombre()
                + "', '" + clasesGym.getFechaHora()
                + "', '" + clasesGym.getRealizado()
                + "', '" + clasesGym.getIdPersona()
                + "');";
        InsertarTabla(consulta);
        consulta = null;
    }
    
    public void meterAsistentes(int idClase, int idCliente){
        String consulta = "insert into clase_cliente(id_clase, id_cliente) "
                + "values('" + idClase + "', '" + idCliente + "');";
        InsertarTabla(consulta);
        consulta = null;
    }
    
    public void meterEquipamientoClase(int idClase,int idMaterial){
        String consulta = "insert into equipamiento_clase(id_clase, id_equipamiento) "
                + "values('" + idClase + "', '" + idMaterial + "');";
        InsertarTabla(consulta);
        consulta = null;
    }
}
