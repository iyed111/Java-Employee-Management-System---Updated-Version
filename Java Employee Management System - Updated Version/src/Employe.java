public abstract class Employe {
    private int matricule ;
    private String nom ;
    private String prenom ;
    private int age ;

    Employe (int matricule , String nom , String prenom , int age){
        this.matricule=matricule ;
        this.nom=nom ;
        this.prenom=prenom;
        this.age=age;
    }

    public void setMatricule(int matricule){
        this.matricule=matricule;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public void setAge(int age){
        this.age=age;
    }


    public int getMatricule(){
        return matricule;
    }
    public String getNom(){
        return nom ;
    }
    public String getPrenom(){
        return prenom ;
    }
    public int getAge(){
        return age ;
    }

    public abstract double getSalaire();

    public String toString(){
        return "matricule : "+ matricule + "| Nom : "+ nom + "| prenom : "+ prenom + "| age : "+ age ;
    }









}
