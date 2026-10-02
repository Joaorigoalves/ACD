public class Shell extends Ordenador {
    @Override
    public void ordenar(int[] arr) {
        int n = arr.length;

        // Começa com um gap grande e vai reduzindo
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Faz um insertion sort "gapped" para este gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                // Desloca elementos que são maiores que temp
                // para uma posição à frente de sua posição atual
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp;
            }
        }
    }
}