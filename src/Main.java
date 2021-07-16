import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
        Compra compra = new Compra(0, 0);
        MaquininhaELO maquininhaELO = new MaquininhaELO();
        MaquininhaVISA maquininhaVISA= new MaquininhaVISA();
        maquininhaELO.setValorDaCompra(2000);
        maquininhaELO.ProcessaPagamento(compra);
        maquininhaVISA.setValorDaCompra(1500);
        maquininhaVISA.ProcessaPagamento(compra);

    }

}
