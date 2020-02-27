package sw2.clase11ej1clienterest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sw2.clase11ej1clienterest.dao.ProductDao;

@Controller
public class ProductController {

    @Autowired
    ProductDao productDao;

    @GetMapping({"/product/list","/product"})
    public String listarProductos(Model model){
        model.addAttribute("listaProductos",productDao.listarProductos());
        return "product/list";
    }

}
