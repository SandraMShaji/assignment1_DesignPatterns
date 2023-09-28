import java.io.FileNotFoundException;

public class Test{
    public static void main(String[] args) throws FileNotFoundException {
        GroceryProdFactory orangeFactory = new OrangeFactory();
        GroceryProd orange = orangeFactory.createGroceryProd();

        GroceryProdFactory mangoFactory = new MangoFactory();
        GroceryProd mango = mangoFactory.createGroceryProd();

        Cost.setCostFrmTxt(orange, "Grocery.txt");
        Cost.setCostFrmTxt(mango, "Grocery.txt");

        System.out.println("Item: " + orange.getProd() + ", Cost: $" + orange.getCost());
        System.out.println("Item: " + mango.getProd() + ", Cost: $" + mango.getCost());
    }
}