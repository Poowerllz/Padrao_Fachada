package Nucleo;
import Input.*;
import Audio.*;
import Video.*;


public class SubsistemaMultimidia {
    
    private Tela tela;
    private AutoFalante autofalante;
    private ConectorUSB conectorTeclado;
    private ConectorUSB conectorMP4;
    private ConectorUSB conectorJoystick;

    
    public SubsistemaMultimidia() {
    tela = new Tela("1024x768");
    autofalante = new AutoFalante();
    conectorTeclado = new ConectorUSB();
    conectorMP4 = new ConectorUSB();
    conectorJoystick = new ConectorUSB();
    }
    
    public void ligar() {
    tela.ligar();
    tela.LigarTela("Todas");
    autofalante.ligar("Todas");
    conectorTeclado.ligar();
    conectorMP4.ligar();
    conectorJoystick.ligar();
    }

    public void configurarGeral() {
    tela.alteraBrilho(conectorTeclado.lerDados());
    tela.alteraContraste(conectorTeclado.lerDados());
    autofalante.alterarVolume(conectorTeclado.lerDados());
    }

    public void alterarBrilhoContraste() {
    tela.alteraBrilho(conectorTeclado.lerDados());
    tela.alteraContraste(conectorTeclado.lerDados());
    }

    public void alterarVolume() {
    autofalante.alterarVolume(conectorTeclado.lerDados());
    }

    public void reproduzir() {
    System.out.println(conectorMP4.Reproduzir(" MusicaAleatoria.mp3 "));
    }

    private void conectarMP4() {
        conectarMP4();
    }

    public void Joystick (){
       System.out.println(conectorJoystick.Joystick()); 
    }

    public void Menu(){
        tela.statusTelas();
    }

    public void desligar() {
    tela.desligar();
    autofalante.desligar();
    conectorTeclado.desligar();
    conectorMP4.desligar();
    conectorJoystick.desligar();
    }
    }
    