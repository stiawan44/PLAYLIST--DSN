public class Playlist {
    private Song head;
    private Song tail;

    public Playlist() {
        head = null;
        tail = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);

        if (head == null) {
            head = newSong;
        } else {
            tail.setNext(newSong);
        }
        tail = newSong;
    }

    public void displayPlaylist() {
        Song current = head;
        int number = 1;

        if (current == null) {
            System.out.println("Playlist Masih Kosong Nih");
            return;
        }

        System.out.println("\nDaftar Lagu dalam Playlist:");
        while (current != null) {
            System.out.println(number + ". " + current.getTitle());
            current = current.getNext();
            number++;
        }
        System.out.println();
    }
}