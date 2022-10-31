
public abstract class Insects {
    protected String name;
    protected String size;
    
    public Insects (String name, String size){
        this.name = name;
        this.size = size;
    }
    
    public abstract String MakeSound();
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getSize(){
        return size;
    }
    
    public void setSize(String size){
        this.size = size;
    }
    
}
