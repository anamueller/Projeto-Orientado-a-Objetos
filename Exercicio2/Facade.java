package Exercicio2;

public class Facade {
    private static Facade instancia;

    private Facade(){}

    public static Facade obterInstancia(){
        if(instancia == null){
            instancia = new Facade();
        }
        return instancia;
    }

    BancoDeDados banco = new BancoDeDados();

   /* public void matricular(int matAluno, int codCurso, Turma turma){
        if (turma == null) {
            turma = new Turma();
            Curso c = Escola.getCurso(codCurso);
            turma.setCurso(c);
        }
        Aluno rex = Escola.getAluno(codAluno);
        turma.addAluno(rex);
    }

    public void exibirStatus(Turma turma){
        cursoFld.setText(turma.getCurso().getNome());
        Aluno[] alunos = turma.getAlunos();
        for (int i = 0; i < alunos.length; i++) {
            displayList.add(alunos[i]);
        }
    }*/
}