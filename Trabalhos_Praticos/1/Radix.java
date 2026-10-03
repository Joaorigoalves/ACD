public class Radix extends Ordenador {
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

        for (int exp = 1; maior / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private void countingSort(int[] arr, int exp) {
        int[] saida = new int[arr.length];
        int[] contagem = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int digito = (arr[i] / exp) % 10;
            contagem[digito]++;
        }

        for (int i = 1; i < 10; i++) {
            contagem[i] += contagem[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int digito = (arr[i] / exp) % 10;
            saida[contagem[digito] - 1] = arr[i];
            contagem[digito]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = saida[i];
        }
    }
}