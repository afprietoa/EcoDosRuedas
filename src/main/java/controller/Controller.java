/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.CustormerDAO;
import model.Customer;
import view.WindowFrame;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author afprietoa
 */
public class Controller implements ActionListener{

    CustormerDAO daoCustomer= new CustormerDAO();
    Customer cust= new Customer();
    WindowFrame view= new WindowFrame();
    DefaultTableModel model=new DefaultTableModel();
    
    public Controller(WindowFrame v){
        this.view=v;
        this.view.btnList.addActionListener(this);
        this.view.btnSave.addActionListener(this);
        this.view.btnUpdate.addActionListener(this);
        this.view.btnOk.addActionListener(this);
        this.view.btnDelete.addActionListener(this);
        listItems(view.table);
        
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {

        
        if(e.getSource() == view.btnList){
            cleanTable();
            listItems(view.table);
        }
        if(e.getSource() == view.btnSave){
            addItem();
            cleanTable();
            listItems(view.table);
        }
        if(e.getSource() == view.btnUpdate){
            int row = view.table.getSelectedRow();
            if(row == -1){
                JOptionPane.showMessageDialog(view, "Should select a row!");
            }
            else{
                String user  =   (String)view.table.getValueAt(row, 0).toString();
                String password = (String)view.table.getValueAt(row, 1);
                String name= (String)view.table.getValueAt(row,2);
                String lastname = (String)view.table.getValueAt(row,3).toString();
                String email = (String)view.table.getValueAt(row,4).toString();
                String cellphone = (String)view.table.getValueAt(row,5);
                String date = (String)view.table.getValueAt(row,6);
                
                view.txtUser.setText(user);
                view.txtPassword.setText(password);
                view.txtEmail.setText(name);
                view.txtName.setText(lastname);
                view.txtLastname.setText(email);
                view.txtCellphone.setText(cellphone);
                view.txtDate.setText(date);
            }
        }
        if(e.getSource() == view.btnOk){
            updateItem();
            cleanTable();
            listItems(view.table);
        }
        if(e.getSource() == view.btnDelete){
           deleteItem();
           cleanTable();
           listItems(view.table);
        }

    }
    
    public void cleanTable(){
        for(int i=0; i< view.table.getRowCount();i++){
            model.removeRow(i);
            i=i-1;
        }
    }
    
    public void deleteItem(){
            int row = view.table.getSelectedRow();
            String user = (String)view.table.getValueAt(row,0).toString();
            if(row == -1){
                JOptionPane.showMessageDialog(view, "Should select a row!");
            }
            else{
                System.out.println(user);
                daoCustomer.deleteItem(user);
                JOptionPane.showMessageDialog(view, "The customer was deleted successfully!");
            }
    }
    
    public void updateItem(){
        String user = view.txtUser.getText();
        String password = String.valueOf(view.txtPassword.getPassword());
        String name= view.txtEmail.getText();
        String lastname = view.txtName.getText();
        String email = view.txtName.getText();
        String cellphone = view.txtCellphone.getText();
        String date = view.txtDate.getText();
        
        cust.setUsername(user);
        cust.setPassword(password);
        cust.setName(name);
        cust.setLastname(lastname);
        cust.setEmail(email);
        cust.setCellphone(cellphone);
        cust.setDate(date);
        
        int sentinel = daoCustomer.updateItem(cust);
        if(sentinel == 1){
            JOptionPane.showMessageDialog(view, "The customer was updated successfully!");
        }else{
            JOptionPane.showMessageDialog(view, "Error!");
        }
    }
    
    public void addItem(){
        String user = view.txtUser.getText();
        String password = String.valueOf(view.txtPassword.getPassword());
        String name= view.txtName.getText();
        String lastname = view.txtLastname.getText();
        String email = view.txtEmail.getText();
        String cellphone = view.txtCellphone.getText();
        String date = view.txtDate.getText();
        
        cust.setUsername(user);
        cust.setPassword(password);
        cust.setName(name);
        cust.setLastname(lastname);
        cust.setEmail(email);
        cust.setCellphone(cellphone);
        cust.setDate(date);
        
        int sentinel=daoCustomer.addItem(cust);
        
        if(sentinel == 1){
           JOptionPane.showMessageDialog(view,"The customer was added successfully!");
        }else{
           JOptionPane.showMessageDialog(view,"Error!");
        }
    }
    
    public void listItems(JTable table){
        
        model=(DefaultTableModel) table.getModel();
        List<Customer> customers= daoCustomer.listItems();
        Object[] obj = new Object[7];
        for(int i=0; i<customers.size();i++){
            obj[0] = customers.get(i).getUsername();
            obj[1] = customers.get(i).getPassword();
            obj[2] = customers.get(i).getName();
            obj[3] = customers.get(i).getLastname();
            obj[4] = customers.get(i).getEmail();
            obj[5] = customers.get(i).getCellphone();
            obj[6] = customers.get(i).getDate();
            model.addRow(obj);
        }
        
        view.table.setModel(model);
    }
   
}
