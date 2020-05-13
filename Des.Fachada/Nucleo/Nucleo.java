package Nucleo;


public class Nucleo {
    public Nucleo() {
    SubsistemaMultimidia multimidia = new SubsistemaMultimidia();
    multimidia.ligar(); //liga o sistema   
    multimidia.configurarGeral(); 
    multimidia.Joystick();
    multimidia.reproduzir(); //reproduz o que estiver conectado
    multimidia.Menu();
    multimidia.desligar();//desliga o sistema
    }
    //apenas dispara a aplicação
    public static void main(String args[]) {
    Nucleo nucleo = new Nucleo();
    }
    }