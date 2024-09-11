
public class Sessao {
    private String nome;
    private String horario;
    private Assento assento;
    private static double preco = 50.00;

    public Sessao(String nome, String horario, Assento assento){
        this.nome = nome;
        this.horario = horario;
        this.assento = assento;
    }
    public String getNome(){
        return nome;
    }

    public String getHorario(){
        return horario;
    }

    public boolean vender(int fila, int lugar){
        return assento.venderAssento(fila, lugar);
    }

    public String mostraLugares(){
        return assento.mostraLugares();
    }

    public static double getPreco(){
        return preco;
    }
}
