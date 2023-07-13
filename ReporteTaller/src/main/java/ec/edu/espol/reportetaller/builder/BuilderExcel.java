/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.reportetaller.builder;

/**
 *
 * @author robes
 */
public class BuilderExcel implements ReporteBuilder{
    private Reporte reporte;
    @Override
    public void definirReporte() {
        this.reporte = new Word();
        //Logica para definirReporte
    }

    @Override
    public void construirEncabezado() {
        //Logica para construirEncabezado
    }

    @Override
    public void construirCuerpo() {
        //Logica para construirCuerpo
    }

    @Override
    public void construirPieDePagina() {
        //Logica para construirPieDePagina
    }

    public Reporte getResult() {
        return this.reporte;
    }
}
