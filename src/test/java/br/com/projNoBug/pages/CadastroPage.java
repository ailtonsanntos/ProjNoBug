package br.com.projNoBug.pages;

import br.com.projNoBug.core.Driver;
import br.com.projNoBug.maps.CadastroMap;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {
    CadastroMap cadastroMap;

    public CadastroPage(){
        cadastroMap = new CadastroMap();
        PageFactory.initElements(Driver.getDriver(), cadastroMap);
    }

    public void setInpEmail(String email){
        cadastroMap.inpEmail.sendKeys(email);
    }

    public void setInpName(String name){
        cadastroMap.inpName.sendKeys(name);
    }

    public void setInpSenha(String senha){
        cadastroMap.inpSenha.sendKeys(senha);
    }

    public void setConfSenha(String ConfSenha){
        cadastroMap.inpConfSenha.sendKeys(ConfSenha);
    }

    public void clickBtnCriarSaldo(){
        cadastroMap.btnCriaSaldo.click();
    }

    public void clickBtnCadastrar(){
        cadastroMap.btnCadastrar.click();
    }
}
