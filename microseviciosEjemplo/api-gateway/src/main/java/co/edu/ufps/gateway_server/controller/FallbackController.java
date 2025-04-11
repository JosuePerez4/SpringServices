package co.edu.ufps.gateway_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class FallbackController {

    @GetMapping("/fallback-products")
    public List<Map<String, Object>> fallbackProducts() {
        return List.of(
                Map.of(
                        "id", -1,
                        "nombre", "Producto no disponible",
                        "precio", 0.0,
                        "informacion", "EL SERVICIO PRODUCTS, NO SE ENCUENTRA DISPONIBLE"));
    }
}
