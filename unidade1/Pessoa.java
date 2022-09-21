//pachage br.com.ap3.adna; // tá errado.

// o que é isso?
/*
 * \\Pessoa
 * \\br.com.ap3.adna.Pes
 * 
 */

public class Pessoa {
   int idade;
   string nome;

   public string getNome() {
      return nome;
   }

   public int idade() {
      return idade;
   }

   void setNome(string nome) {
      this.nome = nome; // ?
   }

   void setIdade(int idade) {
      this.idade = idade;

   }

   public String tostring() {
      // string pessoa string = nome +"\n"+;//?
      String pessoaEmString = nome + "\n";// ?
      pessoaEmString += idade + " idade";
      return pessoaEmString;
   }
}