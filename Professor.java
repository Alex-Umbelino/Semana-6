
public class Professor
{  //Atributos
   private String nome;
   private int idade;
   //Metodo construtor
   
   public Professor(String n, int idade)
   {
      nome=n;
      this.idade=idade;
   }
   //Metodo modificador
   
   public void setNome(String n)
   {
     nome=n;
   }
   public void setIdade(int idade)
   {
      this.idade=idade;
   }
   
   
   //Metodo de acesso
   public String getNome()
   {
      return nome;
   }
   public int getIdade()
   {
      return idade;
   }
   
   //Metodo GetDados
   public String getDados()
   {
      return "\nNome: "+nome+" \nIdade:" +idade;
   }
   
   
   
   
}