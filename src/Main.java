public class Main {
    public static void main(String[] args) {
        geston organisation = new geston();

        // Adding employees to the organization
        for (int i = 1; i <= 3; i++) {
            String nom = "nom" + i;
            double salaire = 4000 * i;
            String Date_embauche = "24-05-1954";
            Employed employe = new Employed(nom, salaire, Date_embauche);
            organisation.ajoutemploye(employe);
        }

        // Displaying employees before removal
        organisation.displayemploye();

        // Assuming you want to remove an employee (for example, the first one)
        organisation.effeceemploye(0);
        System.out.print("\n element 0 supprime\n") ;
        // Displaying employees after removal
        organisation.displayemploye();
    }
}
