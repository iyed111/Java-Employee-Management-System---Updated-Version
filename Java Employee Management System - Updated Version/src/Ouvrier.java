public class Ouvrier extends Employe{
    private int ancienneté;
    private static final double SMIG=400;

    Ouvrier (int matricule , String nom , String prenom , int age , int ancienneté){
        super(matricule, nom, prenom, age);
        this.ancienneté=ancienneté;
    }

    @Override
    public double getSalaire(){
        double salaire = SMIG+(ancienneté*100);
        return Math.min(salaire , SMIG*3);
    }

    @Override
    public String toString(){
        return super.toString() +"| ancienneté (nb années) :" + ancienneté + "| salaire (en TND) : "+ getSalaire();
    }


    public void setAncienneté(int ancienneté) {
        this.ancienneté = ancienneté;
    }
    public int getAncienneté() {
        return ancienneté;
    }
}
