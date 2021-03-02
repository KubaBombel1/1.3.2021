package sample;

import java.util.Scanner;

public class Gracz




{

                Scanner scanner = new Scanner(System.in);


                          int życie;
         int atak;


                      int obrona ;

    Gracz()

    {
                        this.życie = życie;

        this.atak = atak;


                         this.obrona  = obrona;


    }

    public void choose_eq()

    {


        System.out.println("Wyierz swojego operatora \n 1 Thermite 40 życia 40 ataku 15 obrony \n 2 Ash 45 zycia 40 ataku 25 obrony \n 3 Blitz 75 życia 25 ataku 35 obrony 4 Twich 35 życia  25 ataku 25 obrony \n 5 Blackbeard 45 zycia 25 ataku 35 obrony\n ");


                   int choice = scanner.nextInt();



        switch (choice)

        {
            case 1:

                     atak = 40;

                życie = 40;


                     obrona  = 15;

                    break;

            case 2:

                  atak = 40;


                         życie = 45;

                obrona  = 25;

                break;
            case 3:

                atak = 25;

                             życie = 75;

                obrona  = 35;

                break;
            case 4:

                       atak = 25;

                życie = 35;

                     obrona  = 25;

                break;


            case 5:

                      atak = 35;

                życie = 45;


                obrona  = 25;


                break;
        }
    }
}
