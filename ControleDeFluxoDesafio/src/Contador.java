import java.util.Scanner;

public class Contador {


    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int firstParam = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int secondParam = terminal.nextInt();


        try {
            contar(firstParam, secondParam);
        } catch (ParametrosInvalidosExpection e) {
            System.out.println("Erro: " + e.getMessage());
        }


        terminal.close();
    }

    static void contar(int firstParam, int secondParam) throws ParametrosInvalidosExpection {
        if(firstParam >= secondParam){
            throw new ParametrosInvalidosExpection();
        } else {
            int counter = secondParam - firstParam;

            for(int index = 1; index <= counter; index++){
                System.out.println("Imprimindo a " + index + "ª interação: " + index);
            }
        }
    }
}
