package desafio.dominio;

public class Curso extends Conteudo{

   private int cargaHoraria;

   public int getCargaHoraria() {
    return cargaHoraria;
   }

   public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
   }

   @Override
   public String toString() {
    return "Título: " + "\n" + getTitulo() + "\n" +
           "Descrição: " + "\n" + getDescricao() + "\n" +
           "Carga Horária: " + "\n" + getCargaHoraria() + "h" + "\n";
   }

   @Override
   public double calcularXp() {
      return XpPadrao * cargaHoraria;
   }
}
