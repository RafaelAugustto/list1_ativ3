import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // requisito 1: pedir 1 número
        System.out.print("Dígite o primeiro Número: ");
        int x = sc.nextInt();
        System.out.println(x);
        // requisito 2: pedir 2 número
        System.out.print("Dígite o segundo Número: ");
        int y = sc.nextInt();

        sc.close();

        // requisito 3: Imprimir a soma dos números
        int soma = x + y;
        System.out.print("A soma dos dois números é: " + soma);

    }
}