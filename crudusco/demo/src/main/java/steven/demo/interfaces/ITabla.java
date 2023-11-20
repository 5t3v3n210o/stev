package steven.demo.interfaces;

import steven.demo.modelo.Tabla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITabla extends JpaRepository<Tabla, Integer>{
    
}
