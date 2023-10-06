import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

    private ArrayList<String> pessoas = new ArrayList<>();

    public ArrayList<String> getPessoas() {
        return pessoas;
    }

    public void getNomes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas deseja adicionar na lista? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println("Qual o nome que deseja adicionar? ");
            String nome = sc.nextLine();
            this.pessoas.add(nome);
        }
    }

    public void remove() {
        Random r = new Random();
        int qtdPessoas = this.pessoas.size();

        if ( qtdPessoas % 2 == 0) {
            for(int i = 0; i < (qtdPessoas/2); i++) {
                this.pessoas.remove(r.nextInt(this.pessoas.size()));
            }
        } else {
            for(int i = 0; i < ((qtdPessoas + 1)/2); i++) {
                this.pessoas.remove(r.nextInt(this.pessoas.size()));
            }
        }
    }

}
