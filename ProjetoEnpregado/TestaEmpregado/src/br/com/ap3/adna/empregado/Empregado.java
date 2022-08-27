package br.com.ap3.adna.empregado;

public class Empregado {
    private String primeiroNome;
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    private String sobrenome;
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    private double salarioMensal;
    
    public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal){
        if(salarioMensal< 0.0){
            this.salarioMensal = 0.0;
        }
        else{
            this.salarioMensal = salarioMensal;
        }
    }

    public double getsalarioAnual (){
        return this.salarioMensal * 12;
    }

    @Override
    public String toString() {
        return "Empregado [primeiroNome=" + primeiroNome + ", salarioMensal=" + salarioMensal + ", sobrenome=" + sobrenome
                + "]";
    }

    
}
