ackage br.com.adna.ap3.contato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.adna.ap3.contato.endereco.CEP;
import br.com.adna.ap3.contato.endereco.Endereco;
import br.com.adna.ap3.contato.endereco.Estado;

public class TestaContato {
    public static void main(String[] args) {
        Contato contatoadna = new Contato();

        Endereco enderecoDeXico = new Endereco("Rua de adna");
        enderecoDeadna.setBairro("Bairro de adna");
        enderecoDeadna.setCidade("Afonso bezerra");
        enderecoDeadna.setEstado(Estado.RN);
        enderecoDeadna.setNumero(003);
        enderecoDeadna.setCep(new CEP(59010, 000));
        
        LocalDate dataDeNascimento =
        LocalDate.parse("01/09/1999",
        DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        contatoXico.setDataDeNascimento(dataDeNascimento);
        
        contatoXico.setEndereco(enderecoDeadna);
        contatoXico.setNomeCompleto("Adna Maria");

        System.out.println(contatoAdna);
    }