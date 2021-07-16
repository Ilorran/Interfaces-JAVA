import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Compra compra = new Compra(0, 0);
        MaquininhaELO maquininhaELO = new MaquininhaELO();
        MaquininhaVISA maquininhaVISA= new MaquininhaVISA();
        System.out.print("Digite o valor para a máquina ELO: ");
        double valorDaCompra = teclado.nextDouble();
        maquininhaELO.ProcessaPagamento(compra, valorDaCompra);
        System.out.print("Digite o valor para a máquina VISA: ");
        double ValorDaCompra = teclado.nextDouble();
        maquininhaVISA.ProcessaPagamento(compra, ValorDaCompra);
    }

}
