public class Conta{
    private int numero_conta;
    private String titular;
    private float saldo=0;

    public Conta(int numero_conta,String titular){
        this.numero_conta=numero_conta;
        this.titular=titular;
        this.saldo=0;
    }
    public int getNumero_conta(){return numero_conta;}
    public String getTitular(){return titular;}
    public float getSaldo(){return saldo;}
    public void setNumero_conta(int numero_conta){this.numero_conta=numero_conta;}
    public void setTitular(String titular){this.titular=titular;}
    public void setSaldo(float saldo){this.saldo=saldo;}

    public void depositar(int valor_deposito){
        saldo=saldo+valor_deposito;
    }
    public void sacar(int valor_saque){
        if( valor_saque>saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            saldo= saldo-valor_saque;
        }
    }
    @Override
    public void toString(){
        return "Titular:"+titular+
                "Saldo:R$"+saldo;
    }
}