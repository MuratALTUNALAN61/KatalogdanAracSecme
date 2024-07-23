public class Suv extends Otomobil{
    public String marka;
    public Suv(String tur, String marka){
        super(tur);
        this.marka=marka;
    }
    public String getMarka(){
        return marka;
    }
}
