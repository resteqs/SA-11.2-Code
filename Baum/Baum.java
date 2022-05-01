public class Baum{
    private Baumelement wurzel;
    public Baum(){
        wurzel = new Abschluss();
    }
    public void einfuegen(Datenelement datenNeu){
        wurzel = wurzel.einfuegen(datenNeu);
    }
    public Datenelement suchen (String schluessel){
        return wurzel.suchen(schluessel);
    }
    public void preorder(){
        wurzel.preorder();
    }
    public void inorder(){
        wurzel.inorder();
    }
    public void postorder(){
        wurzel.postorder();
    }
}
