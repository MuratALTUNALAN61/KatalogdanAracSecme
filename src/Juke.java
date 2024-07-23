public class Juke extends Nissan{
    public int yil;
    public Juke(String tur, String marka, String model, int yil){
        super(tur, marka, model);
        this.yil=yil;
    }
    public int getYil(){
        return yil;
    }

    public void ozeliikler(){
        System.out.println("Türü: "+tur+" Markası: "+marka+" Modeli: "+model+"Yılı: "+yil);
    }
}
