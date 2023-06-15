public class SQLFactory{
    public static void main(String[] args){
        Produto produto1 = new Produto();

        produto1.id = 1;
        produto1.descricao = "Pera";
        produto1.um = "KG";
        produto1.preco = 8.67;

        Boolean retorno = Database.inserirRegistro(produto1);
        System.out.println(retorno);
         





        //Estoque pilha = new Estoque();

        //pilha.id = 1;
        //pilha.filial_id = 2;
        //pilha.produto_id = 42;
        //pilha.quantidade = 1900;

        //System.out.println("-------SELECT-------");
        //System.out.println(pilha.selectSQL());
        //System.out.println("-------INSERT-------");
        //System.out.println(pilha.insertSQL());
        //System.out.println("-------UPDATE-------");
        //System.out.println(pilha.updateSQL());
        //System.out.println("-------DELETE-------");
        //System.out.println(pilha.deleteSQL());
    
    }
}