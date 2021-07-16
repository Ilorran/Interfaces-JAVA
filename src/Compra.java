import java.util.Date;

public class Compra implements ProcessaPago{

    private double valorDaCompra;
    private int IDcompra;

    public Compra(int IDcompra){
        this.valorDaCompra = valorDaCompra;
        this.IDcompra = 312;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public double getIDcompra() {
        return IDcompra;
    }

    public void setIDcompra(int IDcompra) {
        this.IDcompra = IDcompra;
    }


    @Override
    public boolean ProcessaPagamento(double valorDaCompra, int IDcompra) {
        this.valorDaCompra = valorDaCompra;
        if(valorDaCompra >= 0 && IDcompra == this.IDcompra) {
            System.out.println("Compra processada com sucesso!");
            System.out.println("Valor da compra: " + String.format("%.2f", getValorDaCompra()));
            System.out.println("ID da transação: " + String.format("%.0f", getIDcompra()));
            return true;
        }
        else{
            System.out.println("Compra não processada.");
        return false;}
        }
}
