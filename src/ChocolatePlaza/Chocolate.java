package ChocolatePlaza;

public class Chocolate {

    public static int chocolateNumber[] =
    {
      0,1,2,3,4
    };
    public Chocolate(int chocolateNumber[], String brand, float priceEur, long pieces) {
        this.chocolateNumber = chocolateNumber;
        this.brand = brand;
        this.priceEur = priceEur;
        this.pieces = pieces;
    }
    private String brand;
    private float priceEur;
    private long pieces;

    

   
}
