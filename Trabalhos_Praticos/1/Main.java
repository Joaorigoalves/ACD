import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Random rand= new Random();
        Integer[] vetor= new Integer [15];
        Insertion ins= new Insertion();

        for(int x=0;x< vetor.length;x++){
            vetor[x]= rand.nextInt(100);
        }
        System.out.println("Vetor Original:"+Arrays.toString(vetor));
        ins.ordenar(vetor);
        System.out.println(" Vetor Ordenado:"+Arrays.toString(vetor));

    }
}
