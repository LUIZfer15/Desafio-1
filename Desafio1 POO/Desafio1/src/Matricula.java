import java.util.Scanner;

public class Matricula {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String aluno;
        String disciplina;
        double n1, n2, n3;

        System.out.println("Digite o nome do aluno: ");
        aluno = entrada.nextLine();

        System.out.println("Digite a disciplina: ");
        disciplina = entrada.nextLine();

        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextDouble();

        System.out.println("Nome: " + aluno);
        System.out.println("Disciplina: " + disciplina);
        double media = (n1 + n2 + n3) / 3;
        System.out.println("A média do aluno é: " + media);

        // if (media < 0) {
        // System.out.println("Digite uma nota válida");
        // } else if (media > 0) {
        // System.out.println("");
        // }

    }

}
