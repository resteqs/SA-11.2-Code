public class Abschluss extends Baumelement{
    public Abschluss(){
    
    }
    public Baumelement einfuegen (Datenelement datenNeu){
        return new Knoten(datenNeu);
    }
}