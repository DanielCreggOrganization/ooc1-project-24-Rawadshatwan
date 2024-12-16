package ChocolatePlaza;

public abstract class ChocolateBar {

    // variables
     int id;
     String name;
     float priceEur;
     boolean filling = true;

    // abstract methods
    abstract double sales();
    abstract void display();

    // static method
    public static void displayscreen(){
        System.out.println("Sales =");
    }

}
    // constant
    public interface InnerChocolateBar {
        final double sugar = 5; 
        final double milk  = 0.20;
        final float coco = 4; 
        
        abstract void cost();

        // default method
        default void displaycost(){
            System.out.println("23.50");
        }

        public static void displaycoco() {
            System.out.println("Coco" + coco);
        }
}
    

public class SuperBar extends DairyMilk {
    
    double Hazelnut, Peanuts;

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
        return 110020304;
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

   public class OuterChocolateBar extends Maltesers {
   
    double Hazelnut, Peanuts, Coconut;

      // constructicons
      public OuterChocolateBar(int id, String name, float priceEur, boolean filling, double Hazelnut){
        this.id = id;
        this.name = name;
        this.priceEur = priceEur;
        this.filling = filling;
        this.Hazelnut = Hazelnut
     }

     //DisplayManuel
}


