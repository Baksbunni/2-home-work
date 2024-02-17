public class App {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        System.out.println(levTolstoy);

        System.out.println();

        Author mikhailSholokhov = new Author("Михаил", "Щолохов");
        System.out.println(mikhailSholokhov);

        System.out.println();

        Book warAndPeace = new Book("Война и мир", levTolstoy, 1869);
        System.out.println(warAndPeace.getBookTitle());
        System.out.println(warAndPeace.getNameOfAuthor());
        System.out.println(warAndPeace.getPublicationYear());
        warAndPeace.setPublicationYear(1933);
        System.out.println(warAndPeace.getPublicationYear());
        System.out.println();

        System.out.println(warAndPeace);

        warAndPeace.setPublicationYear(1870);
        System.out.println(warAndPeace.getPublicationYear());

        System.out.println();

        Book quietDon = new Book("Тихий Дон", mikhailSholokhov, 1928);
        System.out.println(quietDon.getBookTitle());
        System.out.println(quietDon.getNameOfAuthor());
        System.out.println(quietDon.getPublicationYear());
    }
}
