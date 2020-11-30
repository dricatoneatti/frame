package gluecode;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import funcionalidades.FormulariosFuncionalidade;

public class FormulariosStep {
	private FormulariosFuncionalidade formFunc;

	public FormulariosStep() {
		this.formFunc = new FormulariosFuncionalidade();
	}

	@Dado("eu esteja redirecionado no formulario")
	public void euEstejaRedirecionadoNoFormulario() {
		formFunc.validarFormularioRedirecionado();
	}

	@Quando("eu preencher os formularios obrigatorios")
	public void euPreencherOsFormulariosObrigatorios() {
		formFunc.preencherDadosVeiculo();
		formFunc.preencherInsuranceData();
		formFunc.preencherProductData();
		formFunc.selecionarPriceOption();
		formFunc.enviarProposta();
	}

	@Então("a mensagem {string} é apresentada")
	public void aMensagemÉApresentada(String text) throws InterruptedException {
		formFunc.validoPopUpEnvioEmail(text);
	}

}
