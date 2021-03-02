package sample;

public class Main

{

                     public static int attack(int atak, int obrona)

    {
              if (atak > obrona)

        {


              return atak - obrona;
        }

        else

            {



                return obrona - atak;
        }
    }


    public static void main(String[] args)

    {


             Gracz gracz = new Gracz();


                       gracz.choose_eq();

        Przeciwnik przeciwnik = new Przeciwnik();


                      przeciwnik.choose_eq();

        while (true)


        {


            przeciwnik.zdrowie -= attack(gracz.atak, przeciwnik.obrona);


                        System.out.println("Zadajesz obrażenia przeciwnikowi "+attack(gracz.atak, przeciwnik.obrona) + " zdrowie przeciwnika "+ przeciwnik.zdrowie);


               if (przeciwnik.zdrowie <= 1)


            {

                System.out.println("Zwyciężył gracz");


                break;
            }

            gracz.życie -= attack(przeciwnik.atak, gracz.obrona);


            System.out.println("Przeciwnik zadaje ci obrażenia "+ attack(przeciwnik.atak, gracz.obrona) + " twoje zdrowie "+ gracz.życie);




                                       if (gracz.życie <= 1)

                 {


                        System.out.println("Wygrał Przeciwnik");


                break;
            }
        }


    }
}
