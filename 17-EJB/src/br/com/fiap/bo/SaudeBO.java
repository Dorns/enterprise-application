package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface SaudeBO {

	double calcularIMC(float peso, float altura);

}
