import java.util.Scanner;

public class Login {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("------------------------------- ");
    System.out.print("Username: ");
    String username = scanner.nextLine();
    System.out.print("------------------------------- ");
    System.out.print("Password: ");
    System.out.print("------------------------------- ");
    String password = scanner.nextLine();

    if (verifyCredentials(username, password)) {
      System.out.println("Login successful!");
    } else {
      System.out.println("Invalid username or password. Please try again.");
    }
  }

  public static boolean verifyCredentials(String username, String password) {
    // Aqui você pode verificar as credenciais do usuário
    // contra um banco de dados, um arquivo de configuração
    // ou qualquer outra fonte de informação
    return "admin".equals(username) && " ".equals(password);
  }
}