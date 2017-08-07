package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.CarrinhoBO;

@ManagedBean
@SessionScoped
public class CarrinhoBean {
	private double total, bitcoin;
	
	@EJB
	private CarrinhoBO bo;
	
	public void adicionar(){
		total = bo.adicionarBitcoin(bitcoin);
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getBitcoin() {
		return bitcoin;
	}

	public void setBitcoin(double bitcoin) {
		this.bitcoin = bitcoin;
	}
}
