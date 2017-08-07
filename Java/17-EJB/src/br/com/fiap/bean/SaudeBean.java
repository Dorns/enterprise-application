package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.SaudeBO;

@ManagedBean
public class SaudeBean {

	private float peso; 
	private float altura;
	private double imc;
	
	@EJB
	private SaudeBO bo;
	
	public void calcular(){
		imc = bo.calcularIMC(peso, altura);
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
}
