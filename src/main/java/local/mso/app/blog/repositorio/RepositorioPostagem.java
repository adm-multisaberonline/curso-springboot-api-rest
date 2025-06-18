package local.mso.app.blog.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import local.mso.app.blog.entidades.Postagem;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPostagem extends JpaRepository <Postagem, Integer> {

}
