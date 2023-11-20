package steven.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import steven.demo.interfaceService.ITablaService;
import steven.demo.modelo.Tabla;

import java.util.List;

@Controller
@RequestMapping
public class ControllerTabla {

    @Autowired
    private ITablaService tablaService;

    @GetMapping("/listar2")
    public String listar2(Model model) {
        List<Tabla> tabla = tablaService.listar2();
        model.addAttribute("tabla", tabla);
        return "listaDatos";
    }

    @GetMapping ("/registro2")
    public String agregars(Model model){
        model.addAttribute("tabla", new Tabla());
        return "registroDatos";
    }

    @PostMapping("/savers")
    public String savers(@Validated Tabla u){
        tablaService.save(u);
        return "redirect:/listar2";
    }

    @PostMapping("/editar")
    public String editarTabla(@Validated Tabla tabla) {
        tablaService.save(tabla);
        return "redirect:/listar2";
    }

    // Maneja solicitudes GET para editar una persona por su ID
    @GetMapping("/editar/{id}")
    // Utiliza la anotación @PathVariable para vincular el valor de la variable en la URL
    public String editar(@PathVariable int id, Model model) {
        // Obtiene la persona con el ID proporcionado desde el servicio
        Tabla tabla = tablaService.getById(id);
        // Agrega la persona al modelo para que esté disponible en la vista
        model.addAttribute("tabla", tabla);
        // Devuelve el nombre de la vista a la que se redirige
        return "registroDatos";
    }

    @GetMapping("eliminar/{id}")
    public String delete(@PathVariable int id) {
        tablaService.delete(id);
        return "redirect:/listar2";
    }
}


