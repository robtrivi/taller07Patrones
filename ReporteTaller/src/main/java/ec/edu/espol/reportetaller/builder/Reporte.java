/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.reportetaller.builder;

/**
 *
 * @author robes
 */
public abstract class Reporte {
    private String encabezado;
    private String cuerpo;
    private String piePagina;
    private double size;
    private String color;

    public Reporte(String encabezado, String cuerpo, String piePagina) {
        this.encabezado = encabezado;
        this.cuerpo = cuerpo;
        this.piePagina = piePagina;
        this.size = 12;
        this.color = "black";
    }
    
    public Reporte(){
        this("","","");
    }
    
    
    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getPiePagina() {
        return piePagina;
    }

    public void setPiePagina(String piePagina) {
        this.piePagina = piePagina;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
