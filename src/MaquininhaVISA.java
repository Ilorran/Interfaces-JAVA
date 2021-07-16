public class MaquininhaVISA extends Compra implements ProcessaPago{

    public MaquininhaVISA(ProcessaPago processaPago) {
        super();
        this.processaPago = processaPago;
    }

    @Override
    public boolean ProcessaPagamento(Compra compra, double ValordaCompra) {
        super.setIDcompra(312);
        super.setTaxa(0.45);
        if(compra.getValorDaCompra() >= 0 && compra.getIDcompra() == this.getIDcompra()) {
            System.out.println("Compra processada com sucesso!(VISA)");
            System.out.println("Valor da compra: " + String.format("%.2f", ValordaCompra));
            System.out.println("ID da transação: " + String.format("%.0f", getIDcompra()));
            System.out.println("Taxa: " + getTaxa());
            return true;
        }
        else{
            System.out.println("Compra não processada.");
            return false;}
    }
}
