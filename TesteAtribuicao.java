import javax.swing.JOptionPane;
public class TesteAtribuicao
{
   public static void main(String[] args)
   {
      String nome=JOptionPane.showInputDialog("Digite o nome do professor:");
      int idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor:"));
      
      String nomeDisciplina=JOptionPane.showInputDialog("Digite o nome da disciplina:");
      String tpratica=JOptionPane.showInputDialog("A disciplina tem pratica?Caso sim digite sim, caso contrario não:");
      
      boolean pratica=tpratica.equals("sim");
      
      
      //Criando objetos
      Professor professor   = new Professor(nome,idade);
      
      Disciplina disciplina = new Disciplina(nomeDisciplina,pratica);
      
      Atribuicao atribuicao = new Atribuicao(professor,disciplina);
      
      
      //Alterando os dados
      professor.setNome(nome);
      professor.setIdade(idade);
      
      disciplina.setNomeDisciplina(nomeDisciplina);
      disciplina.setPratica(pratica);
      
     //Eu poderia usar x(); no lugar de getdados(), mas precisaria trocar o que está escrito no metodo de construir string coma resposta de saida 
     //Da classe Atribuicao, já que estou pegando de lá as informações. coloco parentes, pq estou pegando um método
      
      JOptionPane.showMessageDialog(null,atribuicao.getDados());
   }
}