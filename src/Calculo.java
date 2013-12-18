
public class Calculo {
    
    public static long potenciafor (int x, int y)
    {
        //no declarar x e y otra vez
        //no leer x, no leer y
        long resultado=1;
        for (int cont=1;cont<=y;cont++)
        {
            resultado=resultado*x;
        }
        return resultado;
    }
    public static long potenciawhile (int x, int y)
    {
        long resultado=1;
        int cont=1;
        
        while(cont<=y);
        {
            resultado*=x;
            cont++;
        }
        return resultado;
    }
    public static long potenciado_while (int x, int y)
    {
        long resultado=1;
        int cont=1;
        do 
        {
            resultado*=x;
            cont++;
        }
        while(cont<=y);
        return resultado;
    }
}
