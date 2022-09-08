import java.util.Date;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Aluno aluno = new Aluno(); 
        aluno.nome = "José Nataniel N. Andrade da Silva";
        aluno.dataDeNascismento = sdf.parse("29/05/2002");
        aluno.email = "capic.2020118tads0339@aluno.ifpi.edu.br";


        Professor professor = new Professor();
        professor.nome = "Jesiel";
        professor.email = "professorjesiel@ifpi.edu.br";
        professor.formacao = "Mestre";


        Curso curso = new Curso();
        curso.nome = "Análise e Desenvolvimento de sistemas";
        curso.cargaHoraria = 2040;
        curso.modalidade = "Presencial";
        curso.nivel = "Superior";
        curso.dataDeInicio = sdf.parse("11/03/2020");
        curso.dataDeFim = sdf.parse("20/01/2025");
        curso.gratuito = true;
    

        Certificado certificado = new Certificado();
        certificado.nomeDoAluno = "José Nataniel N Andrade da Silva";
        certificado.dataDeNascimento = sdf.parse("29/05/2002");
        certificado.nomeDocurso = "Análise e Desenvolvimento de Sistemas";
        certificado.cargaHoraria = 2040;
        certificado.modalidade = "Presencial";
        certificado.nivel = "Superior";
        certificado.dataDeInicio = sdf.parse("11/03/2020");
        certificado.dataDeFim = sdf.parse("20/01/2025");
        
        System.out.format("O aluno %s, tem %s como professor, fez o curso de %s, \ncom carga horária de: %d Hrs, e teve inicio em  %s e foi concluido em %s.", aluno.nome, professor.nome, curso.nome, curso.cargaHoraria, sdf.format(certificado.dataDeInicio), sdf.format(certificado.dataDeFim));
    }
}