package br.edu.usj.ads.lpii.cadastrodecontatos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerDados {

    GravarDados gravar = new GravarDados();

    @PostMapping(value = "/index")
    public ModelAndView postMethodName(@RequestParam String nome, @RequestParam String telefone,
            @RequestParam String cpf, @RequestParam String email, @RequestParam String data) {

        String cNome = nome;
        String cTelf = telefone;
        String cCpf = cpf;
        String cEmail = email;
        String cData = data;

        gravar.inserir(cNome, cTelf, cCpf, cEmail, cData);

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("dados", gravar.retirar());

        return modelAndView;
    }

}