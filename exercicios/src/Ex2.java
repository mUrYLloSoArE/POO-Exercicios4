import classes.Livro;

public class Ex2 {
    public static void main(String[] args) {

                        Livro livro1= new Livro("3456663353");
                        System.out.println(livro1.registraLivro());

                        Livro livro2= new Livro("0766585858","As maravilhas");
                        System.out.println(livro2.registraLivro());

                        Livro livro3= new Livro("3553535353","Mochileiro das Galáxias",
                "Fantasia");
                        System.out.println(livro3.registraLivro());

                        Livro livro4= new Livro("757858585","A menina que roubava livros",
                "drama,guerra","Rosalyn Purge");
                        System.out.println(livro4.registraLivro());



    }
    }
