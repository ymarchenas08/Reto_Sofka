import java.nio.channels.Pipe;

public class NivelesPreguntas
{
   private int numeroPregunta;
   private int nivelPreguntas;
   public int PreguntaNivel1 = (int) (Math.random()*5)+1;
   public int PreguntaNivel2 = (int) (Math.random() * 5) + 1;
   public int PreguntaNivel3 = (int) (Math.random()*5)+1;
   public int PreguntaNivel4 = (int) (Math.random() * 5) + 1;
   public int PreguntaNivel5 = (int) (Math.random() * 5) + 1;

    public NivelesPreguntas()
    {
        this.numeroPregunta = numeroPregunta;
        this.nivelPreguntas = nivelPreguntas;
    }

    public void mostrarPreguntasNivel1()
    {

        PrimerNivel niveluno = new PrimerNivel();

        switch (PreguntaNivel1)
        {
            case 1:
                niveluno.PrimeraPregunta();
                break;
            case 2:
                niveluno.SegundaPregunta();
                break;

            case 3:
                niveluno.TerceraPregunta();
                break;

            case 4:
                niveluno.CuartaPregunta();
                break;

            case 5:
                niveluno.QuintaPregunta();
                break;
        }

    };

    public void mostrarPreguntasNivel2()
    {

        SegundoNivel niveldos = new SegundoNivel();
        switch (PreguntaNivel2)
        {
            case 1:
                niveldos.PrimeraPregunta();
                break;
            case 2:
                niveldos.SegundaPregunta();
                break;

            case 3:
                niveldos.TerceraPregunta();
                break;

            case 4:
                niveldos.CuartaPregunta();
                break;

            case 5:
                niveldos.QuintaPregunta();
                break;
        }
    }

    public void mostrarPreguntasNivel3()
    {

        TercerNivel niveltres = new TercerNivel();

        switch (PreguntaNivel3)
        {
            case 1:
                niveltres.PrimeraPregunta();
                break;
            case 2:
                niveltres.SegundaPregunta();
                break;

            case 3:
                niveltres.TerceraPregunta();
                break;

            case 4:
                niveltres.CuartaPregunta();
                break;

            case 5:
                niveltres.QuintaPregunta();
                break;
        }

    };

    public void mostrarPreguntasNivel4()
    {
        CuartoNivel nivelcuatro = new CuartoNivel();
        switch (PreguntaNivel4)
        {
            case 1:
                nivelcuatro.PrimeraPregunta();
                break;
            case 2:
                nivelcuatro.SegundaPregunta();
                break;

            case 3:
                nivelcuatro.TerceraPregunta();
                break;

            case 4:
                nivelcuatro.CuartaPregunta();
                break;

            case 5:
                nivelcuatro.QuintaPregunta();
                break;
        }
    }

    public void mostrarPreguntasNivel5()
    {

        QuintoNivel nivelcinco = new QuintoNivel();
        switch (PreguntaNivel5)
        {
            case 1:
                nivelcinco.PrimeraPregunta();
                break;
            case 2:
                nivelcinco.SegundaPregunta();
                break;

            case 3:
                nivelcinco.TerceraPregunta();
                break;

            case 4:
                nivelcinco.CuartaPregunta();
                break;

            case 5:
                nivelcinco.QuintaPregunta();
                break;
        }
    }
}
