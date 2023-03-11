public abstract class Planeta {
    public abstract String getNome();
    public abstract double getGravidadePlaneta();

    public double getPeso (double pesoPessoa){
        return pesoPessoa * getGravidadePlaneta() * 10;
    }
    }

