
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        
        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Septiembre"};
        
        int goles[]=new int[7];
        
        System.out.println("Introduce los goles en cada mes");
        for (int cont=0;cont<goles.length;cont++)
        {
            System.out.println("Dime los goles marcados en el mes: "+meses[cont]);
            goles[cont]=tec.nextInt();
        }
        
        //Apartado _maximo de goles
        //Opcion1 
        int maxgoles=goles[0]; //Opcion 2 int golesmax=0 // Opcion 3 int golesMax=Integer.MIN_VALUE;
        int posicion=0;
        
        for (int cont=0;cont<goles.length;cont++) //cont=0 en opciones 1,2,3 ----- cont=1 en opcion 3
        {
            if (maxgoles < goles[cont])
            {
                maxgoles=goles[cont];
                posicion=cont;
            }
            System.out.println("Maximo goles "+maxgoles+" en el "+meses[cont] );
        }
        
        //Mostrar el nimbre de aquellos meses en los que no marca
        
        for (int i=0;i<goles.length;i++)
        {
            if (goles[i]==0)
            {
                System.out.println("No marcó en "+meses[i]);
            }
        }
    }
}
