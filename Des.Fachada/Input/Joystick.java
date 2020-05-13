package Input;
import java.util.Scanner;

public class Joystick implements Dispositivo {
    private Scanner entrada;
    
    public Joystick () {
        entrada = new Scanner(System.in);
    }
    
    @Override
    public String lerEntrada() {

    return entrada.next();
    }
}