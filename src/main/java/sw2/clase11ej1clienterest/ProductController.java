package sw2.clase11ej1clienterest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sw2.clase11ej1clienterest.entity.Product;

@Controller
public class ProductController {

    @GetMapping({"/product/list","/product"})
    public String listarProductos(Model model){

        //List<Product> listaProductos = ???
        //model.addAttribute("listaProductos",listaProductos);
        return "product/list";
    }

}
