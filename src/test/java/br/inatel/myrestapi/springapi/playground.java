package br.inatel.myrestapi.springapi;

import java.util.HashMap;
import java.util.Map;

import br.inatel.myrestapi.springapi.model.Curso;

public class playground {
    private static Map<Long, Curso> mapa = new HashMap<>();

    public static void main(String[] args) {

        Curso c1 = new Curso(1L, "Introdução ao Java", 100);
        Curso c2 = new Curso(2L, "Introdução ao Python", 80);
        Curso c3 = new Curso(3L, "Introdução ao C#", 200);
        Curso c4 = new Curso(4L, "Introdução ao C++", 150);
        Curso c5 = new Curso(5L, "Introdução ao C", 300);

        mapa.put(c1.getId(), c1);
        mapa.put(c2.getId(), c2);
        mapa.put(c3.getId(), c3);
        mapa.put(c4.getId(), c4);
        mapa.put(c5.getId(), c5);

        Curso novoCurso = new Curso();
        novoCurso.setDescricao("Rest com Spring Boot e Spring WebFlux");
        novoCurso.setCargaHoraria(120);
        novoCurso.setId(2L);

        mapa.put(novoCurso.getId(), novoCurso);

        System.out.println("Antes: " + mapa.get(2L));

        System.out.println(mapa.toString());
    }
}
