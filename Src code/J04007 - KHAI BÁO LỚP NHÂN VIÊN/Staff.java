// Created by Nguyễn Mạnh Quân at 15:19 on 02/09/2022

package J04007;

public class Staff
{
    private String ID, Name, Sex, dateOfBirth, Address, taxID, contractDate;

    public Staff(String name, String sex, String dateOfBirth, String address, String taxID, String contractDate)
    {
        this.ID = "00001";
        Name = name;
        Sex = sex;
        this.dateOfBirth = dateOfBirth;
        Address = address;
        this.taxID = taxID;
        this.contractDate = contractDate;
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

    public void setName(String name)
    {
        Name = name;
    }

    public String getSex()
    {
        return Sex;
    }

    public void setSex(String sex)
    {
        Sex = sex;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        Address = address;
    }

    public String getTaxID()
    {
        return taxID;
    }

    public void setTaxID(String taxID)
    {
        this.taxID = taxID;
    }

    public String getContractDate()
    {
        return contractDate;
    }

    public void setContractDate(String contractDate)
    {
        this.contractDate = contractDate;
    }
}
