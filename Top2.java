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
public class Top2
{
    private String ID;
    private String Name;
    private String Surname;
    private String DateOfBirth;
    private String Age;

    public Top2(String ID, String Name, String Surname, String Dateofbirth, String Age)
    {
        this.ID = ID;
        this.Name = Name;
        this.Surname = Surname;
        this.DateOfBirth = Dateofbirth;
        this.Age = Age;
    }

    public String getID()
    {
                return ID;
    }

    public void setID(String ID)
    {
                this.ID = ID;
    }

    public String getName()
    {
                return Name;
    }

    public void setName(String Name)
    {
                this.Name = Name;
    }

    public String getSurname()
    {
                return Surname;
    }

    public void setSurname(String Surname)
    {
                this.Surname = Surname;
    }

    public String getDateofbirth()
    {
             return DateOfBirth;
    }

    public void setDateofbirth(String Dateofbirth)
    {
                this.DateOfBirth = Dateofbirth;
    }

    public String getAge()
    {
                 return Age;
    }

    public void setAge(String Age)
    {
                    this.Age = Age;
    }

 
    @Override
    public String toString()
    {
            return String.format("%-30s", getID(), getName(),
                         getSurname(), getDateofbirth(), getAge());
    }
    
}
