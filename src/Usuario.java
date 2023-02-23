public class Usuario {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        tv.ligar();
        tv.aumentarCanal();
        tv.diminuirCanal();
        tv.mudarCanal(12);
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.desligar();
    }
}
