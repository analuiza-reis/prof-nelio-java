import java.util.Scanner;

public class ExCond_07 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double x, y; 

        System.out.println("Insira o valor de X: ");
        x = scan.nextDouble();
        System.out.println("Insira o valor de Y: ");
        y = scan.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Ponto de origem ");
        } 
        else if ( x == 0) {
            System.out.println("Eixo x");
        } 
        else if (y == 0) {
            System.out.println("Eixo y");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } 
        else if (x > 0.0 && y < .00) {
            System.out.println("Q4");
        } 
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } 
        else {
            System.out.println("Q2");
        }

        scan.close();
    }
}
