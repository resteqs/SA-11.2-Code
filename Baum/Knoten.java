public class Knoten extends Baumelement{
    private Baumelement nachfolgerLinks;
    private Baumelement nachfolgerRechts;
    private Datenelement delement;
    public Knoten(Datenelement datenNeu){
        delement = datenNeu;
    }
    public Knoten(Datenelement datenNeu, Baumelement linksNeu, Baumelement rechtsNeu){
        delement = datenNeu;
        nachfolgerLinks = linksNeu;
        nachfolgerRechts = rechtsNeu;
    }
    public Baumelement einfuegen(Datenelement datenNeu){
    if(delement.istGleich(datenNeu)){
        System.out.println("Bereits vorhanden");
    }else if(delement.istKleinerAls(delement)){
        nachfolgerRechts = nachfolgerRechts.einfuegen(datenNeu);
    }else{
        nachfolgerLinks= nachfolgerLinks.einfuegen(datenNeu);
    }
    return this;
    }
    public Datenelement suchen(String schluessel){
        if(delement.schluesselIstGleich(schluessel)){
            return delement;
        }else if(delement.schluesselIstGroesserAls(schluessel)){
            return nachfolgerLinks.suchen(schluessel);
        }else{
            return nachfolgerRechts.suchen(schluessel);
        }
    }
    public void preorder(){
        delement.informationAusgeben();
        nachfolgerLinks.preorder();
        nachfolgerRechts.preorder();
    }
    public void inorder(){
        nachfolgerLinks.inorder();
        delement.informationAusgeben();
        nachfolgerRechts.inorder();
    }
    public void postorder(){
        nachfolgerLinks.postorder();
        nachfolgerRechts.postorder();
        delement.informationAusgeben();
    }
}