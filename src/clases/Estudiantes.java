/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author yanyg
 */
public class Estudiantes {
    String nombre;
    int num_id;
    int edad;
    String codigo;
    String facultad;
    String programa;
    String modalidad;
    
    public Estudiantes(String nombre, int num_id, int edad, String codigo, String facultad, String programa, String modalidad){
        this.nombre=nombre;
        this.num_id=num_id;
        this.edad=edad;
        //this.codigo=codigo;
        this.facultad=facultad;
        this.programa=programa;
        this.modalidad=modalidad;
        
    }

    public Estudiantes(String text, int num_id, int ed, int cod, String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getNombre(){
        return nombre;
    }
    public int getNum_id(){
        return num_id;
    }
    public int getEdad(){
        return edad;
    }
    public String getCodigo(){
        codigo= "UC"+num_id+programa.substring(0, 1);
        return codigo;
    }
    public String getFacultad(){
        return facultad;
    }
    public String getPrograma(){
        return programa;
    }
    public String getModalidad(){
        return modalidad;
    }
    
}
