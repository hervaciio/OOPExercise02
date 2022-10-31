
public class Main {

  
    public static void main(String[] args) {
        Insects insect;
        Insect1 bee = new Insect1 ("Bee", "16 cm", "Animalia");
        Insect2 cricket = new Insect2 ("Cricket", "21 cm", "House Cricket");
        
        insect = bee;
        System.out.println("Name of the 1st insect: " + insect.getName() + "\nSound: " + insect.MakeSound() + "\nSize: " + insect.getSize() + "\n");
        
        insect = cricket;
        System.out.println("Name of the 2nd insect: " + insect.getName() + "\nSound: " + insect.MakeSound() + "\nSize: " + insect.getSize() + "\n");
    }
    
}
