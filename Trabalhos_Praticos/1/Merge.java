public class Merge extends Ordenador {
    @Override
    public void ordenar(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;

            mergeSort(arr, esquerda, meio);
            mergeSort(arr, meio + 1, direita);
            merge(arr, esquerda, meio, direita);
        }
    }

    private void merge(int[] arr, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        int[] esq = new int[n1];
        int[] dir = new int[n2];

        for (int i = 0; i < n1; i++) {
            esq[i] = arr[esquerda + i];
        }
        for (int j = 0; j < n2; j++) {
            dir[j] = arr[meio + 1 + j];
        }

        int i = 0, j = 0, k = esquerda;

        while (i < n1 && j < n2) {
            if (esq[i] <= dir[j]) {
                arr[k] = esq[i];
                i++;
            } else {
                arr[k] = dir[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = esq[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = dir[j];
            j++;
            k++;
        }
    }
}