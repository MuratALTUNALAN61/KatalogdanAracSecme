public class Supersport extends Otomobil{
    public String marka;
    public Supersport(String tur, String marka){
        super(tur);
        this.marka=marka;
    }
    public String getMarka(){
        return marka;
    }
}
