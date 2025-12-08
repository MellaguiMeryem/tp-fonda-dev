
public class Employee {
    private int id;
    private String nom, position;

    /**
    * Représente un employé dans une entreprise.
    *@param le nom de l employe(non vide)
    *@param id l 'identifiant unique de l epmloye(positif)
    *@param position le poste de l'employe
    *@throws si le nom est vide ou l identifiant non valide
    */
    public Employee(int id, String nom, String position){
        if(nom == null || nom.isEmpty()){
           throw new IllegalArgumentException("le nom ne peut pas etre vide");
        }
        if(id <= 0){
            throw new IllegalArgumentException("l'identifient doit etre positif");
        }
        this.id=id;
        this.nom = nom;
        this.position = position;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    @Override
    public String toString(){
        return "the id is "+ id +"and the name "+ nom +"and position is"+position+".";
    }

}