package steven.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import steven.demo.interfaceService.IUsuariosService;
import steven.demo.modelo.Usuarios;

import java.util.List;

@Controller
@RequestMapping
public class ControllerUsuarios {

    @Autowired
    private IUsuariosService usuariosService;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Usuarios> usuarios = usuariosService.listar();
        model.addAttribute("usuarios", usuarios);
        return "lista";
    }

    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Usuarios> personas = usuariosService.listar();
        model.addAttribute("personas", personas);
        return "inicio";
    }

    @GetMapping("/inisecc")
    public String inicioseccion(Model model) {
        List<Usuarios> personas = usuariosService.listar();
        model.addAttribute("personas", personas);
        return "inicio_seccion";
    }

    @GetMapping ("/registro")
    public String agregar(Model model){
        model.addAttribute("usuarios", new Usuarios());
        return "registro";
    }

    @PostMapping("/saves")
    public String saves(@Validated Usuarios u){
        usuariosService.save(u);
        return "redirect:/inicio";
    }

}
