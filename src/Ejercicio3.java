
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int nummenores=0, mayores=0, nummayores30=0, caja=0, total;
        int entrada, edad;
         
         for (int personas=1; personas<=400; personas++)
         {
             System.out.println("Dime la edad");
             edad=tec.nextInt();
             
             if(edad==0)
             {
                 break;
             }
             else if (edad<18)
                     {
                         nummenores++;
                     }
             else if (edad>=18 && edad<30)
                        {
                            mayores++;
                        }
             else
                        {
                            nummayores30++;
                        }
             System.out.println("¿Como consiguio la entrada, antelacion (0) o taquilla (1)?");
             entrada=tec.nextInt();
             
             if (entrada==0)
             {
                 caja+=5;
             }
             else
             {
                 caja+=6;
             }
         }
         int totalpersonas=nummayores30+mayores+nummenores;
         
         System.out.println("Mayores 30: "+nummayores30+" personas, "+((nummayores30*100)/totalpersonas)+" %");
         System.out.println("Entre 18 y 30: "+mayores+" personas, "+((mayores*100)/totalpersonas)+" %");
         System.out.println("Menores: "+nummenores+" personas, "+((nummenores*100)/totalpersonas)+" %");
         
         System.out.println("Total personas "+totalpersonas+" Caja "+caja);
     }
}
