import org.example.Domain.Model.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testFormatoMatricula() {
        Aluno aluno = new Aluno("João", 20, "Engenharia");
        String matricula = aluno.getMatricula();
        assertTrue(matricula.matches("\\d{4}\\d{3}"));
    }

    @Test
    public void testMatriculaDiferenteParaAlunosDiferentes() {
        Aluno aluno1 = new Aluno("João", 20, "Engenharia");
        Aluno aluno2 = new Aluno("Maria", 22, "Administração");
        assertNotEquals(aluno1.getMatricula(), aluno2.getMatricula());
    }

    @Test
    public void testMatriculaAnoAtual() {
        Aluno aluno = new Aluno("Pedro", 21, "Medicina");
        String matricula = aluno.getMatricula();
        int anoAtual = java.time.LocalDate.now().getYear();
        String anoMatricula = matricula.substring(0, 4);
        assertEquals(Integer.toString(anoAtual), anoMatricula);
    }
}