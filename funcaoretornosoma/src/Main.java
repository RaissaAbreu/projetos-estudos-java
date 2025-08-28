//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int soma(int a, int b){
        int soma = a+b;
        return soma;
    }

    public static void main(String[] args) {
        System.out.println("O programa começou");
        int resultadosoma = soma (5,2);
        System.out.println("A soma é " + resultadosoma);
    }

}