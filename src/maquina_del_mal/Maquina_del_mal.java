/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina_del_mal;

import Estructura.*;
import java.util.ArrayList;

/**
 *
 * @author Vader33
 */
public class Maquina_del_mal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstadoInicial ini= new EstadoInicial();
        GiroInicial giro= new GiroInicial();
        DevolverDulce dulce = new DevolverDulce();
            
        ArrayList<Estado> lista= new ArrayList<>();
        lista.add(ini);
        lista.add(giro);
        lista.add(dulce);
        
        
        
        MaquinaDulce maquina= new MaquinaDulce(lista);
        
        maquina.procesar();
        maquina.procesar();
        maquina.procesar();
        
        maquina.setMoneda(true);
        
        maquina.procesar();
        maquina.procesar();
        maquina.procesar();
        
        
        // TODO code application logic here
    }
    
}
