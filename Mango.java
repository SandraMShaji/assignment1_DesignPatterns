public class Mango implements GroceryProd{
    private String prod;
    private double cost;
    public Mango() { this.prod = "Mango";}
    public String getProd() { return prod;}
    public double getCost(){ return cost;}
    public void setCost(double cost){this.cost = cost;}
}