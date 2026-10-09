//Student Name: Heidi Faustermann
//LSUID: 891648160
//Assignment: Lab 2 Revised
package CakeShop;

public class Cake
{
   // Data members
   private String flavor;
   private int tiers;
   private double price;
   // Setter methods
   public void setFlavor(String f)
   {
       flavor = f;
   }
   public void setTiers(int t)
   {
       tiers = t;
   }
   public void setPrice(double p)
   {
       price = p;
   }
   // Print method
   public void printCard()
   {
       System.out.printf("A %d tier %s cake\t\t$%.2f%n",tiers, flavor, price);
   }
}
