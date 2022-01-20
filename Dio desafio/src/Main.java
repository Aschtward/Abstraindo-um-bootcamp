import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso();
		Curso curso1 = new Curso();
		Mentoria mentoria = new Mentoria();
		Conteudo curso2 = new Curso(); /*Conceito de polimorfismo*/
		Bootcamp bootcamp = new Bootcamp();
		Dev devLeo = new Dev();
		Dev devLeo1 = new Dev();
		
		devLeo.setNome("Leo");
		devLeo1.setNome("Leonardo");
		
		curso.setTitulo("Curso java");
		curso.setDescricao("Quero café");
		curso.setCargaHoraria(8);
		
		curso1.setTitulo("Curso projetin");
		curso1.setDescricao("Quero shape");
		curso1.setCargaHoraria(1000);
		
		mentoria.setData(LocalDate.now());
		mentoria.setDescricao("Mentoria para os que precisam de shape");
		mentoria.setTitulo("Mentoria de tri-set");
		
		bootcamp.setNome("GFT START JAVA #3");
		bootcamp.setDescricao("Da uma chance ae GFT eu serei um ótimo estagiário");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);
		
		devLeo.inscreverBootcamp(bootcamp);
		devLeo1.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos inscritos leo:" + devLeo.getConteudosInscritos());
		System.out.println("Conteudos inscritos leonardo:" + devLeo1.getConteudosInscritos());
		System.out.println("XP leo:" + devLeo.calcularXp());
		System.out.println("XP leonardo:" + devLeo1.calcularXp());
		System.out.println("------------------------------------------");
		
		devLeo.progredir();
		devLeo1.progredir();
		devLeo.progredir();
		
		System.out.println("Conteudos concluidos leo:" + devLeo.getConteudosConcluidos());
		System.out.println("Conteudos concluidos leonardo:" + devLeo1.getConteudosConcluidos());
		System.out.println("XP leo:" + devLeo.calcularXp());
		System.out.println("XP leonardo:" + devLeo1.calcularXp());
		System.out.println("------------------------------------------");
		
		System.out.println("Conteudos inscritos leo:" + devLeo.getConteudosInscritos());
		System.out.println("Conteudos inscritos leonardo:" + devLeo1.getConteudosInscritos());
		System.out.println("XP leo:" + devLeo.calcularXp());
		System.out.println("XP leonardo:" + devLeo1.calcularXp());
		System.out.println("------------------------------------------");
		
		devLeo.progredir();
		
		System.out.println("Conteudos inscritos leo:" + devLeo.getConteudosInscritos());
		System.out.println("Conteudos inscritos leonardo:" + devLeo1.getConteudosInscritos());
		System.out.println("XP leo:" + devLeo.calcularXp());
		System.out.println("XP leonardo:" + devLeo1.calcularXp());
		System.out.println("------------------------------------------");
		
		/*System.out.println(curso);
		System.out.println(curso1);
		System.out.println(mentoria);*/
		
		
	}
}
