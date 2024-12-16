package ChocolatePlaza;

import src.ChocolateBar.OuterChocolateBar.Maltesers;


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

     //DisplayManuel method
       void DisplayManuel(){
        System.out.println("Chocolate is tasty");
       }

       void DisplayManuel(String overload){
        System.out.println("Choclate is life" + overload);
       }

       public void setCaramel(double value) {
          Coconut = value;
       }

       public double getCaramel() {
        return  Coconut;
     }
     
    @Override
    double sales(){
        return 110047839;
    }
    
    @Override
    public void paycost(){
        System.out.println("The Finacial Burden that plauge us has now been paided");
    }    
    
    @Override
    public void displaycost(){
        System.out.println("The amount =" + 23.40);
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
     
        OuterChocolateBar Milkyway = new OuterChocolateBar(0 , "", 0, true, 0);
        System.out.println(Milkyway.toString());

        OuterChocolateBar Mars = new OuterChocolateBar(0 , "", 0, true, 0);
        System.out.println(Mars.toString());

        // use implemented method from inter face
        Mars.displaycost();
        Mars.paycost();

    }

      }
}
