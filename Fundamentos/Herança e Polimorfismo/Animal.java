public abstract class Animal{
    private int idade;
    private String nome,raça;

    public Animal(String nome,String raça,int idade){
        this.nome=nome;
        this.idade=idade;
        this.raça=raça;
    }
    public String getNome(){return nome;}
    public int getIdade(){return idade;}
    public String getRaça(){return raça;}
    public void setNome(String nome){this.nome=nome;}
    public void setIdade(int idade){this.idade=idade;}
    public void setRaça(String raça){ this.raça=raça;}

    public abstract void comunicar();

}