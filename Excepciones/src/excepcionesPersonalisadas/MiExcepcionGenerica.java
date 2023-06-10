/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalisadas;

/**
 *
 * @author JeanPierre
 */
public class MiExcepcionGenerica extends Exception{

    private final static String MESSAGE=""
            +"Error de conversion numerica, "
            +"Ingresar un texto que contega un numero";
    
    public MiExcepcionGenerica() {
        super(MESSAGE);
    }
    
}
