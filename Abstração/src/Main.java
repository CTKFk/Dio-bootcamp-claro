import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) { 
        Curso curso1 = new Curso(); //criando um objeto curso1
        curso1.setTitulo("curso java"); //setando o titulo do curso1
        curso1.setDescricao("descrição curso java");    //setando a descrição do curso1
        curso1.setCargaHoraria(8);  //setando a carga horária do curso1

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js"); //setando o titulo do curso2
        curso2.setDescricao("descrição curso js"); //setando a descrição do curso2
        curso2.setCargaHoraria(4); //setando a carga horária do curso2

        Mentoria mentoria = new Mentoria(); //criando um objeto mentoria
        mentoria.setTitulo("mentoria de java"); //setando o titulo da mentoria
        mentoria.setDescricao("descrição mentoria java"); //setando a descrição da mentoria
        mentoria.setData(LocalDate.now()); //setando a data da mentoria

        System.out.println(curso1); //imprimindo o curso1
        System.out.println(curso2);     //imprimindo o curso2
        System.out.println(mentoria);  //imprimindo a mentoria

        Bootcamp bootcamp = new Bootcamp(); //criando um objeto bootcamp
        bootcamp.setNome("Bootcamp Java Developer"); //setando o nome do bootcamp
        bootcamp.setDescricao("Descrição Bootcamp Java Developer"); //setando a descrição do bootcamp
        bootcamp.getConteudos().add(curso1); //adicionando o curso1 ao bootcamp
        bootcamp.getConteudos().add(curso2); //adicionando o curso2 ao bootcamp
        bootcamp.getConteudos().add(mentoria);  //adicionando a mentoria ao bootcamp

        Dev devCamila = new Dev(); //criando um objeto devCamila
        devCamila.setNome("Camila"); //setando o nome do devCamila
        devCamila.inscreverBootcamp(bootcamp); //inscrevendo o devCamila no bootcamp 
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos()); //imprimindo os conteúdos inscritos do devCamila
        devCamila.progredir(); //progredindo o devCamila
        devCamila.progredir(); //progredindo o devCamila
        System.out.println("-"); 
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos()); //imprimindo os conteúdos inscritos do devCamila
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos()); //imprimindo os conteúdos concluídos do devCamila
        System.out.println("XP:" + devCamila.calcularTotalXp()); //imprimindo o total de xp do devCamila

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

    }

}