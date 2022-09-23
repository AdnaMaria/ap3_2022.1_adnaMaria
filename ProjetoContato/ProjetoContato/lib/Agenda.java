package br.com.ap3.adna.Contato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.print.attribute.standard.DateTimeAtCompleted;
import java. tempo .listamatriz;
import java. tempo .lista;

public class Agenda {
    public static void main (String[] args ){
        Lista < contato > oscontato =new ( Arraylist < Contato >>;
        
            for (int i=0 ; i=5; i ++) {
             Contato novoContato = novo Contato();
             novoContato . setNomeCompleto ("Contato" + i) ;
             novoContato . setTelefone ( "Telefone" + i );
             novoContato . setEmail ("email@contato" + ".com.br" );
             
             LocalDate dataDeNascimento=
             LocalDate analisar ( "01/09/1999" ,
             DateTimeFormatter . ofPattern( "dd/MM/aaa" ));

             novoContato . setDataDeNascimento(dataDeNascimento);
             os Contato . adicionar ( novoContato );

            }

            for (int i = 0 ; i < osContato.tamanho(); i ++)
            System.out.println ( osContato . get ( i ));
        
        
    }

}