package Exercicio2;

public class Turma {
    Aluno alunos [];
    Curso cursos [];
    int lastposition=0;

    public void createTurma(Aluno a[], Curso c[]){
        for(int i=0;i<a.length;i++){ //turma
            alunos[i]=a[i];
            cursos[i]=c[i];
            lastposition++;
        }
    }

    public void addAluno(Aluno al){
        alunos[lastposition]=al;
    }

    public Aluno getAluno(int cod){
        return alunos[cod];
    }

    public Curso getCursos(int cod){
        return cursos[cod];
    }

    public Curso getCurso() {
        return null;
    }

    public Aluno[] getAlunos() {
        return null;
    }

    public void setCurso(Curso c) {
    }
}
