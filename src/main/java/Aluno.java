import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    List<Double> notasBimestres = new ArrayList<>();
    List<Integer> frequencia = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotasBimestres() {
        return notasBimestres;
    }


    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void addBimestre(Bimestre bimestre){
        double tmp = bimestre.notaParcial();
        int faltas = bimestre.getFaltas();
        notasBimestres.add(tmp);
        frequencia.add(faltas);
    }

    public double mediaFinal(){
        double notatmp = 0;
        for (Double notasBimestre : notasBimestres) {
            notatmp += notasBimestre;
        }

        return notatmp/4;
    }

    public double frequenciaFinal(){
        int faltas = 0;
        for (Integer frequencia : frequencia) {
            faltas += frequencia;
        }

        return ((((40*frequencia.size()) -(double)faltas)/(40*frequencia.size()))*100);
    }

    public String statusAno(){
        double mediaFinal, presencafinal;
        mediaFinal = this.mediaFinal();
        presencafinal = this.frequenciaFinal();
        if(mediaFinal > 6 && presencafinal > 75){
            return "Aprovado!";
        } else if(mediaFinal > 5 && presencafinal > 75.0){
            return "Recuperação. Boa sorte!";
        } else {
           return "reprovado.";
        }
    }
}
