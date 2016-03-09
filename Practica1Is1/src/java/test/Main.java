package test;

import Mapeo.Usuario;
import Mapeo.Contrasenia;
import controlador.UsuarioDaoHibernate;
import controlador.ContraseniaDaoHibernate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {
        UsuarioDaoHibernate usuarioDAO = new UsuarioDaoHibernate();
        ContraseniaDaoHibernate contraseniaDAO = new ContraseniaDaoHibernate();
        Usuario usuario = new Usuario();
        Contrasenia contrasenia = new Contrasenia();
        usuario.setIdUsuario(2);
        usuario.setNombre("Juan");
        usuario.setApp("Perez");
        usuario.setMail("cuenta2@gmail.com");
        usuarioDAO.save(usuario);
        System.out.println("Todo salio bien en el insert");
        usuario.setNombre("Caen");
        usuarioDAO.update(usuario);
        System.out.println("Todo salio bien en el update");

        List<Usuario> lista = usuarioDAO.findAll();
        for (Usuario user : lista) {
            System.out.println(user.toString());
        }

    }
}
