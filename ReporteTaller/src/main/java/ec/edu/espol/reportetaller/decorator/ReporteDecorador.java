/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.reportetaller.decorator;

import ec.edu.espol.reportetaller.builder.Reporte;

/**
 *
 * @author robes
 */
public abstract class ReporteDecorador extends Reporte{
    private Reporte reporte;
    
    public ReporteDecorador(Reporte reporte){
        this.reporte = reporte;
    }
}
