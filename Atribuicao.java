public class Atribuicao
{ //Atributos
   private Professor professor;
   private Disciplina disciplina;
    //Metodo construtor
    public Atribuicao(Professor professor, Disciplina disciplina)
    {
      this.professor=professor;
      this.disciplina=disciplina;
    }
    //Metodo modificador
    public void setProfessor(Professor professor)
    {
      this.professor=professor;
    }
    public void setDisciplina(Disciplina didsciplina)
    {
      this.disciplina=disciplina;
    }
    
    //Metodo de acesso
    public Professor getProfessor()
    {
      return professor ;
    }
    public Disciplina getDisciplina()
    {
      return disciplina;
    }
    //Metodo GetDados
    public String getDados()
    {
      return "Professor: "+professor.getDados()+""+disciplina.getDados();
    }
    
    //
} 