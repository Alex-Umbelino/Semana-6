public class Disciplina
{
   //Atributos
   private String nomeDisciplina;
   private boolean pratica;
   
   //Metodo construtor
   public Disciplina(String nome,boolean p)
   {
      nomeDisciplina=nome;
      pratica=p;
   } 
   
   
   //metodo modificador
   public void setNomeDisciplina(String nome)
   {
      nomeDisciplina=nome;
   }
   public void setPratica(boolean p)
   {
     pratica=p;
     
     
   }
   //Metodo de acesso
   public String getNomeDisciplina()
   {
      return nomeDisciplina;  
   }
   public boolean getPratica()
   {
      return pratica;
   }
   //Metodo getDados
   public String getDados()
   {
      return "\nNome da disciplina: "+nomeDisciplina+"\nA diciplina tem pratica?"+pratica;  
   }
   
}