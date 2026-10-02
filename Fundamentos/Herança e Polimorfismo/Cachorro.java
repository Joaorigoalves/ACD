public class Cachorro extends Animal{
    public Cachorro(String nome,String raça,int idade){
        super(nome,raça,idade);
    }
    @Override

    public void comunicar(){
        System.out.println("AUAU");
    }

}
