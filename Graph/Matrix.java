
public class Matrix{
    private Knoten[] knoten;
    private int[][] matrix;
    private boolean[] besucht;
    private int anzahlKnoten;
    
    public Matrix(int anzahl){
        knoten = new Knoten[anzahl];
        matrix = new int[anzahl][anzahl];
        besucht = new boolean[anzahl];
        anzahlKnoten = 0;
        for(int i = 0; i < anzahl; i++){
            for (int j = 0; j < anzahl; j++){
                matrix[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    public int knotenNummer(String name){
        for(int i = 0; i < anzahlKnoten; i++){
            if(knoten[i].nameGeben() == name){
                return i;
            }
        }
        return -1;
    }
    public void knotenEinfuegen(String name){
        if(anzahlKnoten < knoten.length){
            if(knotenNummer(name) == -1) {
                knoten[anzahlKnoten] = new Knoten(name);
                anzahlKnoten++;
            }
        }
    }
    public int knotenAnzahlGeben(){
        return anzahlKnoten;
    }
    public void kanteEinfuegen(String von, String nach, int gewicht){
        int vonNum = knotenNummer(von);
        int nachNum = knotenNummer(nach);
        if(vonNum != -1 && nachNum != -1){
            matrix[vonNum][nachNum] = gewicht;
        }
    }
    public int kantenGewichtGeben(String von, String nach){
        int vonNum = knotenNummer(von);
        int nachNum = knotenNummer(nach);
        if(vonNum != -1 && nachNum != -1){
            return matrix[vonNum][nachNum];
        }
        return -1;
    }
    public void tiefensuche (String startknoten){
        int startNum = knotenNummer(startknoten);
        if(startNum > -1){
            for(int i = 0; i < anzahlKnoten; i++){
                besucht[i] = false;
            }
            besuchen(startNum);
        }
    }
    public void besuchen(int aktuellerKnoten){
        besucht[aktuellerKnoten] = true; // als besucht markieren
        System.out.println(knoten[aktuellerKnoten].nameGeben()); //drucken
        
        for(int i = 0; i < anzahlKnoten; i++){
            //für jeden Knoten aus der Liste, überprüfen wir
            //ob er eine Kante mit aktuellen Knoten hat
            if(matrix[aktuellerKnoten][i] > Integer.MIN_VALUE && besucht[i] == false)
            // ist es der Fall und ist der Knoten unbesucht => rekursion
            {
                besuchen(i);
            }
        }
        
        System.out.println(knoten[aktuellerKnoten].nameGeben() + "abgeschlossen");
    }
}

























