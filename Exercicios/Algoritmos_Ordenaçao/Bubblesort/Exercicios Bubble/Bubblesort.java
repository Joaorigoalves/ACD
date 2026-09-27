public class Bubblesort{
    public void ordenar( int[] vetor){
        for(int x=0;x<vetor.length-1;x++){
            for(int y=0; y<vetor.length-1;y++){
                if(vetor[y]>vetor[y+1]){
                    int aux;
                    aux=vetor[y];
                    vetor[y]=vetor[y+1];
                    vetor[y+1]=aux;
                }
            }
        }

    }
}