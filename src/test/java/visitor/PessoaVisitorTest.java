package visitor;

import org.example.visitor.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirAluno() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Aluno{matricula=1, nome='Ana', curso=Sistemas de Informação}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessor() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Professor{matricula=1, nome='Maria', titulacao='Doutorado'}", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(funcionario));
    }

    // visitor json
    @Test
    void deveExibirAlunoEmJson() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        VisitorJson visitor = new VisitorJson();
        assertEquals("{ \"Aluno\": { \"matricula\": 1, \"nome\": \"Ana\", \"curso\": \"Sistemas de Informação\" }}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessorEmJson() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        VisitorJson visitor = new VisitorJson();
        assertEquals("{ \"Professor\": { \"matricula\": 1, \"nome\": \"Maria\", \"titulacao\": \"Doutorado\" }}", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionarioEmJson() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        VisitorJson visitor = new VisitorJson();
        assertEquals("{ \"Funcionario\": { \"codigo\": 1, \"nome\": \"Pedro\", \"salario\": 5000.0 }}", visitor.exibir(funcionario));
    }

    // visitor xml
    @Test
    void deveExibirAlunoEmXml() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        VisitorXml visitor = new VisitorXml();
        assertEquals("<Aluno><matricula>1</matricula><nome>Ana</nome><curso>Sistemas de Informação</curso></Aluno>",
                visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessorEmXml() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        VisitorXml visitor = new VisitorXml();
        assertEquals("<Professor><matricula>1</matricula><nome>Maria</nome><titulacao>Doutorado</titulacao></Professor>",
                visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionarioEmXml() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        VisitorXml visitor = new VisitorXml();
        assertEquals("<Funcionario><codigo>1</codigo><nome>Pedro</nome><salario>5000.0</salario></Funcionario>",
                visitor.exibir(funcionario));
    }
}