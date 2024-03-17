/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

/**
 *
 * @author Nátalle
 */
public class Principal {
    public static void main(String[] args) {
      
     
        boolean cadastro = false; 
        int confirmacao;
        
        System.out.println("Deseja cadastrar uma nova música?" + "Digite 1 para 'SIM' e 2 para 'NÃO'"); 
         confirmacao = new java.util.Scanner(System.in).nextInt();
         if (confirmacao == 1){
         cadastro = true;
         }
         do{
         
         Compositor c = new Compositor();
             System.out.println("Informe o nome do compositor");
             c.nomeCompositor = new java.util.Scanner(System.in).nextLine();
             System.out.println("Informe a nacionalidade do compositor");
             c.nacionalidadeCompositor = new java.util.Scanner(System.in).nextLine();
        Musicas m = new Musicas ();
             System.out.println("Informe o nome da musica");
             m.nomeMusica = new java.util.Scanner(System.in).nextLine();
             System.out.println("Informe o ano de criação da música");
             m.anoMusica = new java.util.Scanner(System.in).nextInt();
             System.out.println("Informe o gênero da Musica");
             m.generoMusica = new java.util.Scanner(System.in).nextLine();
             
        
             System.out.println("Informações registradas com sucesso!!");
             
              int registroMusica = 0;
              registroMusica++;
              
             System.out.println("Deseja verificar esse registro? 1 - SIM  2 - NÃO");
             int resposta = new java.util.Scanner(System.in).nextInt();
             if (resposta == 1){
             System.out.println("Nome da Musica:  " + m.nomeMusica);
             System.out.println("Nome do Compositor: " + c.nomeCompositor);
             System.out.println("Gêrero musical: " + m.generoMusica);
             System.out.println("Ano: " + m.anoMusica);
             System.out.println("Nacionalidade compositor: " + c.nacionalidadeCompositor);
             
             System.out.println("Número de registro: " + registroMusica);
         
                }else if (resposta == 2){
                 System.out.println("Número de registro: " + registroMusica);}
             
         }while(!cadastro);
        
    }
}
