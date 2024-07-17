package api.rest.first_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import api.rest.first_api.handler.BusinessExeption;
import api.rest.first_api.model.Usuario;

@Repository
public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();

    public void save(Usuario usuario) {
        if (usuario.getLogin() == null) {
            throw new BusinessExeption("Login e obrigatorio");
        }

        if (usuario.getId() == null) {
            System.out.println("Save - recebendo o usuario na camada de repositório");
            usuarios.add(usuario);
        } else
            System.out.println("Update - recebendo o usuario na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println("Delete/id - recebendo o id:%d para excluir um usuario na camada de repositorio");
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("List - listando os usuarios do sistema");

        usuarios.add(new Usuario("josiel", "123"));
        usuarios.add(new Usuario("francisco", "123"));

        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println("Find/id - recebendo o id:%d para buscar um usuario na camada de repositório");
        return new Usuario("josiel", "123");
    }

    public Usuario findByUsername(String username) {
        System.out.println("Find/username - recebendo o username:%s para buscar um usuario na camada de repositório");
        return new Usuario("josiel", "123");
    }
}
