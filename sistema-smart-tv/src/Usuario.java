public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);

        smartTv.ligar(); // metodo para ligar a tv

        smartTv.desligar(); // metodo para desligar a tv

        smartTv.aumentarVolume();
        System.out.println("volume: " + smartTv.volume);
        smartTv.diminiuirVolume();
        System.out.println("volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("canal: " + smartTv.canal);

    }
}
