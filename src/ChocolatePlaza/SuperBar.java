package ChocolatePlaza;

import src.ChocolateBar.InnerChocolateBar.DairyMilk;
import java.util.Scanner;
import java.util.zip.Checksum;
import java.io.*;
import java.util.Random;


public class SuperBar extends DairyMilk {
    
    double Hazelnut, Peanuts;
    private int id;
    private String name;
    private float priceEur;
    private boolean filling;
                                                            
     // constructicons
    public SuperBar(int id, String name, float priceEur, boolean filling){
    this.id = id;
    this.name = name;
    this.priceEur = priceEur;
    this.filling = filling;
    }
    
    // overload constructicons
    public SuperBar(int id, String name, float priceEur, boolean filling, double Hazelnut){
        this(id, name, priceEur, filling);
        this.Hazelnut = Hazelnut;
    }
    
    @Override
    double sales(){
        return 1;
    }

    @Override
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Price: " + priceEur);
        System.out.println("Filling: " + filling);
    }

    @Override
    public String toString(){
        return "\nId: " + id +
                "\nName: " + name +
                "\nPrice: " + priceEur +
                "\nFilling: " + filling +
                this.sales() + "\n";
    }
    
    public static void main(String[] args) {
        SuperBar Flake = new SuperBar(0 , null, 0, false);
        //using print overide toString methods
        System.out.println(Flake.toString());


    }
}