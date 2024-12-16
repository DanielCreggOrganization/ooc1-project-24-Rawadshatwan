package ChocolatePlaza;

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


// polymofeism at work 
ChocolateBar[] chocolateBars = new ChocolateBar[3];

chocolateBars[0] = new SuperBar(0, "", 0, true, 0);

chocolateBars[1] = new OuterChocolateBar(0, "", 0, true, 0);

chocolateBars[2] = new EvilChoclateBar(0, "", 0, true, 0);

// when it loops it I increase but when it surpass 3 it closes
for(int i =0; i < ChocolateBar.length; i++) {
    chocolateBar[i].display();
}

Kitkat Chunk = new Kitkat();
System.out.println(Chunk.getKitkat());

public abstract class Maltesers extends ChocolateBar {
    int numChocolate;

}

public abstract class DairyMilk extends ChocolateBar {
     int numChocolate;

}

public final class Hersey extends ChocolateBar {
     int numChocolate;
     double fat; 

     public Hersey(int id, String name, float priceEur, int numChocolate){
        this.id = id;
        this.name = name;
        this.priceEur = priceEur;
        this.numChocolate = numChocolate;
     }

     @Override
     double sales(){
         return 110047839;
     } 

     @Override
     void display(){
         System.out.println("Name: " + name);
         System.out.println("Id: " + id);
         System.out.println("Price: " + priceEur);
         System.out.println("numChocolate: " + numChocolate);
     }

     public static void main(String[] args) {
        
        Hersey Raisin = new Hersey(0, "", 0, 0);

     Raisin.display();   
     }


}
