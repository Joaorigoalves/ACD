import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op = 0;
        Scanner scan = new Scanner(System.in);
        while (op != 3) {
            System.out.println("-----------------------------");
            System.out.println("1)Criar Gato");
            System.out.println("2)Criar Gato");
            System.out.println("3)Sair");
            System.out.println("-------------------------");
            System.out.println("Digite uma opçao:");
            op = scan.nextInt();
            scan.nextLine();
            switch (op) {
                default:
                    System.out.println("Opçao invalida:");
                    break;

                case 1:
                    String stemp, rtemp;
                    int itemp;
                    System.out.println("Digite o nome do gato:");
                    stemp = scan.nextLine();
                    System.out.println("Digite a raça do gato");
                    rtemp = scan.nextLine();
                    System.out.println("Digite a idade do gato:");
                    itemp = scan.nextInt();

                    Gato g1 = new Gato(stemp,rtemp,itemp);
                    g1.comunicar();
                    break;

                case 2:
                    String cstemp, crtemp;
                    int citemp;
                    System.out.println("Digite o nome do Cachorro:");
                    cstemp = scan.nextLine();
                    System.out.println("Digite a raça do cachorro");
                    crtemp = scan.nextLine();
                    System.out.println("Digite a idade do Cachorro:");
                    citemp = scan.nextInt();

                    Cachorro c1 = new Cachorro(cstemp,crtemp,citemp);
                    c1.comunicar();
                    break;


            }


        }
        scan.close();
    }

}