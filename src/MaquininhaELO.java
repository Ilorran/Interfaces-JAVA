public class MaquininhaELO extends Compra  implements ProcessaPago {

    private ProcessaPago processaPago;

    public MaquininhaELO(ProcessaPago processaPago) {
        super();
        this.processaPago = processaPago;
    }

    public MaquininhaELO() {

    }

    @Override
    public boolean ProcessaPagamento(Compra compra, double ValordaCompra) {
        super.setIDcompra(312);
        super.setTaxa(0.15);
        if(compra.getValorDaCompra() >= 0 && compra.getIDcompra() == compra.getIDcompra()) {
            System.out.println("Compra processada com sucesso!(ELO)");
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
