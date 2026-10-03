public class Counting extends Ordenador {
    @Override
    public void ordenar(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int maior = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maior) {
                maior = arr[i];
            }
        }

        int[] contagem = new int[maior + 1];

        for (int i = 0; i < arr.length; i++) {
            contagem[arr[i]]++;
        }

        int indice = 0;

        for (int i = 0; i < contagem.length; i++) {
            while (contagem[i] > 0) {
                arr[indice] = i;
                indice++;
                contagem[i]--;
            }
        }
    }
}