public class Objekt implements Datenelement {
    private String schluessel;
    public Objekt(String schluesselNeu){
        schluessel = schluesselNeu;
    }
    public boolean istKleinerAls(Datenelement datenNeu){
        return schluessel.compareTo(datenNeu.schluesselGeben()) < 0;
    }
    public boolean istGroesserAls(Datenelement datenNeu){
        return schluessel.compareTo(datenNeu.schluesselGeben()) > 0;
    }
    public boolean istGleich(Datenelement datenNeu){
        return schluessel.equals(datenNeu.schluesselGeben());
    }
    public boolean schluesselIstGleich(String keyNeu){
        return schluessel.equals(keyNeu);
    }
    public boolean schluesselIstGroesserAls(String keyNeu){
        return schluessel.compareTo(keyNeu) > 0;
    }
    public String schluesselGeben(){
        return schluessel;
    }
    public void informationAusgeben(){
        System.out.println(schluessel);
    }
}