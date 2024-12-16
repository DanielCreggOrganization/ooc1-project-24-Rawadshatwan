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
    


}
