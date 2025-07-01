import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        var nome = scanner.next();

        System.out.println("Em qual dia você nasceu?");
        var dia = scanner.nextInt();

        System.out.println("Em qual mês você nasceu?");
        var mes = scanner.nextInt();

        System.out.println("Em qual ano você nasceu?");
        var ano = scanner.nextInt();

        LocalDate hoje = LocalDate.now();
        LocalDate aniversario = LocalDate.of(ano, mes, dia);

        int idade = hoje.getYear() - aniversario.getYear();

        if (hoje.getDayOfYear() < aniversario.getDayOfYear()) {
            idade--;
        }
        System.out.printf("Olá %s, você tem %d anos.\n", nome, idade);
        scanner.close();
    }
}
