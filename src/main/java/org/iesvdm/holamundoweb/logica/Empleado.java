package org.iesvdm.holamundoweb.logica;

import java.util.Date;

public class Empleado {

    private int idEmpleado; // Clave primaria de la tabla
    private String nombre;  // Nombre del empleado
    private String apellidos; // Apellidos del empleado
    private String dni;      // DNI del empleado
    private Date fechaNacimiento; // Fecha de nacimiento
    private String telefono; // Teléfono del empleado
    private double salario;  // Salario del empleado

    // Constructor sin argumentos
    public Empleado() {
    }

    // Constructor con argumentos
    public Empleado(int idEmpleado, String nombre, String apellidos, String dni, Date fechaNacimiento, String telefono, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.salario = salario;
    }

    // Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString para imprimir detalles del empleado
    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", telefono='" + telefono + '\'' +
                ", salario=" + salario +
                '}';
    }

}
