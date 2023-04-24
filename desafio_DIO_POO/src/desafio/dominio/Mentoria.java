package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
   
   private LocalDate data;

    public Mentoria() {
        
    }

   public LocalDate getData() {
    return data;
   }

   public void setData(LocalDate data) {
    this.data = data;
   }

   @Override
   public String toString() {
    return "Título: " +  "\n" + getTitulo() + "\n" +
           "Descrição: " +  "\n" + getDescricao() + "\n" +
           "Data: " +  "\n" + getData() + "\n";
   }

   @Override
   public double calcularXp() {
      return XpPadrao + 20d;
   }
}
