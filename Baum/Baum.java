public class Baum{
    private Baumelement wurzel;
    public Baum(){
        wurzel = new Abschluss();
    }
    public void einfuegen(Datenelement datenNeu){
        wurzel = wurzel.einfuegen(datenNeu);
    }
}
