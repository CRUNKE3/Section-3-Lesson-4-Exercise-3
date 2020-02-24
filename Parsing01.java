package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice, taxRate, gibberish;
        shirtPrice = "15";
        taxRate = "0.05";
        gibberish = "asdfghjkl";
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        double newTaxRate = Double.parseDouble(taxRate);
        int newShirtPrice = Integer.parseInt(shirtPrice);
        double totalTax = (newTaxRate*newShirtPrice);
        System.out.println(totalTax);
        
        
        //Try to parse taxRate as an int
     //   int badTaxRate = Integer.parseInt(taxRate);
        //Try to parse gibberish as an int
     //   int badGibberish = Integer.parseInt(gibberish);
    }
    
}
