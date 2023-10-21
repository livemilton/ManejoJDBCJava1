package org.example.test;

import org.example.datos.UsuarioJDBC;
import org.example.domain.Usuario;

import java.util.List;

public class ManejoUsuarios {

    public static void main(String[] args) {
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();

        //Ejecutando el listado de usuarios
        List<Usuario> usuarios = usuarioJDBC.select();
        for(Usuario usuario: usuarios){
            System.out.println("Usuario:" + usuario);
        }

        //Insertamos un nuevo  usuario
        /*
        Usuario usuario= new Usuario("carlos.Juarez","123");
        usuarioJDBC.insert(usuario);
        */

        //Modificar un usuario existente
        /*
        Usuario usuario = new Usuario(3, "Hilda.Muñoz", "1234");
        usuarioJDBC.update(usuario);
        */
        //Eliminar un usuario existente
        usuarioJDBC.delete(new Usuario(3));
    }
}
