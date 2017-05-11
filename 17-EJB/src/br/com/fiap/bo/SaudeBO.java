package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface SaudeBO {

	double calcularIMC(float peso, float altura);

}
