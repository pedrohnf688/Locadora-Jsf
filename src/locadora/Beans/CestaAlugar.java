package locadora.Beans;

import locadora.Beans.Filme;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "cestaAlugar")
@SessionScoped
public class CestaAlugar {

	ArrayList<Filme> listaFilme = new ArrayList<Filme>();
	Filme filme = new Filme();
	private float compraTotal;

	public CestaAlugar() {

	}

	public ArrayList<Filme> getListaFilme() {
		return listaFilme;
	}

	public void setListaFilme(ArrayList<Filme> listaFilme) {
		this.listaFilme = listaFilme;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public float getCompraTotal() {
		return compraTotal;
	}

	public void setCompraTotal(float compraTotal) {
		this.compraTotal = compraTotal;
	}

	public Filme getFilme(int id) {
		Filme f = null;
		for (Filme filme1 : listaFilme) {
			if (filme1.getId() == id) {
				return filme1;
			}
		}
		return f;
	}

	public void AdicionarCesta(Filme f) {
		if (getFilme(f.getId()) != null) {
			f.DecrementaQuant();
			f.setCesta(f.getCesta() + 1);
		} else {
			if (f.getQuantidade() > 0) {
				listaFilme.add(f);
				f.DecrementaQuant();
				f.setCesta(1);
			}
		}
	}

	public void RemoverCesta(int id) {
		Filme f = getFilme(id);
		if (f.getCesta() > 1) {
			f.IncrementaQuant();
			f.setCesta(f.getCesta() - 1);
		} else {
			listaFilme.remove(f);
			f.IncrementaQuant();
		}

	}

	public void LimparCesta() {
		for (int i = 0; i < listaFilme.size(); i++) {
			listaFilme.get(i).setQuantidade(listaFilme.get(i).getCesta() + listaFilme.get(i).getQuantidade());
			listaFilme.get(i).setCesta(0);
		}
		listaFilme = new ArrayList<Filme>();
		compraTotal = 0;

	}

	public float FinalizarCompra() {
		for (int i = 0; i < listaFilme.size(); i++) {
			compraTotal += (listaFilme.get(i).getValor() * listaFilme.get(i).getCesta());
			filme.setCesta(0);
		}
         
		System.out.println(compraTotal);
		return compraTotal;
	}

}
