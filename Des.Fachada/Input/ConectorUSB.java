package Input;

public class ConectorUSB {
  private boolean on = false;
  private Dispositivo dispositivo;

  public ConectorUSB() {
  this.on = false;
  }

  public void conectaDispositivo(Dispositivo dispositivo) {
  this.dispositivo = dispositivo;
  }

  public String lerDados() {
  if(dispositivo==null) {
    return "Nenhum dispositivo conectado";
    }
    
  return dispositivo.lerEntrada();
  }

  public void ligar() {
  this.on = true;
  }

  public void desligar() {
  this.on = false;
  }
  
  public String Reproduzir(String musica) {
    return "Estou reproduzindo..." + musica;
    }

  public String Joystick() {
    return "Você está com o joystick em cima do menu."; 
  }

 }

