package Video;
import java.util.Scanner;
import java.util.*;

public class Tela {

        // possíveis telas a serem ligadas. //
    Boolean tela1 = false, tela2 = false, tela3 = false;
        // possíveis telas a serem ligadas. //

    private String display;
    private boolean on;
    private String resolucao;
    private int contraste;
    private int brilho;
    private String SoftwareV = " V2.344 My Link";
    public Tela(String resolucao) {

        // se alguma tela for ligada, necessariamente a variável tela, também será//
        if(tela1 || tela2 || tela3 == true) {
            this.on = true;
        } this.on = false;
        // se alguma tela for ligada, necessariamente a variável tela, também será//
        
    this.resolucao = resolucao;
    this.contraste=50;
    this.brilho=50;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public boolean isOn() {
        return on;
    }

    public void ligar() {
        this.on = true;
    }

    public void desligar() {
        this.on = false;
        this.tela1 = false;
        this.tela2 = false;
        this.tela3 = false;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
    
    public int getContraste() {
        return this.contraste;
    }

    public void alteraContraste(String value) {
        int aux = Integer.parseInt(value);
        this.contraste+=aux;
    }

    public int getBrilho() {
        return brilho;
    }

    public void alteraBrilho(String brilho) {
        int aux = Integer.parseInt(brilho);
        this.brilho+=aux;
    }   

    // Declaração de ligar ou desligar telas // 
    public void LigarTela(String telas) {
            if(telas == "Todas") {
                this.on = true;
                this.tela1 = true;
                this.tela2 = true;
                this.tela3 = true;
            }  
            if(telas == "1") {
                this.on = true;
                this.tela1 = true;
            }
            if(telas == "2") {
                this.on = true;
                this.tela2 = true;
            }
            if(telas == "3") {
                this.on = true;
                this.tela3 = true;
            }
		}
    // Declaração de ligar ou desligar telas // 

    // Menu de informações // 
    public void statusTelas(){
        System.out.println("==============================");
        System.out.println("Você entrou no menu.");
        System.out.println("==============================");
        System.out.println("Digite 1 para: Descobrir quantas telas estão ativas.");
        System.out.println("Digite 2 para: Descobrir informações sobre o carro.");
        System.out.println("Digite 3 para: Sair do menu.");
        Scanner s = new Scanner(System.in);
        String numeroDigitado = s.next();
        switch(numeroDigitado){
            case "1":
            System.out.println(tela2);
                System.out.println("Status de telas.");
                if(tela1 == true){
                    System.out.println("A tela 1 está ativa.");
                } else{
                    System.out.println("A tela 1 não está ativa.");
                }
                if(tela2 == true){
                    System.out.println("A Tela 2 está ativa.");
                } else{
                    System.out.println("A Tela 2 não está ativa.");
                }
                if(tela3 == true){
                    System.out.println("A Tela 3 está ativa.");
                } else{
                    System.out.println("A Tela 3 não está ativa.");
                }

            break;
            case "2":
            Date data = new Date();
                System.out.println("Informações sobre o carro: ");
                System.out.println("A temperatura atual é de 45º");
                System.out.println("A versão de software é:" + this.SoftwareV);
                System.out.println("A hora atual no sistema é: " + data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds());
                break;
            case "3":
            System.out.println("Você saiu do menu.");
            break;

            default:
            System.out.println("Opção não permitida.");
        }
    }
    // Menu de informações // 

}