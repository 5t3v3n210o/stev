package steven.demo.interfaceService;

import steven.demo.modelo.Usuarios;

import java.util.List;
import java.util.Optional;

public interface IUsuariosService {

    public List<Usuarios> listar();
    public void save(Usuarios u);


}
