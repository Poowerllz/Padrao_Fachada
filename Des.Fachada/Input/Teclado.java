package Input;
import java.util.Scanner;

public class Teclado implements Dispositivo{
private Scanner entrada;

public Teclado() {
    entrada = new Scanner(System.in);
}

@Override
public String lerEntrada() {
    return entrada.next();
}

public void vivo(){
}
}   