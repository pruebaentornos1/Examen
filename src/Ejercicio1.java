
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int a,b;
        
        System.out.println("Dime a");
        a=tec.nextInt();
        
        System.out.println("Dime b");
        b=tec.nextInt();
        
        int mayor,menor;
        mayor=(a>b)?a:b;
        menor=(a<b)?a:b;
        
        for (int cont=menor;cont<=mayor;cont++)
        {
            long resultado;
            resultado=Calculo.potenciafor(cont, 3);
            System.out.println(resultado);
        }
    }
}
