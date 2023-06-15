public class Produto extends SQLClass{            
    @Key
    int id;

    String descricao;
    double preco;    
    String um;

    Produto(){
        this.setTableName("produtos");        
    }    
}
