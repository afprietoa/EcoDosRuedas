/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author afprietoa
 */
public class Connexion {
    Connection connectedObj;
    public Connection getConnection(){
        String url = "jdbc:mysql://127.0.0.1:3306/ecodosruedas";
        String user = "root";
        String pass = "8746554201";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connectedObj = DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.out.println("DID NOT CONNECT!");
            e.printStackTrace();
        }
        return connectedObj;
    };
}
