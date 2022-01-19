import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso();
		Curso curso1 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso.setTitulo("Curso java");
		curso.setDescricao("Quero café");
		curso.setCargaHoraria(8);
		
		curso1.setTitulo("Curso projetin");
		curso1.setDescricao("Quero shape");
		curso1.setCargaHoraria(1000);
		
		mentoria.setData(LocalDate.now());
		mentoria.setDescricao("Mentoria para os que precisam de shape");
		mentoria.setTitulo("Mentoria de tri-set");
		
		System.out.println(curso);
		System.out.println(curso1);
		System.out.println(mentoria);
	}
}
