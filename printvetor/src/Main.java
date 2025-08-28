//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num [] = {3,2,8,7,5,4};

        for(int c = 0; c <= 5; c++){
            System.out.print(num[c]);
        }

        // usando o atributo length
        for(int c = 0; c <= num.length - 1; c++) {
            System.out.println(num[c]);
        }

        // usando for it
        for (int valor: num){
            System.out.print(valor);
        }
    }
}