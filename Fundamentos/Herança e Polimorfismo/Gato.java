public class Gato extends Animal{

    public Gato(String nome,String raça,int idade){
        super(nome,raça,idade);

    }


    @Override

    public void comunicar(){
        System.out.println("MiauMiau");
    }

}