import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quantos termos você quer mostrar?");
//        int qtdTermos = sc.nextInt();
//
//        int termo1 = 0;
//        int termo2 = 1;
//        int[] termos = new int[qtdTermos];
//        termos[0] = 0;
//        termos[1] = 1;
//
//        for (int i = 2;i < qtdTermos; i++) {
//            int t3 = termo1 + termo2;
//            termo1 = termo2;
//            termo2 = t3;
//            termos[i] = t3;
//        }
//
//        for(int num:termos) {
//            System.out.println(num);
//        }

//        Exercicio02 ex2 = new Exercicio02();
//        ex2.getNomes();
//        ex2.remove();
//
//        System.out.println("As pessoas que restaram nesse mundo foram:");
//        for (String pessoa:ex2.getPessoas()) {
//            System.out.print(pessoa + "\n");
//        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Você deseja:" +
                "[1] Verificar um CPF" +
                "[2] Gerar digitos");

        int opcao = sc.nextInt();



        GeradorCPF gerador = new GeradorCPF();


        if (opcao == 2) {
            gerador.getCpf();
            int d1 = gerador.generateFirstDigit();
            int d2 = gerador.generateSecondDigit();
            System.out.println(gerador.getCpfCorreto());
        } else if (opcao == 1) {
            System.out.println("Digite o cpf completo sem pontos");
            sc.nextLine();
            String cpf = sc.nextLine();
            System.out.println(gerador.getCpfCorreto());
            System.out.println(gerador.verifyCpf(cpf));
        }



    }
}