/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo2;

/**
 *
 * @author Nátalle
 */
public class Aluno {
    String aluno;
    int matricula ;
    int anoMatricula = 2024;
    
    
   
 public String getAluno(){
     return aluno;
 }
 public void setAluno(String aluno ){
     this.aluno = aluno;
 }
  public int getMatricula(){
    
     return matricula;
 }
 public void setMatricula (int matricula ){
     this.matricula = anoMatricula + matricula+1;
  
}
public int getAnoMatricula (){
    return anoMatricula;
}
public void setAnoMatricula (int anoMatricula){
        this.anoMatricula = anoMatricula;
}
}


