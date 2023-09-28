public class OrangeFactory implements GroceryProdFactory{
    public GroceryProd createGroceryProd(){
        Orange orange = new Orange();
        return orange;
    }
}