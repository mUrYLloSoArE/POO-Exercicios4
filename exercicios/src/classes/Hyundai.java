package classes;

public class Hyundai extends Carro{


    @Override
    public void frear() {
        if (getVelocidade() < 0 || getVelocidade() == 0) {
            System.out.println("Sem Partida");
            return;
        }
        setVelocidade(getVelocidade()-6);
        System.out.println(" Freando ... " + "Velocidade atual " + getVelocidade() + " Km/h ");
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade()+12);
        System.out.println(" Acelerando ... " + " Velocidade atual" + getVelocidade() + "Km/h");
    }

    public  void  infoCarro(){
        System.out.println("Dados do Hyundai :");
        System.out.println("Ano -> " + getAno());
        System.out.println("Marca -> " + getMarca());
        System.out.println("Cor -> " + getCor());
        System.out.println("Nº de portas -> " + getPortas());
    }

}
