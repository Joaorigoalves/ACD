public class Quick extends Ordenador {
    @Override
    public void ordenar(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(arr, inicio, fim);

            quickSort(arr, inicio, pivo - 1);
            quickSort(arr, pivo + 1, fim);
        }
    }

    private int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;

        return i + 1;
    }
}