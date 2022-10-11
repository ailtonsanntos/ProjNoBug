package br.com.projNoBug.steps;

import br.com.projNoBug.core.Driver;
import br.com.projNoBug.enums.Browser;
import br.com.projNoBug.pages.CadastroPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class CadastroSteps {

    CadastroPage cadastroPage;

    @Before
    public void iniciaNavegador(){
        new Driver(Browser.CHROME);
    }

    @After
    public void fecharNavegador(){
        Driver.getDriver().quit();
    }

    @Dado("que a pagina de login esteja sendo exibida")
    public void que_a_pagina_de_login_esteja_sendo_exibida() {
        Driver.getDriver().get("https://bugbank.netlify.app/");
        cadastroPage = new CadastroPage();
    }
    @Dado("clico em registrar")
    public void clico_em_registrar() {

    }


    @Quando("os campos de cadastro forem preenchido da seguinte forma")
    public void os_campos_de_cadastro_forem_preenchido_da_seguinte_forma(Map<String, String> map) {

        String email = map.get("email");
        String nome = map.get("nome");
        String senha = map.get("senha");
        String confSenha = map.get("confSenha");


        cadastroPage.clickBtnRegistrar();
        cadastroPage.setInpEmail("email");
        cadastroPage.setInpName("nome");
        cadastroPage.setInpSenha("senha");
        cadastroPage.setConfSenha("confSenha");
        cadastroPage.clickBtnCriarSaldo();
        cadastroPage.clickBtnCadastrar();
    }
    @Quando("seleciono a opção {string}")
    public void seleciono_a_opção(String string) {

    }
    @Entao("realizo o cadastro")
    public void realizo_o_cadastro() {

    }

}
