/**
 * @author : chloelam
 * @Description :
 * @created : 2024-04-15, Monday
 **/
public class eleve
{
    int numeleve;
    String nom;
    String prenom;
    String age;

    // Constructeur
    public eleve(int numeleve, String nom, String prenom, String age)
    {
        this.numeleve = numeleve;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public eleve(int numeleve)
    {
        this.numeleve = numeleve;
    }

    // Getters and Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
