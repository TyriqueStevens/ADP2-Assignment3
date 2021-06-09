/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ca.cput.assignment3;

/**
 *
 * @author Tyrique Stevens 219089345
 */
public class Main {
    public static void main(String[]args)
    {
    ReadSerFile myObj = new ReadSerFile();
    myObj.openSer();
    myObj.readSer();
   // myReadObj.closeSer();
   myObj.customerArray();
   myObj.supplierArray();
   myObj.customerAscending();
 myObj.supplierAscending();
    }
    
}
