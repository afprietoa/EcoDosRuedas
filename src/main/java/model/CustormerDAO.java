/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author afprietoa
 */
public class CustormerDAO {
    Connexion connectedObj = new Connexion();
    Connection conObj;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listItems(){
        List<Customer> customers;
        customers = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
       try{
           conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               Customer cust =new Customer();
               cust.setUsername(rs.getString(1));
               cust.setPassword(rs.getString(2));
               cust.setName(rs.getString(3));
               cust.setLastname(rs.getString(4));
               cust.setEmail(rs.getString(5));
               cust.setCellphone(rs.getString(6));
               cust.setDate(rs.getString(7));

               customers.add(cust);
               System.out.println(rs.getString(1)+ " "
                                 +rs.getString(2)+ " "
                                 +rs.getString(3)+ " "
                                 +rs.getString(4)+ " "
                                 +rs.getString(5)+ " "
                                 +rs.getString(6)+ " "
                                 +rs.getString(7));
           }
       }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
       }
       
       
       return customers;
        
    }
 
    public int addItem(Customer cust){
      String sql = "INSERT INTO cliente(clte_usuario,clte_contraseña,clte_nombre,clte_apellido,clte_email,clte_celular,clte_fecha) values(?,?,?,?,?,?,?) ";
      try{
          conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           ps.setString(1,cust.getUsername());
           ps.setString(2,cust.getPassword());
           ps.setString(3,cust.getName());
           ps.setString(4,cust.getLastname());
           ps.setString(5,cust.getEmail());
           ps.setString(6,cust.getCellphone());
           ps.setString(7,cust.getDate());
           
           ps.executeUpdate();
      }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
      }
      return 1;
    };
    
    public int updateItem(Customer cust){
      String sql = "UPDATE cliente set clte_usuario=?, clte_contraseña=?, clte_nombre=?, clte_apellido=?, clte_email=?, clte_celular=?, clte_fecha=? WHERE clte_usuario=?";
      try{
          conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           
           ps.setString(1,cust.getUsername());
           
           ps.setString(2,cust.getPassword());
           ps.setString(3,cust.getName());
           ps.setString(4,cust.getLastname());
           ps.setString(5,cust.getEmail());
           ps.setString(6,cust.getCellphone());
           ps.setString(7,cust.getDate());
           
           ps.setString(8,cust.getUsername());
           
           ps.executeUpdate();          
      }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
      }
      return 1;  
    };
    
    public void deleteItem(String user){
        String sql = "DELETE FROM cliente WHERE clte_usuario="+ '"'+user+'"';
        try{
           conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           ps.executeUpdate();
        }catch(Exception e){
            System.out.println(sql);
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
        }
    }
    
}
