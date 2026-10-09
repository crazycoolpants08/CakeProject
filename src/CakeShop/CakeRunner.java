//Student Name: Heidi Faustermann
//LSUID: 891648160
//Assignment: Lab 2 Revised
package CakeShop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CakeRunner {
	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<Cake> cakes = new ArrayList<>();
		// TODO - Read in Cakes from cakes.csv
		File inFile = new File("./FilesInput/cakes.csv");
	       Scanner fileIn = new Scanner(new File("./FilesInput/cakes.csv"));
	       // Skip the header line
	       if (fileIn.hasNextLine()) {
	           fileIn.nextLine();
	       }
	       while (fileIn.hasNextLine()) {
	           String line = fileIn.nextLine();
	           String[] parts = line.split(",");
	           // Correct parsing order to match CSV columns: tiers, flavor, price
	           int tiers = Integer.parseInt(parts[0]);
	           String flavor = parts[1];
	           double price = Double.parseDouble(parts[2]);
	           Cake c = new Cake();
	           c.setTiers(tiers);
	           c.setFlavor(flavor);
	           c.setPrice(price);
	           cakes.add(c);
	       }
	       fileIn.close();
		for(Cake cake : cakes){
			cake.printCard();
		}
	}
}
