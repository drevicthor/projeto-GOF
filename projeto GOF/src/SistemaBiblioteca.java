public class SistemaBiblioteca {

    private static SistemaBiblioteca instance;

    private LibrarySystem() {
    }

    public static SistemaBiblioteca getInstance() {
        if (instance == null) {
            instance = new SistemaBiblioteca();
        }
        return instance;
    }
}
