public class Abschluss extends Baumelement{
    public Abschluss(){
    
    }
    public Baumelement einfuegen (Datenelement datenNeu){
        return new Knoten(datenNeu, this, this);
    }
    public Datenelement suchen (String schluessel){
        return null;
    }
    public void preorder(){
    
    }
    public void inorder(){
    
    }
    public void postorder(){
    
    }
}