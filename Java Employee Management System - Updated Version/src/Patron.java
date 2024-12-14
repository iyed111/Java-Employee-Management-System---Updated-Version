public class Patron extends Employe {
    private double chiffreAffaire ;
    private double pourcentage ;

    Patron(int matricule , String nom , String prenom , int age , double chiffreAffaire , double pourcentage){
        super(matricule,nom,prenom,age);
        this.chiffreAffaire=chiffreAffaire;
        this.pourcentage=pourcentage;
    }

    @Override
    public double getSalaire(){
        return (chiffreAffaire*pourcentage)/100;
    }

    @Override
    public String toString(){
        return super.toString() + "| chiffre d'affaire (en TND) : "+ chiffreAffaire + "| pourcentage (%) : "+ pourcentage + "| salaire (en TND) : "+ getSalaire();
    }


}
