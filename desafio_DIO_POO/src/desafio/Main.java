package desafio;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição do curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria JAVA");
        mentoria1.setDescricao("Descrição da mentoria JAVA");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JS");
        mentoria2.setDescricao("Descrição da mentoria JAVA");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição do Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        JOptionPane.showMessageDialog(null, "Cursos inscritos Lucas: " + devLucas.getConteudosInscrito());
        devLucas.progressao();
        devLucas.progressao();
        devLucas.progressao();
        devLucas.progressao();
        System.out.println("-");
        JOptionPane.showMessageDialog(null, "Cursos concluídos Lucas: " + "\n" + devLucas.getConteudosConcluiddos());
        JOptionPane.showMessageDialog(null, "Cursos inscritos Lucas: " + "\n" + devLucas.getConteudosInscrito());
        JOptionPane.showMessageDialog(null, "XP: " + "\n" + devLucas.calcularXp());

        System.out.println("*-----------------------------------------------------//---------------------------------------------------------------*");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Cursos inscritos João: " + devJoao.getConteudosInscrito());
        devJoao.progressao();
        System.out.println("-");
        System.out.println("Cursos inscritos João: " + devJoao.getConteudosInscrito());
        System.out.println("Cursos concluídos João: " + devJoao.getConteudosConcluiddos());
        System.out.println("XP: " + devJoao.calcularXp());
        
    }
}
