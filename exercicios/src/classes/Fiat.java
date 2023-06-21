package classes;

public class Fiat extends Carro {


    public void infoCarro() {
        System.out.println("Dados do Fiat :");
        System.out.println("Ano -> " + getAno());
        System.out.println("Marca -> " + getMarca());
        System.out.println("Cor -> " + getCor());
        System.out.println("Nº de portas -> " + getPortas());
    }


    @Override
    public void frear() {
        if (getVelocidade() < 0 || getVelocidade() == 0) {
            System.out.println("Sem Partida");
            return;
        }
        setVelocidade(getVelocidade()-2);
        System.out.println(" Freando ... " + "Velocidade atual " + getVelocidade() + " Km/h ");
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade()+15);
        System.out.println(" Acelerando ... " + " Velocidade atual" + getVelocidade() + "Km/h");
    }

}
