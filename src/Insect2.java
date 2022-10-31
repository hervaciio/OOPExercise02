
public class Insect2 extends Insects {
    
    private String type;
    
    public Insect2 (String name, String size, String type){
        super(name, size);
        this.type = type;
    }
    
    @Override
    public String MakeSound(){
        return "chirp chirp";
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
}
