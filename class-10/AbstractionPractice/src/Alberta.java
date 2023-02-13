public class Alberta extends TaxPercentage {
    public double getTaxPercentage(double x) {
        return (x*5)/100;
    }

    public void calcualteTotal (double value) {
        double taxes = getTaxPercentage(value);
        double total = value + taxes;
        System.out.println("If you spend " + value + " in Alberta you need to pay: " + taxes + " in taxes, for a total of: " + total);
    }
}
