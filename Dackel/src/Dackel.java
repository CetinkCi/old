public class Dackel {

    public String name,fellFarbe = "braun";
    private static int anzahl=0;
    private String gebDatum;

    public Dackel(String name, String gebDatum) {
        this.name = name;
        this.gebDatum = gebDatum;
        anzahl++;

    }

    public Dackel(String name, String gebDatum, String fellFarbe) {
        this(name, gebDatum);
        this.fellFarbe = "grau";

    }

    public void beissen() {
        System.out.println(this.name + "knibber");
    }
    
    public String getGebDatum(){
      return gebDatum;
    }
    
    public static int getAnzahl(){
        return anzahl;
    }
    
    public void setGebDatum(String gebDatum){
        this.gebDatum=gebDatum;
    } 

    public void beissen(int n) {
        System.out.print(this.name + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("knibber");
        }
    }

}
