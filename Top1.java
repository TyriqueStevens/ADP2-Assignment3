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
public class Top1 {
    
    private String ID;
    private String Name;
    private String ProdType;
    private String ProdDescription;
    
        public Top1()
        {    
        }

        public Top1(String ID, String Name, String ProdType, String ProdDescription)
        {
            this.ID = ID;
            this.Name = Name;
            this.ProdType = ProdType;
            this.ProdDescription = ProdDescription;
        }

        public String getID()
        {
                return ID;
        }

        public String getName()
        {
                  return Name;
        }

        public String getProdType()
        {
                     return ProdType;
        }

        public String getProdDescription()
        {
                   return ProdDescription;
        }

        public void setID(String ID)
        {
                 this.ID = ID;
        }

        public void setName(String Name)
        {
                  this.Name = Name;
        }

        public void setProdType(String ProdType)
        {
                    this.ProdType = ProdType;
        }

        public void setProdDescription(String ProdDescription)
        {
                    this.ProdDescription = ProdDescription;
        }

        @Override
        public String toString()
        {
                    return String.format("%-5s\t%-20s\t%-10s\t%-15s",getID(),getName(),getProdType(),getProdDescription());
        }
        
    }


