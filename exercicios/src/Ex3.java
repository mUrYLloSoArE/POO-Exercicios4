import classes.Endereco;
import classes.Funcionario;
import classes.Pessoa;

import java.util.Calendar;


public class Ex3 {
    public static void main(String[] args){

        Funcionario muryllo = new Funcionario(20,6,2023,"Muryllo",2000);
        Funcionario michell = new Funcionario(18,4,2000,"Michell ",5000);
        Funcionario mattheus = new Funcionario(22,7,2024,"Mattheus ",7000);



         Funcionario.setId(1);

         System.out.println();
         System.out.println("Dados do funcionário " +Funcionario.getId() + " : ");
         System.out.println("Nome -> " + muryllo.getNome());
         System.out.println("Salário -> " + muryllo.getSalario());
         muryllo.dataAdm();

        Funcionario.setId(2);
        System.out.println();
        System.out.println("Dados do funcionário " +Funcionario.getId() + " : ");
        System.out.println("Nome -> " + mattheus.getNome());
        System.out.println("Salário -> " + mattheus.getSalario());
        mattheus.dataAdm();


         Funcionario.setId(3);
         System.out.println();
         System.out.println("Dados do funcionário " +Funcionario.getId() + " : ");
         System.out.println("Nome -> " + michell.getNome());
         System.out.println("Salário -> " + michell.getSalario());
         michell.dataAdm();


    }
}
