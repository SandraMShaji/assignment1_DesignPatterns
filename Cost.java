import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Cost{
    public static void setCostFrmTxt( GroceryProd prod, String fileName) throws FileNotFoundException{
        String prodName = prod.getProd();
        Scanner scanner = new Scanner(new File(fileName));
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            if (parts.length == 2 && parts[0].trim().equalsIgnoreCase(prodName)){
                double cost = Double.parseDouble(parts[1].trim());
                prod.setCost(cost);
                break;
            }
        }
        scanner.close();
    }
}