public abstract class Baumelement{
    public abstract Baumelement einfuegen(Datenelement datenNeu);
    public abstract Datenelement suchen(String schluessel);
    public abstract void preorder();
    public abstract void inorder();
    public abstract void postorder();
}