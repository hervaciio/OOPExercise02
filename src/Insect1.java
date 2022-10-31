
public class Insect1 extends Insects {
    
    public String kingdom;
    
    public Insect1(String name, String size, String kingdom){
        super(name, size);
        this.kingdom = kingdom;
    }
    
    @Override
    public String MakeSound(){
        return "Bzzzz";
    }
    
    public String getKingdom(){
        return kingdom;
    }
    
    public void setKingdom(String kingdom){
        this.kingdom = kingdom;
    }
            
            
            
    
}
