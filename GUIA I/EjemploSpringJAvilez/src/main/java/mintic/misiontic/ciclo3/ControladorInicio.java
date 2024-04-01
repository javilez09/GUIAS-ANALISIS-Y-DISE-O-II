/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio (){
        log.info("Ejecutando el controlador Inicio");
        return "Este es el inicio V2 hecho por Jamir A";
    }
    
}
