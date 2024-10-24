import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int ulangulang;

        do {
            System.out.println("\n=== Menu Playlist Lagu ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Tampilkan Playlist");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            ulangulang = scanner.nextInt();
            scanner.nextLine();

            switch (ulangulang) {
                case 1:
                    System.out.print("Masukkan judul lagu: ");
                    String title = scanner.nextLine();
                    playlist.addSong(title);
                    System.out.println("Lagu \"" + title + "\" berhasil ditambahkan ke playlist!\n");
                    break;

                case 2:
                    playlist.displayPlaylist();
                    System.out.print("\nTekan Enter untuk kembali ke menu......");
                    scanner.nextLine();
                    break;

                case 3:
                    System.out.println("Program Telah Berhenti...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu 1-3.\n");
            }

        } while (ulangulang != 3);

        scanner.close();
    }
}