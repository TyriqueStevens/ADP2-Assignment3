/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ca.cput.assignment3;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;


/**
 *
 * @author Tyrique Stevens 219089345
 */
public class ReadSerFile extends Stakeholder {
   private ObjectInputStream input;
    Stakeholder Stakeholder;
    Stakeholder[] StakeholderArray = new Stakeholder[11];
    
    Supplier[] suppliers = new Supplier[5];
    int numberOfSuppliers = 0;
    Customer[] customers = new Customer[6];
    int numberOfCustomers = 0; 
    Top1 [] top1 = new Top1[1];
    int numberOftop1 = 0;
    Top2 [] top2 = new Top2[1];
    int numberOftop2 = 0;
    
    int add = 0;
    int count = 0;
    int sum = 0;
    
    public void openSer() 
    {
        try 
        {
            input = new ObjectInputStream( new FileInputStream("stakeholder.ser"));
            System.out.println("opening ser file for reading");
        }
        catch(IOException ioe)
        {
        System.out.println("404 error..." + ioe.getMessage());
        }   
    }
    
     public void closeSer()
    {
        try{
         input.close();   
        }
        catch(IOException ioe)
        {
        System.out.println("ERROR closing ser file" + ioe.getMessage());
        }
    }
    
     public void readSer(){
         try{
             for(int i = 0; 0<StakeholderArray.length; i++){
              StakeholderArray[i] = (Stakeholder)input.readObject();
              System.out.println(StakeholderArray[i]);
             }
         }
         catch (ClassNotFoundException ioe){
             System.out.println("Error raeding Ser file "+ ioe);
     }
        catch (IOException ioe){
            System.out.println("error reading from ser file "+ ioe);
        } 
        finally{
             closeSer();
             System.out.println("File has been closed");
         }   
     }
     
     
     public void supplierArray()
    {
          suppliers[0] = new Supplier ("S270", "Grand Theft Auto", "Toyota", "Mid-size sedan");
        suppliers[1] = new Supplier ("S400", "Prime Motors", "Lexus", "Luxury sedan");
          suppliers[2] = new Supplier ("S300", "We got Cars", "Toyota", "10-seater minibus");
            suppliers[3] = new Supplier ("S350", "Auto Delight", "BMW", "Luxury SUV");
          suppliers[4] = new Supplier ("S290", "MotorMania", "Hyundai", "compact budget");
        
        
        this.numberOfSuppliers = 5;
                System.out.println("                S U P P L I E R S                   ");
        top1[0] = new Top1 ("ID ", "Name ","Product Type ","Product Description  \n"  );
             this.numberOftop1 = 1;
        
        
    for (int i = 0; i < numberOftop1 ;i++) 
              {
              System.out.println(top1[i]);
             }
         
    for (int i = 0; i < numberOfSuppliers ;i++) 
            {
             System.out.println(suppliers[i]);
             }
    }
     
     
     
    public void customerArray()
         {        
        customers[0] = new Customer ("C150 ", "Luke ", "Atmyass ", "Bellville ", "1981-01-27 ", 1520.50, false);
        customers[1] = new Customer ("C130 ", "Stu ", "Padassol ", "Sea Point ", "1987-05-18 ", 645.25, true);
        customers[2] = new Customer ("C100 ", "Mike ", "Rohsopht ", "Bellville ", "1993-01-24 ", 975.10, true);
        customers[3] = new Customer ("C300 ", "Ivana.B ", "Withew ", "Langa ", "1998-07-16 ", 1190.50, false);
        customers[4] = new Customer ("C250 ", "Eileen ", "Sideways ", "Nyanga ", "1999-11-27 ", 190.85, true);
        customers[5] = new Customer ("C260 ", "Ima ", "Stewpidas ", "Atlantis ", "2001-01-27 ", 1890.70, true);
        this.numberOfCustomers = 6;
        
        
        for (int i = 0; i < numberOfCustomers ;i++) 
        {
            System.out.println(customers[i]);
            
             }
        }
    
     public void customerAscending()
   {
        Comparator <Customer> bystHolderId = Comparator.comparing(name -> name.getStHolderId());
        Arrays.sort(customers, bystHolderId);
        
        System.out.println("                CUSTOMERS Ascending             ");
        top2[0] = new Top2 ("ID", "Name ","Surname ","Date of Birth ","Age ");
        this.numberOftop2 = 0;
            for (int i = 0; i < numberOftop2 ;i++) 
        {
            System.out.println(top2 [i]);
        }
        for (int i = 0; i < numberOfCustomers ;i++) 
        {
            System.out.println(customers[i]);
           
        }
   }


  public void supplierAscending()
   {
        Comparator<Supplier> byname = Comparator.comparing(name -> name.getName());
        Arrays.sort(suppliers, byname);
        
        top1[0] = new Top1 ("ID ","Name ","Prod Type ","Prod Description ");
        this.numberOftop1 = 1;
        for (int i = 0; i < numberOftop1 ;i++) 
        {
            System.out.println(top1[i]);
        }
        for (int i = 0; i < numberOfSuppliers ;i++) 
        {
            System.out.println(suppliers[i]);
        }
   }


}
