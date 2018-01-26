
package menor3;
import java.util.Scanner;

public class Menor3 {


public class Menor3 {
static int Menor3 (int x, int y, int z)
{if (x>y)
    x=y;
if (x>z)
    x=z;
return x;}
    
    public static void main(String[] args) throws Exception {
        int x, y, z, a, b, c;
        Scanner LerS=new Scanner(System.in);
        System.out.print("Qual o primeiro número?");
        x= LerS.nextInt();
        System.out.print("Qual o segundo número?");
        y= LerS.nextInt();
        System.out.print("Qual o terceiro número?");
        z= LerS.nextInt();
        System.out.println("menor =" +Menor3(x, y, z));
        
    }
    
}