package br.com.projNoBug.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroMap {

    @FindBy(xpath = ("//*[@id="__next"]/div/div[2]/div/div[1]/form/div[3]/button[2]")
    
    public WebElement btnRegistrar;
    @FindBy(id = "*['email']")
    public WebElement inpEmail;
    @FindBy(css = "*[name='name']")
    public WebElement inpName;
    @FindBy(css = "*[name='password']")
    public WebElement inpSenha;
    @FindBy(css = "*[name='passwordConfirmation']")
    public WebElement inpConfSenha;
    @FindBy(css = "span[class='styles__Span-sc-1pngcbh-2 gXFUUF']")
    public WebElement btnCriaSaldo;
    @FindBy(css = "*[class='style__ContainerButton-sc-1wsixal-0 CMabB button__child']")
    public WebElement btnCadastrar;

}
