import java.util.Random;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Random rand= new Random();
        final int CONST=5;
        int[] vetor=new int[CONST];
        for(int l=0;l<CONST;l++){
            vetor[l]= rand.nextInt(100);
        }
        System.out.println("Vetor Original:"+Arrays.toString(vetor));
        Insertion inser=new Insertion();
        inser.ordenar(vetor);
        System.out.println("Vetor Ordenado:"+Arrays.toString(vetor));
    }
}