public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.00;
        double valorSolicitado = 26.00;

        if (valorSolicitado < saldo){
            saldo -= valorSolicitado;

            System.out.println(saldo);
        }else{
            System.out.println("Nao foi possivel realizar o saque.");
        }
    }
    
}
