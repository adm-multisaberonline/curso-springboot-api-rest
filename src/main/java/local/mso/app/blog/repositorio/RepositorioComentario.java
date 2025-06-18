package local.mso.app.blog.repositorio;

import local.mso.app.blog.entidades.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioComentario extends JpaRepository<Comentario, Integer> {
}
