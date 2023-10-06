import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadePrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Numeros primos: " + primos(num));
        System.out.println("Numeros não primos: " + naoPrimos(num));
        sc.close();
    }

    public static List<Integer> primos(int numero) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < numero; i++){
            int divisiveis = 0;
            for(int j = 1; j < (i + 1); j++) {
                if (i % j == 0) {
                    divisiveis++;
                }
            }
            if (divisiveis == 2) {
                numeros.add(i);
            }
        }

        return numeros;
    }

    public static List<Integer> naoPrimos(int numero) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < numero; i++){
            int divisiveis = 0;
            for(int j = 1; j < (i + 1); j++) {
                if (i % j == 0) {
                    divisiveis++;
                }
            }
            if (divisiveis != 2) {
                numeros.add(i);
            }
        }

        return numeros;
    }
}
