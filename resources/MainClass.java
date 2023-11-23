import java.util.Scanner;
public class MainClass{ 
 public static void main(String args[]){
   Scanner _key = new Scanner(System.in);
double  result;
double  variableCost;
double  fixedCost;
double  priceSale;
fixedCost= _key.nextDouble();
variableCost= _key.nextDouble();
priceSale= _key.nextDouble();
System.out.println(fixedCost/(priceSale-variableCost));
result = fixedCost/(priceSale-variableCost);
System.out.println(result);
 }}