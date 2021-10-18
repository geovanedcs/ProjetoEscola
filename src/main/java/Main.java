public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Geovane");
        Bimestre primeiroBimestre = new Bimestre(6d,6d,6d,6d,6);
        Bimestre segundoBimestre = new Bimestre(7d,4d,6d,6d,0);
        Bimestre terceiroBimestre = new Bimestre(9d,6d,1d,3d,10);
        Bimestre quartoBimestre = new Bimestre(4d,6d,3d,1d,10);

        aluno.addBimestre(primeiroBimestre);
        aluno.addBimestre(segundoBimestre);
        aluno.addBimestre(terceiroBimestre);
        aluno.addBimestre(quartoBimestre);

//        for(int i =0; i<aluno.frequencia.size();i++){
//            System.out.println(aluno.frequencia.get(i));
//        }

        System.out.println(aluno.frequenciaFinal());

    }
}
