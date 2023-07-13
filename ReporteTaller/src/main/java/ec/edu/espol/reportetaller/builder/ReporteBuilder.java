/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.reportetaller.builder;

/**
 *
 * @author robes
 */
public abstract class ReporteBuilder {
    protected Reporte reporte;
    
    public Reporte obtenerReporte(){
        return reporte;
    }
    
    public abstract void definirReporte();
    public abstract void construirEncabezado();
    public abstract void construirCuerpo();
    public abstract void construirPieDePagina(); 
}
