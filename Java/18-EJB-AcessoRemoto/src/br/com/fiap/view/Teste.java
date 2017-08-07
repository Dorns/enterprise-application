package br.com.fiap.view;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import br.com.fiap.bo.CarrinhoBO;
import br.com.fiap.bo.SaudeBO;

public class Teste {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		p.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

		Context context = new InitialContext(p);
		
		SaudeBO saude = (SaudeBO) context.lookup("ejb:/17-EJB/SaudeBOImpl!br.com.fiap.bo.SaudeBO");

		CarrinhoBO bo = (CarrinhoBO) context.lookup("ejb:/17-EJB/CarrinhoBOImpl!br.com.fiap.bo.CarrinhoBO?stateful");
		
		System.out.println(bo.adicionarBitcoin(12));
		
		System.out.println(saude.calcularIMC(50, 1.5f));
	}

}
