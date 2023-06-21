package classes;

public class Livro {

   private String genero,aulor,nome,ISBN;

    public Livro(String ISBN, String nome, String genero, String aulor ) {
        this.genero = genero;
        this.aulor = aulor;
        this.nome = nome;
        this.ISBN = ISBN;
    }

    public Livro(String ISBN, String nome, String genero) {
        this.genero = genero;
        this.nome = nome;
        this.ISBN = ISBN;
    }

    public Livro(String ISBN,String nome ) {
        this.nome = nome;
        this.ISBN = ISBN;
    }
    public Livro( String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public String getAulor() {
        return aulor;
    }

    public String getNome() {
        return nome;
    }

    public String getISBN() {
        return ISBN;
    }



                public String  registraLivro(){

                    if (getNome()==null){
                        System.out.println("livro registrado com sucesso!");
                        return getISBN();
                    }

                    if (getGenero()==null){
                        System.out.println("livro registrado com sucesso!");
                        return getISBN() + " " + getNome();
                    }

                    if (getAulor()==null){
                        System.out.println("livro registrado com sucesso!");
                        return getISBN() + " " + getNome() + " " + getGenero() ;
                    }

                    System.out.println("livro registrado com sucesso!");
                    return getISBN() + " " + getNome() + " " + getGenero() + " " + getAulor();
        }
    }


