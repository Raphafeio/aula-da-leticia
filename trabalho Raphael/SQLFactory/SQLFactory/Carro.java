public class Carro extends SQLClass{
    Carro(){
        this.setTableName("carros");
    };

    String modelo;
    String marca;
    int ano;
    double valor;
    
}
