import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
        Compra compra = new Compra(0);
        MaquininhaELO maquininhaELO = new MaquininhaELO(compra);
        compra.ProcessaPagamento(2000,312);
    }

}
