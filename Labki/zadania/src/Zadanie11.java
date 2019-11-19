import java.util.Scanner;
public class Zadanie11 {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Wprowadź A: ");
        double a=scanner.nextDouble();
        
        System.out.println("Wprowadź B: ");
        double b=scanner.nextDouble();
        
        System.out.println("Wprowadź C: ");
        double c=scanner.nextDouble();
        
            if ((a > b) && (a>c))
            {
                System.out.println("A jest największe");
            }
            
            else if((b>a)&&(b>c))
            {
                System.out.println("B jest największe");
            }
            
            else if((c>a)&&(c>b))
            {
                System.out.println("C jest największe");
            }  
            
        }
    
    }
