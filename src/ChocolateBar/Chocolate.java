package ChocolateBar;

public class Chocolate {

        //instance
        //**we made it public so your other folders could reference it! */    
        public static int chocolateNumber[] = 
        { 0,1,2,3,4
            
        };                                                                                                                       ];
        private String brand;
        private float priceEur;
        private long pieces;
        
        //Constructor
        public Chocolate(String brand, float priceEur, long pieces){
            this.brand = brand;
            this.priceEur = priceEur;
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
        
        public float getPriceEur(){
            return this.priceEur;
        }

        public void setPriceEur(float price) {
            this.priceEur = price;
        }

        public long getPieces(){
            return this.pieces;
        }

        public void setPieces(long pieces) {
            this.pieces = pieces;
        }


    
}

            

