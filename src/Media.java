    import java.util.Arrays;
    import java.util.Scanner;

    public class Media {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];

        void dadosArray(){
            for (int i = 0; i < notas.length; i++){
                System.out.println("Digite a " + (i + 1) +"º: ");
                notas[i] = scanner.nextDouble();
            }

            System.out.println("Notas informadas: " + Arrays.toString(notas));
        }

        void mediaAritmetica(){
            double somaNotas = 0;
            for (int i = 0; i < notas.length; i++){
                somaNotas += notas[i];
            }

            System.out.println("O resultado da media aritmetica da soma da notas é " + (somaNotas/notas.length) + ". Caso tenha alguma duvida consulte o suporte");
        }
    }

