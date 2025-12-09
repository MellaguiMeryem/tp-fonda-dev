import java.util.ArrayList;
import java.util.List;
/**
* Représente un département dans une entreprise.
*/

public class Department{
    private String nom;
    private List<Employee> employees;

    public Department(String nom){
        if(nom == null || nom.isEmpty()){
            throw new IllegalArgumentException("le nom ne peut pas etre vide");
        }

        this.nom = nom;
        this.employees = new ArrayList<>();
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public List<Employee> getEmployees(){
        return new ArrayList<>(employees);
    }

    public void addEmployee(Employee employee){
        if(employee == null){
            throw new IllegalArgumentException("l employe ne peut pas etre null");
        }
        employees.add(employee);
    }

    public void removeEmployee(Employee employe){
        employees.remove(employe);
    }

    public List<Employee> listEmployees(){
        return new ArrayList<>(employees);
    }
    public String toString(){
        return "le nom de departement est : "+ nom +"et la liste des employe est : "+ employees.size()+".";
    }
}
