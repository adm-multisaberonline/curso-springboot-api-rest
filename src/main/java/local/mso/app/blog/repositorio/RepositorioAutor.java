package local.mso.app.blog.repositorio;

import local.mso.app.blog.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAutor extends JpaRepository<Autor, Integer> {
}
