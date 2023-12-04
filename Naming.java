import java.util.Scanner;

public class Naming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Membuat objek dari kelas KelasPengguna
        KelasPengguna user = new KelasPengguna();
        // Input username dan password dari pengguna
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        // Menyimpan informasi ke objek KelasPengguna

        user.penyimpanan(username, password);
        // Menampilkan informasi yang disimpan
        System.out.println("Credentials saved:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
        // Menutup Scanner
        scanner.close();
    }
}

class KelasPengguna {
    private String username;
    private String password;

    public void penyimpanan(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
