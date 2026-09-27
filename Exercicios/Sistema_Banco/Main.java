import java.util.Scanner;
import java.util.LinkedList;
public class Main{
    public static void main(String[] args){
        LinkedList<Conta> Banco_Contas= new LinkedList<>();
        Scanner scan= new Scanner(System.in);
        Random rand=new Random();
        int op=0;
        while(op!=6){
            System.out.println("------------------------------");
            System.out.println("1)Criar conta");
            System.out.println("2)Listar Contas");
            System.out.println("3)Depositar");
            System.out.println("4)Sacar");
            System.out.println("5)Consultar Saldo");
            System.out.println("6)Sair");
            System.out.println("-----------------------------");
            System.out.println("Digite uma Opçao:");
            op=scan.nextInt();
            scan.nextLine();

            switch(op){
                default:
                    System.out.println("Opçao invalida");
                    break;

                case 1:
                    System.out.println("Digite o nome do titular:");
                    String temptitular= scan.nextLine();
                    System.out.println("Digite o numero da conta:");
                    int tempid= scan.nextInt();
                    Conta pessoa= new Conta(tempid,temptitular);
                    Banco_Contas.add(pessoa);
                    break;

                case 2:
                    for (Conta conta : Banco_Contas){
                        System.out.println(conta.getTitular());
                        System.out.println(conta.getSaldo());
                        System.out.println(conta.getNumero_conta());

                    }
                    break;

                case 3:
                    System.out.println()
            }

    }
}