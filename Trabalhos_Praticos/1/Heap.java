public class Heap extends Ordenador {
    @Override
    public void ordenar(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && arr[esquerda] > arr[maior]) {
            maior = esquerda;
        }

        if (direita < n && arr[direita] > arr[maior]) {
            maior = direita;
        }

        if (maior != i) {
            int temp = arr[i];
            arr[i] = arr[maior];
            arr[maior] = temp;

            heapify(arr, n, maior);
        }
    }
}