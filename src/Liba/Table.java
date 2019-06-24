/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Liba;

import java.io.File;
import java.util.List;


/**
 *
 * @author USER
 */
public class Table {
    private String nomTable ;
    private CreateDataBase db;
    /*
    pour chaque colonne creee il y aura dans un fichier le fichier
    Json un JSONObject 
    */
    public List<Colonne> col;
    
    public Table(String NomT, String dbase){       
        try{
             String path = "D:\\travaux\\Projet\\JavaApplication1\\"+dbase;
             String NTb = NomT+".json";
             File table  = new File(path);
             
             Boolean exists = table.exists();
             /*
             Verify if the same file has been Created , if it's already created
             it's notify the user else it's create the file*/
             if(exists == true){
                 System.out.println("the same file has beens created change the name and retry!");
             }
             else{ 
                 File f = new File(path + File.separator + NTb);
                 
             System.out.println("Table created SuccessFully!");
                              
             }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void NewCol(String Col){
        Colonne colonne = new Colonne("test");
        /*
        celui-ci sera ajouter au fichier de la table qui sera un JSONArray 
        avec plusieurs une agregation des colonne 
        */
       
    }
    
    public String GetNomTable(){
        return this.nomTable;
    }
}
