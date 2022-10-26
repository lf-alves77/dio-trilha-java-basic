public class Usuario {
    private static boolean ligada;

    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);



        smartTv.ligar ();
        ligada = smartTv.ligada;
        System.out.println("Novo Status -> TV ligada? " + ligada);


        smartTv.aumentarVolume();

        smartTv.aumentarVolume();

        System.out.println("Novo Volume atual: " + smartTv.volume);


        smartTv.mudarCanal(13);
        System.out.println("Novo Canal atual: " + smartTv.canal);







    }
}
