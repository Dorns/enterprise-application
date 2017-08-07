package br.com.fiap.bo.impl;

import javax.ejb.Stateless;

import br.com.fiap.bo.SaudeBO;

@Stateless
public class SaudeBOImpl implements SaudeBO{

	@Override
	public double calcularIMC(float peso, float altura) {
		return peso/(altura*altura);
	}
	
}
