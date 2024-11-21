package ChocolateBar;

public class Chocolate {

        //instance    
        private int chocolateNumber;
        private String brand;
        private float price;
        private long pieces;
        
        //Constructor
        public Chocolate(int chocolateNumber, String brand, float price, long pieces){
            this.chocolateNumber = chocolateNumber;
            this.brand = brand;
            this.price = price;
            this.pieces = pieces;
        }

        //Getter and Setter
        public int getChocolateNumber(){
            return this.chocolateNumber;
        }

        public void setChocolateNumber(int chocolateNumber) {
            this.chocolateNumber = chocolateNumber;
        }
        

        public String getBrand(){
            return this.brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
        
        public float getPrice(){
            return this.price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public long getPieces(){
            return this.pieces;
        }

        public void setPieces(long pieces) {
            this.pieces = pieces;
        }


    
}

            

