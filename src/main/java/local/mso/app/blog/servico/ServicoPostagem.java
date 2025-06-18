package local.mso.app.blog.servico;

import local.mso.app.blog.entidades.Postagem;
import local.mso.app.blog.repositorio.RepositorioPostagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoPostagem {

    @Autowired
    private RepositorioPostagem repo;

    public List<Postagem> buscarTodos() {
        return repo.findAll();
    }

    public Postagem buscar(int id) {
        Optional<Postagem> optinalObj = repo.findById(id);
        return optinalObj.orElse(null);
    }

    public Postagem salvar(Postagem objPostagem){
            objPostagem.setId(null);
            return repo.save(objPostagem);
    }

    public void deletar(int id){
        buscar(id);
        repo.deleteById(id);
    }

    public Postagem editar(Postagem obj){
        Postagem newObj = buscar(obj.getId());
        modificar (newObj, obj);
        return repo.save(newObj);
    }

    public void modificar(Postagem newObj, Postagem obj){
        newObj.setAutor(obj.getAutor());
        newObj.setComentarios(obj.getComentarios());
        newObj.setTexto(obj.getTexto());
        newObj.setTitulo(obj.getTitulo());
    }

}
