public class ExercicioRecursao {

    public static void main(String[] args) {
        // 1. Criamos o array de teste com os números do seu exemplo
        int[] meuArray = {1, 2, 3, 2, 2, 4};
        
        // 2. Chamamos o método 'contar' passando:
        // - o array (meuArray)
        // - o valor que queremos procurar (2)
        // - o índice inicial (0)
        int resultado = contar(meuArray, 2, 0);
        
        // 3. Mandamos imprimir o resultado no console
        System.out.println("O valor aparece " + resultado + " vezes no array.");
    }

    public static int contar(int[] arr, int valor, int index) {
        // Caso base: se o índice for igual ao tamanho do array, acabou a busca.
        if (index == arr.length) {
            return 0;
        }
        
        // Verifica se encontrou o valor na posição atual
        int ocorrencia = 0;
        if (arr[index] == valor) {
            ocorrencia = 1;
        }
        
        // Passo recursivo: soma o que achou agora com o resto do array
        return ocorrencia + contar(arr, valor, index + 1);
    }
}