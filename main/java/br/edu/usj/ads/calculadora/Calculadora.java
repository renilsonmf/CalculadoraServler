package br.edu.usj.ads.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculadora {
       
    @PostMapping(value = "/calcula")
    public ModelAndView postCalcula(
        @RequestParam String num1,
        @RequestParam String num2,
        @RequestParam String operador){


    ModelAndView modelAndView = new ModelAndView("index");

    Double resultado = 0.0;
    Double numero1 = Double.parseDouble(num1);
    Double numero2 = Double.parseDouble(num2);

    switch (operador) {
        case "+":
            resultado = numero1 + numero2;
            break;
        case "-":
            resultado = numero1 - numero2;
            break;
        case "/":
            resultado = numero1 / numero2;
            break;
        case "x":
            resultado = numero1 * numero2;
            break;
        default:
            resultado = 0.0;
    }


    String texto = " O Resultado é " + resultado;

    modelAndView.addObject("mensagem", texto);
    return modelAndView;

  }

}


   