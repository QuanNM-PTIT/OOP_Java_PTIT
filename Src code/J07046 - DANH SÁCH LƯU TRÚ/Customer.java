// Created by Nguyễn Mạnh Quân at 09:14 on 01/12/2022

package J07046;

import java.util.Date;

public class Customer implements Comparable<Customer>
{
    private String ID;
    private String name;
    private String roomID;
    private Date arrivalDate;
    private Date departureDate;
    private long daysOfStay;
    private static int cnt = 1;

    public Customer(String name, String roomID, Date arrivalDate, Date departureDate)
    {
        this.ID = String.format("KH%02d", cnt++);
        this.name = name;
        this.roomID = roomID;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.daysOfStay = (departureDate.getTime() - arrivalDate.getTime()) / (1000l * 60 * 60 * 24);
    }

    @Override
    public String toString()
    {
        return ID + " " + name + " " + roomID + " " + daysOfStay;
    }


    @Override
    public int compareTo(Customer o)
    {
        return (int) (o.daysOfStay - this.daysOfStay);
    }
}
