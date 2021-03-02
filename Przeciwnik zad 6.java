package sample;
import java.util.Scanner;
public class Przeciwnik {

    Scanner scanner = new Scanner(System.in);


               int zdrowie;

    int atak;


                 int obrona ;

    Przeciwnik()

    {
                        this.zdrowie = zdrowie;

        this.atak = atak;


                        this.obrona = obrona ;
    }

    public void choose_eq()

    {

                 System.out.println("Wyierz swojego operatora \n 1 Rook 80 życia 20 ataku 40 obrony \n 2 Mira 40 zycia 25 ataku 15 obrony \n 3 Valkyrie 80 życia 40 ataku 5 obrony \n 4 Frost 50 życia  40 ataku 25 obrony \n 5 Doc 20 zycia 50 ataku 20 obrony");


        int choice = scanner.nextInt();


              switch (choice)

        {

            case 1:

                       atak = 20;

                zdrowie = 80;

                obrona = 40;


                break;

            case 2:

                atak = 25;

                zdrowie = 40;

                         obrona = 15;

                break;


            case 3:

                atak = 40;

                zdrowie = 80;

                obrona = 5;


                break;


            case 4:


                atak = 40;

                zdrowie = 50;
                       obrona  = 25;

                break;

            case 5:

                       atak = 50;

                zdrowie = 20;

                obrona  = 20;

                break;
        }
    }
}
