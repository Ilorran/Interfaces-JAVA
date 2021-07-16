import java.util.Date;

public class Compra {

    private double valorDaCompra;
    private int IDcompra;
    private double taxa;

    public Compra(int IDcompra, double taxa){
        this.valorDaCompra = valorDaCompra;
        this.IDcompra = 312;
        this.taxa = 0.15;
    }

    public Compra() {
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

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

//    @Override
//    public boolean ProcessaPagamento(Compra compra) {
//        this.valorDaCompra = valorDaCompra;
//        if(valorDaCompra >= 0 && IDcompra == this.IDcompra) {
//            System.out.println("Compra processada com sucesso!");
//            System.out.println("Valor da compra: " + String.format("%.2f", getValorDaCompra()));
//            System.out.println("ID da transação: " + String.format("%.0f", getIDcompra()));
//            System.out.println("Taxa: " + this.getTaxa());
//            return true;
//        }
//        else{
//            System.out.println("Compra não processada.");
//        return false;}
//        }
}
