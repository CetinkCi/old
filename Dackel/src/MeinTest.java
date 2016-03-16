public class MeinTest {

    public static void main(String[] args) {
        Dackel meinHund = new Dackel("Waldi", "12.12.03");
        Dackel deinHund = new Dackel("Fiffi", "07-NOV-02");

        deinHund.fellFarbe = "gelb";
        meinHund.setGebDatum("12 DEZ 2013");
        System.out.println(meinHund.getGebDatum());
        System.out.println(Dackel.getAnzahl());
        

    }
}
