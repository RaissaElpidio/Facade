import java.util.ArrayList;

public class Combo {

    ArrayList<Produto> produtos = new ArrayList<>();

    public void CriarCombo(int tipo){

        if(tipo == 2) {
            produtos.add(new Sobremesa("Mousse", 8, "Medio"));
        }

        produtos.add(new Burguer("X-TUDO", 20, 150));
        produtos.add(new Bebida("Guarana", 7, 500));
    }

    @Override
    public String toString() {
        String combo = "";

        for (Produto produto: produtos) {
            combo += produto.toString() + "\n";
        }

        return combo;
    }
}