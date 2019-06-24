/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Liba;

/**
 *
 * @author USER
 */
public class Colonne {
    private String nomCol;

    
    
    public  Colonne (String nomcolonne){
        this.nomCol = nomcolonne;
    }
    
    public String getNomCol(){
        return this.nomCol;
    }
    
    public void setNomCol(String nomCol){
        this.nomCol = nomCol;
        
    }
    
}
