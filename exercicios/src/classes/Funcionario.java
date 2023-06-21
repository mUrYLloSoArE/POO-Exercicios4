package classes;

import java.util.Calendar;

public class Funcionario {
   Calendar c = Calendar.getInstance();
   private static int id;
   private int diaAtual = c.get(Calendar.DAY_OF_MONTH);
   private int mesAtual = c.get(Calendar.MONTH);
   private int anoAtual = c.get(Calendar.YEAR);

   private int dia,mes,ano;

   private String nome;
   private double salario;

   public Funcionario( int dia, int mes, int ano,String nome,double salario) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
      this.nome=nome;
      this.salario=salario;
   }


   public static int getId() {
      return id;
   }

   public static void setId(int id) {
      Funcionario.id = id;
   }

   public int getDia() {
      return dia;
   }
   public int getMes() {
      return mes;
   }
   public int getAno() {
      return ano;
   }

   public String getNome() {
      return nome;
   }



   public double getSalario() {
      return salario;
   }

   public  void dataAdm(){
      if (getDia()>diaAtual && getMes()>mesAtual && getAno()>anoAtual) {
         System.out.println("Data de admissão inválida! ");
      }else {
         System.out.println("Data de admissão -> " + getDia() + "/" + getMes()+"/"+getAno());
      }

      }

   }

