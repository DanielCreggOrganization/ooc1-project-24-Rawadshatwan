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
    
    public SuperBar(int id, String name, float priceEur, boolean filling){
        this(id, String, priceEur, fi)|
    }
    
}
   


