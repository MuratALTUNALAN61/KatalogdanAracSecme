public class Nissan extends Suv{
    public String model;
    public Nissan(String tur, String marka, String model){
        super(tur, marka);
        this.model=model;
    }
    public String getModel(){
        return model;
    }
}
