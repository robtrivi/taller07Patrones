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
public class DecoradorSize extends ReporteDecorador{
    
    public DecoradorSize(Reporte reporte) {
        super(reporte);
    }
    
    public void cambiarTamanio(int size){
        //logica para cambiar el tamaño
    }
}
