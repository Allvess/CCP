package CadastroPet;

public class App {
    public static void main(String[] args) {
        //Objeto criado  em outra class
        Criador pessoa1  = new Criador(

                "Patrick",
                "Alves",
                "04852-506",
                "51B",
                23,
                "patrickalves930@gmail.coom",
                "953770820"
        );

        //Objeto criado  em outra class
        Pet mascote  = new Pet("Pretinha",
                "Cachorro",
                "Husk",
                2,
                "Branca",
                pessoa1,
                "Banho e tosa"
        );
        // puxa dados.
        pessoa1.retornaDados();
        // puxa todos os dados.
        System.out.println(pessoa1.retornarTodosDados());

    }
}
