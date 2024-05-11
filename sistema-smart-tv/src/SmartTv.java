public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminiuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
        } else {
            canal = 1;
        }
    }
}
