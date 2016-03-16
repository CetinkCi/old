
public class Kampfdackel extends Dackel{
    public String fellFarbe= "grau";

    
    public Kampfdackel(String name, String gebDatum){
        this.name=name;
        this.gebDatum=gebDatum;
        //super(name,gebDatum);
        this.bellen();
        //lieb bellen
        super.bellen();
      
    }
    public void bellen(){
        System.out.println(name+"RA WUFFF");
    }
    public void boeseBellen(){
        System.out.println(name+"Graaa Wuff");
    }
    

    
    public String vaterFarbe(){
        return (super.fellFarbe);
    }
    

}
