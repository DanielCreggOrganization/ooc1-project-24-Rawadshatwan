package ie.atu.testpackage;

import java.util.Scanner;
import java.util.zip.Checksum;
import java.io.*;
import java.util.Random;

abstract class ChocolateBar {

    public static int length;
        // universal variables
        int id;
        // int oompaloompa;
        String name;
        float priceEur;
        double time = 37.5;
        public static final float sugar_FEE = 50;
    
        boolean willy = true;
    
        // method stuff
        abstract void display();
    
        static void displaysugarFee() {
            System.out.println("Chocolate Rain");
        }
    
    } // end of ChocolateBar
    
    public class Kitkat {
    
        public String GetKitkat() {
            return "KitKats here ";
        }
    } // end of Chunk
    
    // interface created here
    public interface ChocolateDegree {
        // variables
        final double Chocolatefee = 3000;
        final double discountfactor = 0.2;
        final float sugarfee = 100;
    
        // abstract methods
        abstract void payChocolate();
    
        abstract double calculateBars();
    
        // interface methods
        default void displaypayChocolate() {
            System.out.println("The Chocolate fee " + Chocolatefee);
        }
    
        public static void displaysugarfee() {
            System.out.println("The Sugar " + sugarfee);
        }
    } // end of interface
    
    public class Mars extends NutChocolate {
        double milk;
        static double cocoa;
    
        // constructor for this class Number 1
        public Mars(int id, String crunch, float priceEur, int oompaloompa) {
                    this.id = id;
                    this.oompaloompa = oompaloompa;
                    this.name = crunch;
            this.priceEur = priceEur;
        }
    
        // constructor for this class Number 2 (uses number 1)
        public Mars(int id, String name, float priceEur, int oompaloompa, double milk) {
            this(id, name, priceEur, oompaloompa);
            this.milk = milk;
        }
    
        @Override
        double calculateBars() {
            cocoa = (time + milk) * priceEur;
            return cocoa;
        }
    
        @Override
        void display() {
            System.out.println("ID: " + id);
            System.out.println("Name " + name);
            System.out.println("Oompa Loompa " + oompaloompa);
            System.out.println("Cocoa " + cocoa);
        }
    
        @Override
        public String toString() {
            return "\nId: " + id +
                    "\nName: " + name +
                    "\nOompa Loompa: " + oompaloompa +
                    "\nCocoa: " + cocoa +
                    this.calculateBars() + "\n";
        }
    
        public static void main(String[] args) {
            String Crunch;
                        Mars munch = new Mars(1234, Crunch, 20, 3);
            System.out.println("this is : " + Crunch.toString());
    
            // Polymorphism stuff here (very useful ofc)
            ChocolateBar[] GoldenTicket = new ChocolateBar[3];
            GoldenTicket[0] = new Mars(1238, "Butterfinger", 93, 0);
            GoldenTicket[1] = new Galaxy(1239, "Butterfinger", 32, 6);
            GoldenTicket[2] = new Kinder(1240, "Butterfinger", 53, 1, cocoa);
    
            // display the polymorphism stuff i guess for the array
            for (int i = 0; i < ChocolateBar.length; ++i) {
            GoldenTicket[i].display();
        }
        // composition used here of Kitkat
        Kitkat Chunk = new Kitkat();
        System.out.println(Chunk.GetKitkat());

    } // main of Kitkat ends

} // end of Class

public class Kinder extends MilkChocolate {
    double milk, cocoa, honey;

    // constructor for this class
    public Kinder(int id, String name, float priceEur, int oompaloompa, double milk) {
        this.id = id;
        this.oompaloompa = oompaloompa;
        this.name = name;
        this.priceEur = priceEur;
        this.milk = milk;
    }

    // method stuff here
    void displayManual() {
        System.out.println("Chocolate is love ");
    }

    void displayManual(String overload) {
        System.out.println("Chocolate is life " + overload);
    }

    public void sethoney(double value) {
        honey = value;
    }

    public double gethoney() {
        return honey;
    }

    // override stuff down here
    @Override
    double calculateBars() {
        cocoa = (time + milk) + (milk * (priceEur * 1.5));
        return cocoa;
        // true Maths here
    }

    // impliment interface + overrride interface method
    @Override
    public void payChocolateFee() {
        int Chocolatefee;
        int discountfactor;
        double regFee = Chocolatefee - (Chocolatefee * discountfactor);
        cocoa -= regFee;
        System.out.println("Thine Finalcial Burdon o' with which of situation come be thee Finanial institute of the Wallet hast Been excommunicated");
    }

    // override default interface method stuff
    @Override
    public void displayChocolateFee() {
        int Chocolatefee;
        int discountfactor;
                                double regFee = Chocolatefee - (Chocolatefee * discountfactor);
        System.out.println("The Choclatefee is: " + regFee);
    }

    @Override
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ChocolateBars" + this.calculateBars());
        System.out.println("Honeyr " + gethoney() + " \n ");
    }

    @Override
    public String toString() {
        return "\nName " + name +
                "\nCalacute " + this.calculateBars() +
                "\nHoney " + gethoney() + " \n ";
    }

    public static void main(String[] args) {

        String Crunch;
                // make objects in main class
        Kinder Benou1 = new Kinder(1235, Crunch, 30, 4, 2);
        Kinder Benou2 = new Kinder(1236, Crunch, 35, 1, 9);
        Kinder Benou3 = new Kinder(1237, Crunch, 26, 10, 5);
        Kinder Benou4 = new Kinder(1237, Crunch, 26, 10, 5);

        // use objects
        System.out.println(Benou1.toString());
        System.out.println(Benou2.toString());

        // equals method in use
        System.out.println(Benou3.equals(Benou4));

        ChocolateDegree ChoclateDegree;
                // test those static methods of yours here from interface and class
        ChocolateDegree.displaysugarfee();
        ChocolateBar.displaysugarFee();
    } // main of Kinder ends

} // Kinder ends here

public final class Galaxy extends ChocolateBar {
    // variabels for this stuff
    int oompaloompa;
    double cocoa;

    // this thing's constructor for constructing the construction
    public Galaxy(int id, String name, float priceEur, int oompaloompa) {
        this.id = id;
        this.name = name;
        this.priceEur = priceEur;
        this.oompaloompa = oompaloompa;
    }

   
    
        @Override
        void display() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("OompaLoompa: " + oompaloompa);
            System.out.println("Bars: " + this.calculateBars());
                }
            
                private String calculateBars() {
       
                    throw new UnsupportedOperationException("Unimplemented method 'calculateBars'");
                }
            
                public static void main(String[] args) {
            Galaxy Yummy = new Galaxy(1241, Yummy, sugar_FEE, 2);
        Yummy.display();
    }
}

// the middlemen abstract class's, Ergo. MilkChocolate and NutChocolate
public abstract class MilkChocolate extends ChocolateBar {
    int oompaloompa;
}

public abstract class NutChocolate extends ChocolateBar {
    int oompaloompa;
}