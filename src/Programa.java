import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Aluno[] allAlunos = new Aluno[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados?");
        int qtdRooms = sc.nextInt();

        for (int i = 1; i <= qtdRooms; i++) {
            System.out.println();
            System.out.println("Quarto #" + i + ":");
            System.out.print("Nome:");
            //Para limpar o buffer e pegar nomes com espaço
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email:");
            String email = sc.nextLine();
            System.out.print("Quarto:");
            int room = sc.nextInt();

            allAlunos[room] = new Aluno(name, email);
        }
        System.out.println();

        for (int i = 0; i < allAlunos.length; i++) {
            if (allAlunos[i] == null) {
                System.out.println(i + ": VAZIO");
            } else {
                System.out.println(i + ":" + allAlunos[i]);
            }
        }

        sc.close();
    }
}