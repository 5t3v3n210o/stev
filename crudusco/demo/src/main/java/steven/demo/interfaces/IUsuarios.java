package steven.demo.interfaces;

import steven.demo.modelo.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarios extends JpaRepository<Usuarios, Integer>{

}
