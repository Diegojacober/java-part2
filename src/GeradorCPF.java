import java.util.Scanner;

public class GeradorCPF {

    private String cpfCorreto;

    public String getCpfCorreto() {
        return cpfCorreto.substring(0,3) + "." + cpfCorreto.substring(3,6) + "." + cpfCorreto.substring(6,9) + "-" + cpfCorreto.substring(9,11);
    }



    public boolean verifyCpf(String cpf) {

        Integer d1Cpf = Integer.parseInt(cpf.substring(9,10));
        Integer d2Cpf = Integer.parseInt(cpf.substring(10,11));

        String cpfCorrect = cpf.substring(0,9);
        generateFirstDigit();
        generateSecondDigit();

        Integer d1 = Integer.parseInt(cpfCorrect.substring(9,10));
        Integer d2 = Integer.parseInt(cpfCorrect.substring(10,11));


        if (d1Cpf == d1 && d2 == d2Cpf) {
            return true;
        }

        return false;
    }

    public int generateFirstDigit() {

        int index = 0;
        int totalSoma = 0;
        for (int i = 10; i > 1; i--) {
            totalSoma += i * Integer.parseInt(this.cpfCorreto.substring(index, index+1));
            index++;
        }

        int resto = 11 - (totalSoma%11);

        if (resto > 9) {
            resto = 0;
        }

        this.cpfCorreto = cpfCorreto + resto;
        return resto;
    }

    public int generateSecondDigit() {

        int index = 0;
        int totalSoma = 0;
        for (int i = 11; i > 1; i--) {
            totalSoma += i * Integer.parseInt(this.cpfCorreto.substring(index, index+1));
            index++;
        }

        int resto = 11 - (totalSoma%11);

        if (resto > 9) {
            resto = 0;
        }

        this.cpfCorreto = cpfCorreto + resto;
        return resto;
    }

    public void getCpf() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o cpf desejado: ");
            String cpfDigitado = sc.nextLine();

            if (cpfDigitado.length() > 11 || cpfDigitado.length() < 9) {
                System.out.println("O cpf deve ser menor que 11 dígitos e maior que 9 digitos");
            }
            else if(cpfDigitado.length() == 9) {


                //até o 3 digito
                String cpfParte1 = cpfDigitado.substring(0,3);
                //até o 6 digito
                String cpfParte2 = (cpfDigitado.substring(3,6));
                //até o 9 digito
                String cpfParte3 = (cpfDigitado.substring(6,9));

                String cpf = cpfParte1 + cpfParte2 + cpfParte3;

                try{
                    Integer.parseInt(cpf);
                } catch(Exception e) {
                    continue;
                }

                this.cpfCorreto = cpf;
                break;

            }
            else if(cpfDigitado.length() == 11) {

                //até o 3 digito
                String cpfParte1 = cpfDigitado.substring(0,3);
                //até o 6 digito
                String cpfParte2 = (cpfDigitado.substring(4,7));
                //até o 9 digito
                String cpfParte3 = (cpfDigitado.substring(8,11));

                String cpf = cpfParte1 + cpfParte2 + cpfParte3;

                try{
                    Integer.parseInt(cpf);
                } catch(Exception e) {
                    continue;
                }

                this.cpfCorreto = cpf;
                break;
            }
        }
    }
}
