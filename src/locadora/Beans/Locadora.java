package locadora.Beans;

import locadora.Beans.Filme;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "locadora")
@ApplicationScoped
public class Locadora {

	ArrayList<Filme> listaCesta = new ArrayList<Filme>();
	Filme filme = new Filme();

	public Locadora() {

		Date data1 = new GregorianCalendar(2018, Calendar.APRIL, 26).getTime();
		Filme f1 = new Filme("The Avengers: Infinity War", data1, 4, "Filme A", 5,2);

		Date data2 = new GregorianCalendar(2014, Calendar.JULY, 31).getTime();
		Filme f2 = new Filme("guardians of the galaxy", data2, 2, "Filme B", 10,2);

		Date data3 = new GregorianCalendar(2014, Calendar.JULY, 31).getTime();
		Filme f3 = new Filme("Thor: Ragnarok", data3, 4, "Filme C", 15,2);

		listaCesta.add(f1);
		listaCesta.add(f2);
		listaCesta.add(f3);

	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public ArrayList<Filme> getListaCesta() {
		return listaCesta;
	}

	public void setListaCesta(ArrayList<Filme> listaCesta) {
		this.listaCesta = listaCesta;
	}

	public void Cadastrar() {
		this.listaCesta.add(filme);
		filme = new Filme();
	}



}
