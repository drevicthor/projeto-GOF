public class UsuarioFactory {

    public Usuario criarUsuario(String tipo) {
        if (tipo.equalsIgnoreCase("Estudante")) {
            return new Estudante();
        } else if (tipo.equalsIgnoreCase("Professor")) {
            return new Professor();
        }
    }

