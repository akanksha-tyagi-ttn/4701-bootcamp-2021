package com.ttn_assignment_javatwo;

public class Nine_FurnitureFactory
{
    public static Nine_Furniture getInstance(String typeof)
    {
        if(typeof.toLowerCase().equals("chair"))
            return new Nine_Chair();
        else
            return new Nine_Table();
    }
}
