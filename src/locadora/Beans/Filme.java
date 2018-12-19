package locadora.Beans;

import java.util.Date;

public class Filme {

    private int id;
    private String titulo;
    private Date dataLancamento;
    private int nota;
    private String descricao;
    private int quantidade;
    private int cesta;
    private static int cont = 0;
    private float valor;
 

    public Filme(String titulo, Date dataLancamento, int nota, String descricao, int quantidade, float valor) {
        this.id = cont++;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.nota = nota;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.cesta = 0;
        this.valor = valor;
    }

    public Filme() {
        this.id = cont++;
        this.cesta = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCesta() {
        return cesta;
    }

    public void setCesta(int cesta) {
        this.cesta = cesta;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Filme.cont = cont;
    }
    
    public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void IncrementaQuant() {
        this.quantidade++;
    }

    public void DecrementaQuant() {
        this.quantidade--;
    }

    public void IncrementaCesta() {
        this.cesta++;
    }

    public void DecrementaCesta() {
        this.cesta--;
    }

}
