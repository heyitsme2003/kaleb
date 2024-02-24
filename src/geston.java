import java.util.ArrayList ;
import java.util.List ;

public class geston {
     private List <Employed>listeemploye ;

     public geston(){
         this.listeemploye = new ArrayList<>() ;
     }
     // ajouter effacer afficher employee
     public void ajoutemploye(Employed employe)   {listeemploye.add(employe);}
     public void effeceemploye(int index){

         listeemploye.remove(index);
     }

     public  void displayemploye(){
         for(Employed employe : listeemploye){
              System.out.println("employe: "+employe.getName()+" salaire: "+employe.getSalary()+" a commencé le: "+employe.getDateEmbauche()) ;
         }
     }
}
