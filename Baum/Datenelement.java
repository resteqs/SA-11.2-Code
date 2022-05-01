public interface Datenelement{
    boolean istGleich(Datenelement datenNeu);
    boolean istKleinerAls(Datenelement datenNeu);
    boolean istGroesserAls(Datenelement datenNeu);
    boolean schluesselIstGleich(String keyNeu);
    boolean schluesselIstGroesserAls(String keyNeu);
    String schluesselGeben();
    void informationAusgeben();
}