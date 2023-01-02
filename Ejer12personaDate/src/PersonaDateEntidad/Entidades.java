/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaDateEntidad;

import java.util.Date;

/**
 *
 * @author Facundo
 */
public class Entidades {
    private String nombre;
    private Date nacimiento;

    public Entidades() {
    }

    public Entidades(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
}
