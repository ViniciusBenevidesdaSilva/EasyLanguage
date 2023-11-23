import java.util.Scanner;
public class MainClass{ 
 public static void main(String args[]){
   Scanner _key = new Scanner(System.in);
double  custoVariavel;
double  precoVenda;
double  custoFixo;
double  pec;
custoFixo= _key.nextDouble();
custoVariavel= _key.nextDouble();
precoVenda= _key.nextDouble();
System.out.println(custoFixo/(precoVenda-custoVariavel));
pec = custoFixo/(precoVenda-custoVariavel);
System.out.println(pec);
 }}