public class Cadre extends Employe{
    private int indice;

    Cadre(int matricule , String nom , String prenom , int age , int indice){
        super(matricule, nom, prenom, age);
        this.indice=indice;
    }

    @Override
    public double getSalaire(){
        switch (indice){
            case 1 : return 1500.0;
            case 2 : return 1700.0;
            case 3 : return 1900.0;
            case 4 : return 2200.0;
            default: return 0.0;
        }

    }

    @Override
    public String toString(){
        return super.toString()+ "| indice : "+ indice + "| salaire (en TND) :" + getSalaire();
    }


    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }
}
