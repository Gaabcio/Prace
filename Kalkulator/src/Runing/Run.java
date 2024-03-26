package Runing;
import Figures.*;


public class Run
{
    Input input = new Input();
    public void runing()
    {
        int wybor;
        while (true)
        {
            Menu(); // menu programu
            wybor = input.inputInt(); // metoda do wczytania int

            switch (wybor)
            {
                case 1 ->viewCircle();//koło
                case 2 ->viewSquare();//kwadrat
                case 3 ->viewRectangle();//prostokąt
                case 4 ->viewCube();//sześcian
                case 5 ->viewCuboid();//prostopadłościan
                case 6 ->viewBall();//Kula
                case 7 ->viewCone();//Stożek
                case 8 ->Close();//koniec programu
                default ->defaultInstructioon();
            }
        }
    }

    private void viewCircle()
    {
        Circle kolo = new Circle();

        while (true) {
            System.out.println("Podaj promień koła: ");
            double r = Math.abs(input.inputDouble());
            if (r != 0)
            {
                kolo.setR(r);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }
        kolo.view();
    }

    private void viewSquare()
    {
        Square kwadrat = new Square();
        while (true) {
            System.out.println("Podaj bok a: ");
            double a = Math.abs(input.inputDouble());
            if (a != 0)
            {
                kwadrat.setA(a);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }

        kwadrat.view();
    }

    private void viewRectangle()
    {
        Rectangle prostakat = new Rectangle();
        while (true) {
            System.out.println("Podaj bok a: ");
            double a = Math.abs(input.inputDouble());
            if (a != 0)
            {
                prostakat.setA(a);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }


        while (true) {
            System.out.println("Podaj bok b: ");
            double b = Math.abs(input.inputDouble());
            if (b != 0)
            {
                prostakat.setB(b);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }


        prostakat.view();
    }

    private void viewCube()
    {
        Cube szescian = new Cube();
        while (true) {
            System.out.println("Podaj bok a: ");
            double a = Math.abs(input.inputDouble());
            if (a != 0)
            {
                szescian.setA(a);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }

        szescian.view();
    }

    private void viewCuboid()
    {
        Cuboid prostopadloscian = new Cuboid();

        while (true) {
            System.out.println("Podaj bok a: ");
            double a = Math.abs(input.inputDouble());
            if (a != 0)
            {
                prostopadloscian.setA(a);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }


        while (true) {
            System.out.println("Podaj bok b: ");
            double b = Math.abs(input.inputDouble());
            if (b != 0)
            {
                prostopadloscian.setB(b);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }

        while (true) {
            System.out.println("Podaj bok c: ");
            double c = Math.abs(input.inputDouble());
            if (c != 0)
            {
                prostopadloscian.setC(c);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }

        prostopadloscian.view();
    }

    private void viewBall()
    {
        Ball kula = new Ball();

        while (true) {
            System.out.println("Podaj promień kuli: ");
            double r = Math.abs(input.inputDouble());
            if (r != 0)
            {
                kula.setR(r);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }

        kula.view();
    }

    private void viewCone()
    {
        Cone stozek = new Cone();
        System.out.println("Wybrałeś: "+ stozek.getName());

        while (true) {
            System.out.println("Podaj promień stożka: ");
            double r = Math.abs(input.inputDouble());
            if (r != 0)
            {
                stozek.setR(r);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }

        while (true) {
            System.out.println("Podaj wysokość stożka: ");
            double h = Math.abs(input.inputDouble());
            if (h != 0)
            {
                stozek.setH(h);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }


        while (true) {
            System.out.println("Podaj tworzącą stożka: ");
            double l = Math.abs(input.inputDouble());
            if (l != 0)
            {
                stozek.setL(l);
                break;
            }
            else
            {
                System.out.println("Podaj wartość różną od zera!");
            }
        }

        stozek.view();

    }

    private void defaultInstructioon() {
        System.out.println("Błędne dane, koniec programu!");
        System.exit(0);
    }

    private void Close() {
        System.out.println("Czy na pewno chcesz wyjść? t || T");
        String znak = input.inputChar();
        String str1 = "t", str2 = "T";
        if (znak.equals(str1) || znak.equals(str2)) System.exit(0);
    }



    private void Menu() {
        System.out.println("\n\nKalkulator figur geometrycznych");
        System.out.println(
                "1. Koło\n"+
                "2. Kwadrat \n"+
                "3. Prostokąt \n"+
                "4. Sześcian \n"+
                "5. Prostopadłościan \n"+
                "6. Kula \n"+
                "7. Stożek \n"+
                "8. Wyjście");
        System.out.println("\nWybierz opcje: ");
    }


}//koniec klasy
