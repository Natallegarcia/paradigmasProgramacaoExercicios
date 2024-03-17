/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo2;
import javax.swing.JOptionPane;

/**
 *
 * @author Nátalle
 */
public class Principal {
    
    public static void main(String[] args) {
        
       int resposta;
      
        
     resposta = JOptionPane.showConfirmDialog(null, "Você é aluno da Instituição ?");
     if (resposta == JOptionPane.NO_OPTION){
     
     Aluno a = new Aluno();
     
     a.aluno =JOptionPane.showInputDialog( "Digite seu nome: ");
     int novaMatricula = JOptionPane.showConfirmDialog(null, "Deseja se matricular em um novo curso? " + a.aluno + "?");
            if (novaMatricula == JOptionPane.YES_OPTION ){
            Curso c = new Curso ();
            
          
            c.nomeCurso = JOptionPane.showInputDialog( "Informe o curso que deseja se matricular: ");
            c.siglaCurso = JOptionPane.showInputDialog( "Informe a sigla do curso: ");
            c.nomeDepartamento = JOptionPane.showInputDialog( "Informe o departamento responsável pelo curso " + c.nomeCurso);
            c.siglaDepartamento = JOptionPane.showInputDialog( "Informe a sigla do Departamento: ");
            c.duracaoCurso = Double.parseDouble(JOptionPane.showInputDialog("Informe a duração do curso: "));
            a.matricula = a.matricula+1;
            JOptionPane.showMessageDialog(null, "Matrícula efetuada com sucesso!! ");
            
            int b = JOptionPane.showConfirmDialog(null, "Deseja ver os dados da matrícula?  " + a.aluno + "?");
            if ( b == 0){
                JOptionPane.showMessageDialog(null, "Nome Aluno : " + a.aluno + "\n" + "Nome do Curso: " +  c.nomeCurso  + "\n" + "Sigla do Curso: " + c.siglaCurso + "\n" + "Departamento Responsável pelo Curso: " + c.nomeDepartamento + "\n" + "Sigla do Departamento: " + c.siglaDepartamento + "\n" + "Duração do curso: " + c.duracaoCurso + "\n" + "Número de Matrícula: " + a.anoMatricula + a.matricula );
                             
            
            }
     
            }
     }
    }
}
  
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        
          
    

