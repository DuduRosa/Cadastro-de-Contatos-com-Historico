package br.edu.usj.ads.lpii.cadastrodecontatos;

import java.util.ArrayList;
import java.util.List;

public class GravarDados {

    List<Dados> contatos = new ArrayList<>();

    void inserir(String nome, String telefone, String cpf, String email, String data) {
        Dados contato = new Dados();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setCpf(cpf);
        contato.setEmail(email);
        contato.setData(data);
        contatos.add(contato);
    }

    List<Dados> retirar() {
        return contatos;
    }
}