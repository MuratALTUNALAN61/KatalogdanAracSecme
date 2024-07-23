public class Peugeot extends Suv{
    public String model;
    public Peugeot(String tur, String marka, String model){
        super(tur, marka);
        this.model=model;
    }
    public String getModel(){
        return model;
    }
}
