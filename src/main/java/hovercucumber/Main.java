package hovercucumber;

public class Main 
{
    public static void main( String[] args )
    {
        Plato plato = new Plato(5, 5);
        Rover rover = new Rover(3, 3, "L", plato);
        System.out.println( "Hover na posição: " + rover.posicaoAtual());
        String espressao = "MMRMMRMRRM";
        System.out.println( "Movendo hover: " + espressao );
        rover.executarExpressao(espressao);
        System.out.println( "Posição esperada: 2 3 N" );
        System.out.println( "Hover na posição: " + rover.posicaoAtual());
    }
}
