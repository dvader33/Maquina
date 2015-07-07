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
public class EstadoInicial implements Estado {

    @Override
    public void CambioEstado(MaquinaDulce maquina) {
        System.out.println("Estado inicial");
       maquina.SeteEstado(1);
    }
    
}
