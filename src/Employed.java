import java.util.Scanner;

// classe employe tache 1##########################################
public class Employed {
    private String         name ;
    private double       salary ;
    private String DateEmbauche ;

    // tache 2---------------------------------------------------------------
    public Employed(String name, double salary, String DateEmbauche) {
        this.name = name ; this.salary = salary ; this.DateEmbauche = DateEmbauche ;
    }

    // tache3------modifier ---------------------------------------------------
    /* getter*/
    public String getName        ()         {return name ;}
    public double getSalary      ()       {return salary ;}
    public String getDateEmbauche() {return DateEmbauche ;}
    /*setter*/
    public void setName(String name)                                {this.name = name ; ;}
    public void setSalary(double salary)                          {this.salary = salary ;}
    public void setDateEmbauche(String DateEmbauche) { this.DateEmbauche = DateEmbauche ;}

    // PARTIE 2#####################################################

    public double calculsalary(int role, double experience,double bonus) {
        Scanner scan = new Scanner(System.in);
        while (1<2) {
            if (role > 3 | role < 1) {
                System.out.println("le role de l'employe est de quelle categorie (between 1 and 3): ");
                System.out.println("choisis un nombre entre 1 et 3");
                role = scan.nextInt();
            } else {
                System.out.print("son salaire: ");
                return salary + bonus + (double) role * salary * (experience / 100);
            }
        }
    }
}