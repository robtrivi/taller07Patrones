/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.reportetaller.builder;

/**
 *
 * @author robes
 */
public class ReporteDirector {
    private static ReporteDirector dir;
    private ReporteDirector(){
        
    }
    public static ReporteDirector getInstance(){
        if (dir == null) {
           dir = new ReporteDirector();
        }
        return dir;
    }
    
    public void generarReporte(ReporteBuilder builder){
        builder.definirReporte();
        builder.construirEncabezado();
        builder.construirCuerpo();
        builder.construirPieDePagina(); 
    }

}
