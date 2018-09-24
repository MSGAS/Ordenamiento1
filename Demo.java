import java.util.*;

public class Demo
{
    static void ordenarEnteros(int maxEnteros){
        int enteros[];
        
        enteros = new int[maxEnteros];
        
        for(int i=0; i < enteros.length; i++){
            enteros[i]=(int)(Math.random() * (maxEnteros*2));
            enteros[i]-=maxEnteros;
        }
        
        Arrays.sort(enteros);
        
        for(int i=0; i<enteros.length; i++){
            System.out.println(enteros[i]);
        }
    }

}
