import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        Scanner datoContinue = new Scanner(System.in);
        int continuar = 9;
        int numeroJugadores = 0;
        int conocerPremios = 0;
        Jugar play = new Jugar();
        do {
            play.comenzarJuego();
            System.out.println("Nuevo Jugador?");
            System.out.println("Si: presiones 0");
            System.out.println("No: presiones 9");
            continuar = datoContinue.nextInt();
            play.Jugadores[numeroJugadores] = play.nombreJugador;
            play.PremiosJugadores[numeroJugadores] = play.premio;
            play.premio =0;
            numeroJugadores += 1;
        } while (continuar==0);

        System.out.println("Quieres conocer los participantes y sus premios?");
        System.out.println("Si: presiones 0");
        System.out.println("No: presiones 9");
        conocerPremios = datoContinue.nextInt();

        if(conocerPremios==0)
        {
            for(int i =0; i < numeroJugadores; i++)
            System.out.println("Nombre: " +play.Jugadores[i]+ " Premio: " +play.PremiosJugadores[i] );

        }


        //}






    }



}



