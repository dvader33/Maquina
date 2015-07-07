/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.List;

/**
 *
 * @author Vader33
 */
public class MaquinaDulce {
    private int estado;
    private boolean moneda;
    List<Estado> estados;

    public MaquinaDulce( List<Estado> estados) {
        this.moneda=false;
        this.estado=0;
        this.estados = estados;
    }
    
    
    
    public void procesar(){
        
        this.estados.get(estado).CambioEstado(this);
    }
    public void SeteEstado(int e){
        this.estado=e;
    }
    public boolean getMoneda(){
        return moneda;
    }
    public void setMoneda(boolean m){
        this.moneda=m;
    }
    
    
    
          
    
}
