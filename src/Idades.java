import java.util.Scanner;
import java.util.Arrays;

public class Idades {
    Scanner leitor = new Scanner(System.in);

    int[] ArrayIdades() {
        int[] idades = new int[10];
        System.out.println("Iniciando processo de criacao de lista de idades...");

        for (int i = 0; i < 10; i++) {
            System.out.print("Coloque a idade " + (i + 1) + "º: ");
            idades[i] = leitor.nextInt();
        }

        System.out.println("Lista de idades: " + Arrays.toString(idades));

        return idades;
    }

    void exibeNumeroMaioresQue18(int array[]){

        System.out.println("Numero maiores que 18 presentes no Array");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 18) {
                System.out.println(array[i]);
            }
        }
    }
}
