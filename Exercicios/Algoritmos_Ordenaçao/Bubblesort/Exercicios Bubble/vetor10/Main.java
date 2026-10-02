import java.util.Arrays;
import java.util.Random;
public class Main{
    public static void main(String[] args){
        Random rand= new Random();
        int[] vetor= new int[10];
        final int TAM= 10;

        for(int l=0;l<TAM;l++){
            vetor[l]= rand.nextInt(100);
        }
        Bubblesort bubble= new Bubblesort();
        System.out.println("Vetor Original:"+Arrays.toString(vetor));
        bubble.ordenar(vetor);
        System.out.println("Vetor Ordenado:"+Arrays.toString(vetor));

    }
}