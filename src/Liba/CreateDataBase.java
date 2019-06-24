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
public class CreateDataBase {
    private String DbName;
    private List<Table> tables ;
    
    
    public CreateDataBase(){
        try{
            File DataBase = new File(".\\CongoDb_project");
            DataBase.mkdir();
            File table =  new File(".\\CongoDb_project\\NewTable.json");
            table.createNewFile();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Default Data Base Creation Succeeded");
    }
    
    public CreateDataBase(String db){
        try{
            String path =".\\"+db; 
            File DataBase = new File(path); 
            Boolean ChecksIfDirExist = DataBase.exists();
            
            if(ChecksIfDirExist == true){
                System.out.println("The dir has been created or already exist\n");
                System.exit(0);
            }
            else{
                DataBase.mkdir();
                System.out.println("Data base Created Successfuly!\n ");
            
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void NewTable(String name, String db){
        Table table = new Table(name,db);
        /*
        la db aura un ensemble de fichier ,qui sont les tables meme 
        donc chaque table est un nouveau fichier cree dans la db sous la nom de la 
        nouvelle table creee dans la db 
        */
    }
    
    public String GetDbName(){
        return this.DbName;
    }
}
