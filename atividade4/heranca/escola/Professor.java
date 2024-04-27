package atividade4.heranca.escola;

public class Professor extends Aluno {
     
    private Double salario;
    private String disciplina;
    
    private Professor(){}

    public Professor(String nome, Integer matricula, Integer telefone, String turno, Double salario, String disciplina) {
        
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.turno = turno;
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public Double getBonificacao(){
        return this.salario * 0.15;
    }

    @Override
    public String toString() {
        return "{" +
            " salario='" + getSalario() + "'" +
            ", nome='" + getNome() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", turma='" + getTurma() + "'" +
            ", turno='" + getTurno() + "'" +
            ", disciplina='" + getDisciplina() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }

}
