package hovercucumber;

public class Main 
{
    public static void main( String[] args )
    {
        Plato plato = new Plato(5, 5);
        Hover hover = new Hover(3, 3, "L", plato);
        System.out.println( "Hover na posição: " + hover.posicaoAtual());
        String espressao = "MMRMMRMRRM";
        System.out.println( "Movendo hover: " + espressao );
        hover.move(espressao);
        System.out.println( "Posição esperada: 2 3 N" );
        System.out.println( "Hover na posição: " + hover.posicaoAtual());
    }
}
