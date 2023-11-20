package steven.demo.interfaceService;

import steven.demo.modelo.Tabla;

import java.util.List;
import java.util.Optional;

public interface ITablaService {

    public List<Tabla> listar2();

    void save(Tabla u);

    public void delete(int id);

    // Método para obtener una persona por su ID
    public Tabla getById(int id);
}

