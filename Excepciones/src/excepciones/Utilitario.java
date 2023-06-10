/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepcionesPersonalisadas.MiExcepcionNumerica;
import excepcionesPersonalisadas.MiExcepcionGenerica;

/**
 *
 * @author JeanPierre
 */
public class Utilitario {

    public static int convertir(String numeroEnTexto) 
            throws 
            MiExcepcionNumerica,
            MiExcepcionGenerica{
        try{
            return Integer.parseInt(numeroEnTexto);
        }catch(NumberFormatException s){
            throw new MiExcepcionNumerica();
        }catch(Exception ex){
            throw new MiExcepcionGenerica();
        }
    }
}
