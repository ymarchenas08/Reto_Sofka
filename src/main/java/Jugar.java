import java.util.Scanner;

public class Jugar
{
    private int respuestanivel1 = 0;
    private int respuestanivel2 = 0;
    private int respuestanivel3 = 0;
    private int respuestanivel4 = 0;
    private int respuestanivel5 = 0;
    private int continuarANivel2 = 7;
    private int continuarANivel3 = 7;
    private int continuarANivel4 = 7;
    private int continuarANivel5 = 7;
    public String nombreJugador = "";
    public String [] Jugadores = new String[100];
    public double [] PremiosJugadores = new double[100];
    public double premio = 0;

    public  void comenzarJuego() {


        NivelesPreguntas niveles = new NivelesPreguntas();
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        nombreJugador = entradaTeclado.nextLine();
        System.out.println("HOLA " + nombreJugador + " VAMOS A JUGAR!!!!");

        niveles.mostrarPreguntasNivel1();
        System.out.println("Elija su respuesta correcta");
        respuestanivel1 = entradaTeclado.nextInt();

        switch (niveles.PreguntaNivel1) {
            case 1:
                if (respuestanivel1 == 1) {
                    System.out.println("felicitaciones!!! has avanzado al nivel 2");
                    premio += 100000;
                    System.out.println("Su Premio acumulado es: " + premio);
                    System.out.println("¿Desea continuar?");
                    System.out.println("Si - escribe 0");
                    System.out.println("No - escribe 9");
                    continuarANivel2 = entradaTeclado.nextInt();
                    if (continuarANivel2 == 0) {
                        niveles.mostrarPreguntasNivel2();
                        System.out.println("Elija su respuesta correcta");
                        respuestanivel2 = entradaTeclado.nextInt();
                    }
                    ;
                    if (continuarANivel2 == 9)
                    {
                        System.out.println("Gracias por participar, has ganado: " + premio);

                    }

                }
                if (respuestanivel1 != 1) {
                    System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");

                }
                ;
                break;

            case 2:
                if (respuestanivel1 == 4) {
                    System.out.println("felicitaciones!!! has avanzado al nivel 2");
                    premio += 100000;
                    System.out.println("Su Premio acumulado es: " + premio);
                    System.out.println("¿Desea continuar?");
                    System.out.println("Si - escribe 0");
                    System.out.println("No - escribe 9");
                    continuarANivel2 = entradaTeclado.nextInt();
                    if (continuarANivel2 == 0) {
                        niveles.mostrarPreguntasNivel2();
                        System.out.println("Elija su respuesta correcta");
                        respuestanivel2 = entradaTeclado.nextInt();
                    }
                    ;
                    if (continuarANivel2 == 9)
                    {
                        System.out.println("Gracias por participar, has ganado: " + premio);

                    }

                }
                if (respuestanivel1 != 4) {
                    System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");

                }
                ;
                break;

            case 3:
                if (respuestanivel1 == 2) {
                    System.out.println("felicitaciones!!! has avanzado al nivel 2");
                    premio += 100000;
                    System.out.println("Su Premio acumulado es: " + premio);
                    System.out.println("¿Desea continuar?");
                    System.out.println("Si - escribe 0");
                    System.out.println("No - escribe 9");
                    continuarANivel2 = entradaTeclado.nextInt();
                    if (continuarANivel2 == 0) {
                        niveles.mostrarPreguntasNivel2();
                        System.out.println("Elija su respuesta correcta");
                        respuestanivel2 = entradaTeclado.nextInt();
                    }
                    ;
                    if (continuarANivel2 == 9)
                    {
                        System.out.println("Gracias por participar, has ganado: " + premio);

                    }
                }
                 if (respuestanivel1 != 2) {
                    System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");

                }
                ;
                break;

            case 4:
                if (respuestanivel1 == 4) {
                    System.out.println("felicitaciones!!! has avanzado al nivel 2");
                    premio += 100000;
                    System.out.println("Su Premio acumulado es: " + premio);
                    System.out.println("¿Desea continuar?");
                    System.out.println("Si - Escribe 0");
                    System.out.println("No - Escribe 9");
                    continuarANivel2 = entradaTeclado.nextInt();
                    if (continuarANivel2 == 0) {
                        niveles.mostrarPreguntasNivel2();
                        System.out.println("Elija su respuesta correcta");
                        respuestanivel2 = entradaTeclado.nextInt();
                    }
                    ;
                    if (continuarANivel2 == 9)
                    {
                        System.out.println("Gracias por participar, has ganado: " + premio);

                    }
                }
                if (respuestanivel1 != 4) {
                    System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");

                }
                ;
                break;

            case 5:
                if (respuestanivel1 == 3) {
                    System.out.println("felicitaciones!!! has avanzado al nivel 2");
                    premio += 100000;
                    System.out.println("Su Premio acumulado es: " + premio);
                    System.out.println("¿Desea continuar?");
                    System.out.println("Si - Escribe 0");
                    System.out.println("No - Escribe 9");
                    continuarANivel2 = entradaTeclado.nextInt();
                    if (continuarANivel2 == 0) {
                        niveles.mostrarPreguntasNivel2();
                        System.out.println("Elija su respuesta correcta");
                        respuestanivel2 = entradaTeclado.nextInt();
                    }
                    ;
                    if (continuarANivel2 == 9)
                    {
                        System.out.println("Gracias por participar, has ganado: " + premio);

                    }
                }
                if (respuestanivel1 != 3) {
                    System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");

                }
                ;
                break;

        }

        if(continuarANivel2 == 0)
        {
            switch (niveles.PreguntaNivel2) {
                case 1:
                    if (respuestanivel2 == 3) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 3");
                        premio += 300000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe 0");
                        System.out.println("No - escribe 9");
                        continuarANivel3 = entradaTeclado.nextInt();
                        if (continuarANivel3 == 0) {
                            niveles.mostrarPreguntasNivel3();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel3 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel3 == 9) System.out.println("Gracias por participar, has ganado: " + premio);

                    }
                    if (respuestanivel2 != 3) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 2:
                    if (respuestanivel2 == 1) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 3");
                        premio += 300000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe 0");
                        System.out.println("No - escribe 9");
                        continuarANivel3 = entradaTeclado.nextInt();
                        if (continuarANivel3 == 0) {
                            niveles.mostrarPreguntasNivel3();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel3 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel3 == 9) System.out.println("Gracias por participar, has ganado: " + premio);

                    }
                    if (respuestanivel2 != 1) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 3:
                    if (respuestanivel2 == 4) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 3");
                        premio += 300000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe 0");
                        System.out.println("No - escribe 9");
                        continuarANivel3 = entradaTeclado.nextInt();
                        if (continuarANivel3 == 0) {
                            niveles.mostrarPreguntasNivel3();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel3 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel3 == 9) System.out.println("Gracias por participar, has ganado: " + premio);
                    }
                    if (respuestanivel2 != 4) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 4:
                    if (respuestanivel2 == 2) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 3");
                        premio += 300000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - Escribe 0");
                        System.out.println("No - Escribe 9");
                        continuarANivel3 = entradaTeclado.nextInt();
                        if (continuarANivel3 == 0) {
                            niveles.mostrarPreguntasNivel3();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel3 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel3 == 9) System.out.println("Gracias por participar, has ganado: " + premio);
                    }
                    if (respuestanivel2 != 2) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 5:
                    if (respuestanivel2 == 3) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 3");
                        premio += 300000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - Escribe 0");
                        System.out.println("No - Escribe 9");
                        continuarANivel3 = entradaTeclado.nextInt();
                        if (continuarANivel3 == 0) {
                            niveles.mostrarPreguntasNivel3();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel3 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel3 == 9) System.out.println("Gracias por participar, has ganado: " + premio);
                    }
                    if (respuestanivel2 != 3) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

            }
        }
        if(continuarANivel3 ==0)
        {
            switch (niveles.PreguntaNivel3) {
                case 1:
                    if (respuestanivel3 == 3) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 4");
                        premio += 500000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe 0");
                        System.out.println("No - escribe 9");
                        continuarANivel4 = entradaTeclado.nextInt();
                        if (continuarANivel4 == 0) {
                            niveles.mostrarPreguntasNivel4();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel4 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel4 == 9) System.out.println("Gracias por participar, has ganado: " + premio);

                    }
                    if (respuestanivel3 != 3) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 2:
                    if (respuestanivel3 == 4) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 4");
                        premio += 500000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe 0");
                        System.out.println("No - escribe 9");
                        continuarANivel4 = entradaTeclado.nextInt();
                        if (continuarANivel4 == 0) {
                            niveles.mostrarPreguntasNivel4();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel4 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel4 == 9) System.out.println("Gracias por participar, has ganado: " + premio);

                    }
                    if (respuestanivel3 != 4) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 3:
                    if (respuestanivel3 == 1) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 4");
                        premio += 500000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe 0");
                        System.out.println("No - escribe 9");
                        continuarANivel4 = entradaTeclado.nextInt();
                        if (continuarANivel4 == 0) {
                            niveles.mostrarPreguntasNivel4();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel4 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel4 == 9) System.out.println("Gracias por participar, has ganado: " + premio);
                    }
                    if (respuestanivel3 != 1) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 4:
                    if (respuestanivel3 == 4) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 4");
                        premio += 500000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - Escribe 0");
                        System.out.println("No - Escribe 9");
                        continuarANivel4 = entradaTeclado.nextInt();
                        if (continuarANivel4 == 0) {
                            niveles.mostrarPreguntasNivel4();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel4 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel4 == 9) System.out.println("Gracias por participar, has ganado: " + premio);
                    }
                    if (respuestanivel3 != 4) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 5:
                    if (respuestanivel3 == 1) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 4");
                        premio += 500000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - Escribe 0");
                        System.out.println("No - Escribe 9");
                        continuarANivel4 = entradaTeclado.nextInt();
                        if (continuarANivel4 == 0) {
                            niveles.mostrarPreguntasNivel4();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel4 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel4 == 9) System.out.println("Gracias por participar, has ganado: " + premio);
                    }
                    if (respuestanivel3 != 1) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

            }
        }
        if(continuarANivel4 ==0)
        {
            switch (niveles.PreguntaNivel4) {
                case 1:
                    if (respuestanivel4 == 4) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 5");
                        premio += 700000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe 0");
                        System.out.println("No - escribe 9");
                        continuarANivel5 = entradaTeclado.nextInt();
                        if (continuarANivel5 == 0) {
                            niveles.mostrarPreguntasNivel5();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel5 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel5 == 9) System.out.println("Gracias por participar, has ganado: " + premio);

                    }
                    if (respuestanivel4 != 4) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 2:
                    if (respuestanivel4 == 1) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 5");
                        premio += 700000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe 0");
                        System.out.println("No - escribe 9");
                        continuarANivel5 = entradaTeclado.nextInt();
                        if (continuarANivel5 == 0) {
                            niveles.mostrarPreguntasNivel5();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel5 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel5 == 9) System.out.println("Gracias por participar, has ganado: " + premio);

                    }
                    if (respuestanivel4 != 1) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 3:
                    if (respuestanivel4 == 2) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 5");
                        premio += 700000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe 0");
                        System.out.println("No - escribe 9");
                        continuarANivel5 = entradaTeclado.nextInt();
                        if (continuarANivel5 == 0) {
                            niveles.mostrarPreguntasNivel5();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel5 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel5 == 9) System.out.println("Gracias por participar, has ganado: " + premio);
                    }
                    if (respuestanivel4 != 2) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 4:
                    if (respuestanivel4 == 1) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 5");
                        premio += 700000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - Escribe 0");
                        System.out.println("No - Escribe 9");
                        continuarANivel5 = entradaTeclado.nextInt();
                        if (continuarANivel5 == 0) {
                            niveles.mostrarPreguntasNivel5();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel5 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel5 == 9) System.out.println("Gracias por participar, has ganado: " + premio);
                    }
                    if (respuestanivel4 != 1) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

                case 5:
                    if (respuestanivel4 == 2) {
                        System.out.println("felicitaciones!!! has avanzado al nivel 5");
                        premio += 700000;
                        System.out.println("Su Premio acumulado es: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - Escribe 0");
                        System.out.println("No - Escribe 9");
                        continuarANivel5 = entradaTeclado.nextInt();
                        if (continuarANivel5 == 0) {
                            niveles.mostrarPreguntasNivel5();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel5 = entradaTeclado.nextInt();
                        }
                        ;
                        if (continuarANivel5 == 9) System.out.println("Gracias por participar, has ganado: " + premio);
                    }
                    if (respuestanivel4 != 2) {
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    }
                    ;
                    break;

            }
        }
        if(continuarANivel5 ==0)
        {
            switch (niveles.PreguntaNivel5) {
                case 1:
                    if (respuestanivel5 == 2) {
                        System.out.println("felicitaciones!!! ERES EL GANADOR");
                        premio += 1000000;
                        System.out.println("Su Premio total es de: " + premio);
                    }
                    if (respuestanivel5 != 2) System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    break;

                case 2:
                    if (respuestanivel5 == 2) {
                        System.out.println("felicitaciones!!! ERES EL GANADOR ");
                        premio += 1000000;
                        System.out.println("Su Premio total es: " + premio);
                    }
                    if (respuestanivel5 != 2) System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    break;

                case 3:
                    if (respuestanivel5 == 2) {
                        System.out.println("felicitaciones!!! ERES EL GANADOR");
                        premio += 1000000;
                        System.out.println("Su Premio total es: " + premio);
                    }
                    if (respuestanivel5 != 2) System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    break;

                case 4:
                    if (respuestanivel5 == 3) {
                        System.out.println("felicitaciones!!! ERES El GANADOR");
                        premio += 1000000;
                        System.out.println("Su Premio total es: " + premio);
                    } else if (respuestanivel5 != 3)
                        System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    break;

                case 5:
                    if (respuestanivel5 == 4) {
                        System.out.println("felicitaciones!!! ERES EL GANADOR");
                        premio += 1000000;
                        System.out.println("Su Premio total es: " + premio);
                    }
                    if (respuestanivel5 != 4) System.out.println("Lo sentimos, has perdido.... Vuelve a intentarlo");
                    break;

            }
        }

    }
}
