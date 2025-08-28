import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        float numero1 = teclado.nextFloat();
        System.out.print("Digite o segundo número:");
        float numero2 = teclado.nextFloat();
        float media = (numero1 + numero2)/2;
        System.out.println("A média entre os dois número é:" + media);

    }

}