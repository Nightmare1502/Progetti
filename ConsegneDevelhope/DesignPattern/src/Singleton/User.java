package Singleton;

public class User {

    private String nome;
    private Integer eta;
    private static User instance;

    private User(){
        nome = "Marco";
        eta = 18;
    }

    public static User getInstance(){
        if(instance == null){
            instance = new User();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampaInfo() {
        System.out.println("Nome User = " + nome);
        System.out.println("Età User = " + eta);
    }

}
