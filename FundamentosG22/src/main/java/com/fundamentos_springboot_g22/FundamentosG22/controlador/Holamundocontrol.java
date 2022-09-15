package com.fundamentos_springboot_g22.FundamentosG22.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author krono
 */
@RestController
@RequestMapping("/saludo")
public class Holamundocontrol {
    
    @GetMapping("/hola")
    public String Saludar(){
        return "<h1>Hola mundo, estoy en springBoot<h1>";
    }
    
}
