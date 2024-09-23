/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Docente extends Persona{
    private int id;
    private String codigo;
    private String salario;
    private String fecha_laboral;
    private String fecha_registro;
    Conexion cn;
    public Docente(){}

    public Docente(int id, String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String codigo, String salario, String fecha_laboral, String fecha_registro) {
        super(nit, nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.id = id;
        this.codigo = codigo;
        this.salario = salario;
        this.fecha_laboral = fecha_laboral;
        this.fecha_registro = fecha_registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
    public String getFecha_laboral() {
        return fecha_laboral;
    }

    public void setFecha_laboral(String fecha_laboral) {
        this.fecha_laboral = fecha_laboral;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
    @Override
    public void agregar() {
        try{
            PreparedStatement parametro;
            cn= new Conexion();
            cn.abrir_conexion();
            String query = "INSERT INTO docente(nit, nombres, apellidos, direccion, telefono, fecha_nacimiento, codigo_docente, salario, fecha_ingreso_laboral, fecha_ingreso_registro) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setString(1, getNit());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setString(7, getCodigo());
            parametro.setString(8, getSalario());
            parametro.setString(9, getFecha_laboral());
            parametro.setString(10, getFecha_registro());
            int ejecutar = parametro.executeUpdate();
            System.out.println("Ingreeso exitoso, han afectado :" + Integer.toString(ejecutar) );
            cn.cerrar_conexion();
        } catch(SQLException ex){
            System.out.println("Algo salio mal : " + ex.getMessage());
        }
    }
    
    @Override
    public DefaultTableModel leer(){
        DefaultTableModel tabla = new DefaultTableModel();
        try{
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "SELECT * FROM docente;";
            ResultSet consulta = cn.conexionDB.createStatement().executeQuery(query);
            String encabezado[] = {"id", "nit","nombres","apellidos","direccion", "telefono","nacimiento", "codigo_docente", "salario", "fecha_ingreso_laboral", "fecha_ingreso_registro"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String [11];
            while(consulta.next()){
                datos[0] = consulta.getString("id_docente");
                datos[1] = consulta.getString("nit");
                datos[2] = consulta.getString("nombres");
                datos[3] = consulta.getString("apellidos");
                datos[4] = consulta.getString("direccion");
                datos[5] = consulta.getString("telefono");
                datos[6] = consulta.getString("fecha_nacimiento");
                datos[7] = consulta.getString("codigo_docente");
                datos[8] = consulta.getString("salario");
                datos[9] = consulta.getString("fecha_ingreso_laboral");
                datos[10] = consulta.getString("fecha_ingreso_registro");
                tabla.addRow(datos);
            }
            cn.cerrar_conexion();
        }catch(SQLException ex){
            System.out.println("Error en leer " + ex.getMessage());
        }
            return tabla;
    }
    
    public void actualizar(){
        try{
            PreparedStatement parametro;
            cn= new Conexion();
            cn.abrir_conexion();
            String query = "UPDATE docente SET nit = ?, nombres = ?, apellidos = ?, direccion = ?, telefono = ?, fecha_nacimiento = ?, codigo_docente = ?, salario = ?, fecha_ingreso_laboral = ?, fecha_ingreso_registro = ? WHERE id_docente = ?;";
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setString(1, getNit());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setString(7, getCodigo());
            parametro.setString(8, getSalario());
            parametro.setString(9, getFecha_laboral());
            parametro.setString(10, getFecha_registro());
            parametro.setInt(11, getId());
            int ejecutar = parametro.executeUpdate();
            System.out.println("Modificación exitosa :" + Integer.toString(ejecutar) );
            cn.cerrar_conexion();
            
        } catch(SQLException ex){
            System.out.println("Error en modificación : " + ex.getMessage());
        }
    }
    
    public void borrar(){
        try{
            PreparedStatement parametro;
            cn= new Conexion();
            cn.abrir_conexion();
            String query = "DELETE FROM docente WHERE id_docente = ?;";
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setInt(1, getId());
            int ejecutar = parametro.executeUpdate();
            System.out.println("Eliminación exitosa:" + Integer.toString(ejecutar) );
            cn.cerrar_conexion();
        } catch(SQLException ex){
            System.out.println("Error en borrar: " + ex.getMessage());
        }
    }    
}
