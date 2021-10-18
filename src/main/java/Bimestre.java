public class Bimestre {
    Double participacaoSalaDeAula;
    Double entregaDeTarefas;
    Double trabalhoBimestral;
    Double provaBimestral;
    Integer faltas;

    public Bimestre(Double participacaoSalaDeAula, Double entregaDeTarefas, Double trabalhoBimestral, Double provaBimestral, Integer faltas) {
        this.participacaoSalaDeAula = participacaoSalaDeAula;
        this.entregaDeTarefas = entregaDeTarefas;
        this.trabalhoBimestral = trabalhoBimestral;
        this.provaBimestral = provaBimestral;
        this.faltas = faltas;
    }

    public Bimestre() {
    }

    public Double getParticipacaoSalaDeAula() {
        return participacaoSalaDeAula;
    }

    public void setParticipacaoSalaDeAula(Double participacaoSalaDeAula) {
        this.participacaoSalaDeAula = participacaoSalaDeAula;
    }

    public Double getEntregaDeTarefas() {
        return entregaDeTarefas;
    }

    public void setEntregaDeTarefas(Double entregaDeTarefas) {
        this.entregaDeTarefas = entregaDeTarefas;
    }

    public Double getTrabalhoBimestral() {
        return trabalhoBimestral;
    }

    public void setTrabalhoBimestral(Double trabalhoBimestral) {
        this.trabalhoBimestral = trabalhoBimestral;
    }

    public Double getProvaBimestral() {
        return provaBimestral;
    }

    public void setProvaBimestral(Double provaBimestral) {
        this.provaBimestral = provaBimestral;
    }


    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    public double notaParcial(){
        return (this.participacaoSalaDeAula * 0.15) + (this.entregaDeTarefas * 0.25) +
                (this.trabalhoBimestral * 0.3) + (this.provaBimestral * 0.3);
    }
}
