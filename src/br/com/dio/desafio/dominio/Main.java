package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJenifer = new Dev();
        devJenifer.setNome("Jenifer");
        devJenifer.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jenifer" + devJenifer.getConteudoInscritos());
        devJenifer.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jenifer" + devJenifer.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Jenifer" + devJenifer.getConteudoInscritos());

        System.out.println("..........");

        Dev devIsabelli = new Dev();
        devIsabelli.setNome("Isabelli");
        devIsabelli.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Isabelli" + devIsabelli.getConteudoInscritos());
        devIsabelli.progredir();
        devIsabelli.progredir();
        devIsabelli.progredir();
        System.out.println("Conteúdos Inscritos Isabelli" + devIsabelli.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Isabelli" + devIsabelli.getConteudoInscritos());
    }
}