/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author Vader33
 */
public class GiroInicial implements Estado {

    @Override
    public void CambioEstado(MaquinaDulce maquina) {
        if(maquina.getMoneda()){
            maquina.SeteEstado(2);
            System.out.println("si hay moneda");
        }
        else{
            maquina.SeteEstado(0);
            System.out.println("no hay moneda");
        }
    }
    
}
