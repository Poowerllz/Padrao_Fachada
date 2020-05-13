package Audio;

public class AutoFalante {
    private int potencia;
    private boolean on = false;

    // possíveis autofalantes a serem ligados. //
    private boolean Autofalantefrontal1 = false;
    private boolean Autofalantefrontal2 = false;
    private boolean Autofalantetrazeiro1 = false;
    private boolean Autofalantetrazeiro2 = false;
    // possíveis autofalantes a serem ligados. //

    private int volume = 10;

    public AutoFalante() {
        this.on = false;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isOn() {
        return on;
    }

    // Declaração de ligar ou desligar autofalantes //
    public void ligar(String autofalante) {
        if(autofalante == "Todas"){
            this.on = true;
            this.Autofalantefrontal1 = true;
            this.Autofalantefrontal2 = true;
            this.Autofalantetrazeiro1 = true;
            this.Autofalantetrazeiro2 = true;
            System.out.println("Todos os autosfalantes estão ligados!");
        } if(autofalante == "frontal"){
            this.on = true;
            this.Autofalantefrontal1 = true;
            this.Autofalantefrontal2 = true;
            System.out.println("os autofalantes frontais estão ligados!");
        } if(autofalante == "trazeiro") {
            this.on = true;
            this.Autofalantetrazeiro1 = true;
            this.Autofalantetrazeiro2 = true;
            System.out.println("os autofalantes trazeiros estão ligados!");
        } 
    }
    // Declaração de ligar ou desligar autofalantes //

    public void desligar() {
        this.on = false;
    }

    public int getVolume() {
        return volume;
    }

    public void alterarVolume(String volume) {
        int aux = Integer.parseInt(volume);
        this.volume += aux;
    }
}