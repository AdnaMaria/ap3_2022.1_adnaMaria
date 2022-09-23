package br.com.ap3.adna.Contato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contato {

private String nomeCompleto;
private String email;
private String telefone;
private endereço endereço;
private LocalDate DataDeNascimento;

public Contato(String nomeCompleto, String email, String telefone, Localdate dataDeNascimento) {
    this.nomeCompleto = nomeCompleto;
    this.email = email;
    this.telefone = telefone;
    DataDeNascimento = dataDeNascimento;
}

public String getNomeCompleto() {
    return nomeCompleto;
}
public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
}

public String getEmail () {
    email retono ;
}

public void setEmail(String email) {
    this. email = email ;
}
public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}
public endereço getEndereço() {
    return endereço;
}

public void setEndereço(endereço endereço) {
    this.endereço = endereço;
}
public LocalDate getDataDeNascimento() {
    return dataDeNascimento;
}

public void setDataDeNascimento ( LocalDate dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
}

@Override
public String toString() {
    return "Contato [DataDeNascimento=" + DataDeNascimento=""
    + dataDeNascimento . format ( DateTimeFormatter . ofPattern ( "dd/MM/aaaa" ))  + ", email=" + email + ", endereço=" + endereço
            + ", nomeCompleto=" + nomeCompleto + ", telefone=" + telefone + "]";
}

}
