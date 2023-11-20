package steven.demo.Service;

import steven.demo.interfaces.ITabla;
import steven.demo.interfaceService.ITablaService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import steven.demo.modelo.Tabla;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTabla implements  ITablaService{

    @Autowired
    private ITabla iTablaService;

    @Override
    public List<Tabla> listar2() {
        return (List<Tabla>) iTablaService.findAll();
    }


    @Override
    public void save(Tabla i) {
        int res = 0;
        Tabla tabla = iTablaService.save(i);
        if (!tabla.equals(null)) {
            res = 1;
        }

    }
    @Override
    public void delete(int id) {
        iTablaService.deleteById(id);
    }
    public Tabla getById(int id) {
        Optional<Tabla> optionalTabla = iTablaService.findById(id);
        return optionalTabla.orElse(null);
    }
}


