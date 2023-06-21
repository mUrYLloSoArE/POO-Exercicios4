import classes.Carro;
import classes.Fiat;
import classes.Hyundai;
import classes.Renault;

public class Ex1 {
    public static void main(String[] args) {

        Carro fiat = new Fiat();
        Carro hyundai = new Hyundai();
        Carro renault = new Renault();

        System.out.println();
        fiat.setAno(2022);fiat.setCor("Vermelho");fiat.setPortas(2);fiat.setMarca("Tesla");
        fiat.setVelocidade(0);
        fiat.infoCarro();
        fiat.acelerar();
        fiat.acelerar();
        fiat.frear();
        fiat.frear();

        System.out.println();
        hyundai.setAno(2020);hyundai.setCor("Azul");hyundai.setPortas(3);hyundai.setMarca("Toyota");
        hyundai.setVelocidade(3);
        hyundai.infoCarro();
        hyundai.acelerar();
        hyundai.acelerar();
        hyundai.frear();
        hyundai.frear();

        System.out.println();
        renault.setAno(2021);renault.setCor("Preto");renault.setPortas(4);renault.setMarca("Wolksvagem");
        renault.setVelocidade(5);
        renault.infoCarro();
        renault.acelerar();
        renault.acelerar();
        renault.frear();
        renault.frear();



        }
    }
