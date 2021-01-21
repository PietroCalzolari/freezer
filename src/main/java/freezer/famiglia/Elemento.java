package freezer.famiglia;

import java.util.Date;
import java.util.UUID;

public class Elemento {

    private String nome;
    private String genere;
    private String datacongelamento;
    private UUID idelemento;

    public Elemento(UUID idelemento, String nome, String genere, String datacongelamento) {
        this.nome = nome;
        this.genere = genere;
        this.datacongelamento = datacongelamento;
        this.idelemento = idelemento;
        //Aggiungere il controllo che se il numero è uguale a quello di un altro elemento allora aumenti di 1 il numero
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getDatacongelamento() {
        return datacongelamento;
    }

    public void setDatacongelamento(String datacongelamento) {
        this.datacongelamento = datacongelamento;
    }

    public UUID getIdElemento(){
        return idelemento;
    }

    public void setIdelemento(UUID idelemento){
        this.idelemento= idelemento;
    }
    @Override
    public String toString() {
        return "Elemento{" +
                "nome='" + nome + '\'' +
                ", genere='" + genere + '\'' +
                ", datacongelamento=" + datacongelamento +
                '}';
    }
}
