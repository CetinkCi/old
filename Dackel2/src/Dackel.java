public class Dackel {

    public String name,gebDatum,fellFarbe = "braun";
    public static int anzahl=0;

    
    public Dackel(){
        System.out.println("wuff Konstr.");
        anzahl++;
        
    }
    
    public Dackel(String name, String gebDatum) {
        this.name = name;
        this.gebDatum = gebDatum;
        anzahl++;
        this.bellen();

    }

    public Dackel(String name, String gebDatum, String fellFarbe) {
        this(name, gebDatum);
        this.fellFarbe = fellFarbe;

    }

    public void beissen() {
        System.out.println(name + " *knibber*");
    }
    
    public void bellen(){
        System.out.println(name+" wuff");
    }
      

    public void beissen(int n) {
        System.out.print(name + ":");
        for (int i = 0; i < n; i++) {
            System.out.println(" "
                    + "*knibber*");
        }
    }

}
