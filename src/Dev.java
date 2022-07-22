public class Dev {
    import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {
            @@ -27,42 +26,38 @@ public static void main(String[] args) {
                System.out.println(curso2);
                System.out.println(mentoria);*/

                Bootcamp bootcamp = new Bootcamp();
                bootcamp.setNome("Bootcamp Java Developer");
                bootcamp.setDescricao("Descrição Bootcamp Java Developer");
                bootcamp.getConteudos().add(curso1);
                bootcamp.getConteudos().add(curso2);
                bootcamp.getConteudos().add(mentoria);

                Dev devCamila = new Dev();
                devCamila.setNome("Camila");
                devCamila.inscreverBootcamp(bootcamp);
                System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
                devCamila.progredir();
                devCamila.progredir();
                System.out.println("-");
                System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
                System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
                System.out.println("XP:" + devCamila.calcularTotalXp());

                System.out.println("-------");

                Dev devJoao = new Dev();
                devJoao.setNome("Joao");
                devJoao.inscreverBootcamp(bootcamp);
                System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
                devJoao.progredir();
                devJoao.progredir();
                devJoao.progredir();
                System.out.println("-");
                System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
                System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
                System.out.println("XP:" + devJoao.calcularTotalXp());

                Bootcamp bootcamp1 = new Bootcamp();
                bootcamp1.setNome("Bootcamp Java Developer");
                bootcamp1.setDescricao("Descrição do bootcamp Java Developer");
                bootcamp1.getConteudos().add(curso1);
                bootcamp1.getConteudos().add(curso2);
                bootcamp1.getConteudos().add(mentoria);

                Dev dev1 = new Dev();
                dev1.setNome("Camila");
                dev1.inscreverBootcamp(bootcamp1);

                Dev dev2 = new Dev();
                dev2.setNome("João");
                dev2.inscreverBootcamp(bootcamp1);


                System.out.println("Inscritos:" + dev1.getNome() + ":" + dev1.getConteudosInscritos());
                dev1.progredir();
                dev1.progredir();
                dev1.progredir();
                dev1.progredir();
                System.out.println("Concluidos" + dev1.getNome() + ":" + dev1.getConteudosConcluidos());
                System.out.println("Inscritos:" + dev1.getNome() + ":" + dev1.getConteudosInscritos());

                System.out.println("----");

                System.out.println("Inscritos:" + dev2.getNome() + ":" + dev2.getConteudosInscritos());
                dev2.progredir();
                dev2.progredir();
                System.out.println("Concluidos" + dev2.getNome() + ":" + dev1.getConteudosConcluidos());
                System.out.println("Inscritos:" + dev2.getNome() + ":" + dev2.getConteudosInscritos());


                System.out.println("XP Camila:" + dev1.calcularTotalXp());
                System.out.println("XP Joao:" + dev2.calcularTotalXp());
            }

        }
  6
        src/br/com/dio/desafio/dominio/Bootcamp.java
        @@ -1,7 +1,10 @@
                package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

        public class Bootcamp {
            private String nome;
            @@ -11,6 +14,7 @@ public class Bootcamp {
                private Set<Dev> devsInscritos = new HashSet<>();
                private Set<Conteudo> conteudos = new LinkedHashSet<>();


                public String getNome() {
                    return nome;
                }
}
