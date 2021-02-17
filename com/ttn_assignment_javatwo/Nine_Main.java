package com.ttn_assignment_javatwo;
public class Nine_Main
{
    public static void main(String[] args)
    {
        System.out.print("creating chair object using factoryClass:   ");
        Nine_Furniture furniture=Nine_FurnitureFactory.getInstance("chair");
        System.out.print(furniture.toString());

        System.out.println("\nCreating objects of chair using new keyword...");
        Nine_Furniture chair1=new Nine_Chair("wood",150,true);
        System.out.print(chair1.toString());

        System.out.println("\ncreating Table object using factoryClass");
        Nine_Furniture table_furniture=Nine_FurnitureFactory.getInstance("table");
        System.out.print(table_furniture.toString());

        System.out.println("\nCreating objects of table using new keyword...");
        Nine_Furniture table1=new Nine_Table("metal",300,true);
        System.out.print(table1.toString());

    }
}
