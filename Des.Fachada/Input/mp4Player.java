package Input;
import java.util.Scanner;

public class mp4Player implements Dispositivo {
    private Scanner entrada;
public mp4Player() {
    entrada = new Scanner(System.in);
}

@Override
public String lerEntrada() {
return entrada.next();
}

}