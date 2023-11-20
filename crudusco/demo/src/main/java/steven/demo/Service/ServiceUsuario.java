package steven.demo.Service;

import steven.demo.interfaces.IUsuarios;
import steven.demo.interfaceService.IUsuariosService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import steven.demo.modelo.Usuarios;

import java.util.List;

@Service
public class ServiceUsuario implements  IUsuariosService{

    @Autowired
    private IUsuarios iUsuarios;

    @Override
    public List<Usuarios> listar() {
        return (List<Usuarios>) iUsuarios.findAll();
    }


    @Override
    public void save(Usuarios u) {
        int res =0;
        Usuarios usuarios = iUsuarios.save(u);
        if (!usuarios.equals(null)){
            res = 1;
        }
    }


}

