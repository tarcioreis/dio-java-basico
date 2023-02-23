public class SmartTv {
    Boolean ligada;
    int canal = 1;
    int volume = 12;

    public void ligar () {
        ligada = true;
        System.out.println("Ligando tv...");
    }

    public void desligar () {
        ligada = false;
        System.out.println("Desligando tv...");
    }

    public void aumentarCanal () {
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void diminuirCanal () {
        canal--;
        System.out.println("Canal: " + canal);
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }

    public void aumentarVolume () {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume () {
        volume--;
        System.out.println("Volume: " + volume);
    }

}
