/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.reportetaller.builder;

/**
 *
 * @author robes
 */
public interface ReporteBuilder {
    
    public abstract void definirReporte();
    public abstract void construirEncabezado();
    public abstract void construirCuerpo();
    public abstract void construirPieDePagina(); 
}
