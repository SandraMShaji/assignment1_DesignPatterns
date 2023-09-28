public class MangoFactory implements GroceryProdFactory{
    public GroceryProd createGroceryProd(){
        Mango mango = new Mango();
        return mango;
    }
}