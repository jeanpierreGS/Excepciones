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
public class MiExcepcionNumerica extends Exception{

    private final static String MENSAJE = ""+" Error de conversion numerica"+" ingresar un texto que contenga un numero";
    public MiExcepcionNumerica() {
        super(MENSAJE);
    }
     
    
}
