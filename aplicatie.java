import javax.swing.*;
import java.lang.Math;
public class aplicatie
{
    boolean quit = false;
    public static void main (String args[]) throws Exception
    {
        aplicatie clas = new aplicatie();
        do
        {
            clas.output(clas.optionAssign(clas.menu()));
        } while (clas.quit == false);
    }
    public double input(String value)
    {
        String ask = "Introduceti" + value;

        String input = JOptionPane.showInputDialog(null, ask, "calculator", JOptionPane.QUESTION_MESSAGE);
        double num  = Double.parseDouble(input);

        return num;
    }
    public void output(double i)
    {
        if (i > 0)
        {
            JOptionPane.showMessageDialog(null, i);
        }
    }

    public int menu()
    {
        int ch;

        String menu = "Calculator : \n";
        menu += "1. Aria patrat \n";
        menu += "2. Perimetru patrat \n";
        menu += "3. Aria dreptunghi\n";
        menu += "4. Perimetru dreptunghi\n";
        menu += "5. Aria cerc\n";
        menu += "6. Perimetru cerc\n";
        menu += "7. Volum cub\n";
        menu += "8. Arie cub\n";
        menu += "9. Volum sfera\n";
        menu += "10. Aria sfera\n";
        menu += "11. Iesire\n\n";

        String input = JOptionPane.showInputDialog(null, menu, "CALCULATOR", JOptionPane.QUESTION_MESSAGE);
        ch  = Integer.parseInt(input);
        return ch;
    }

    public double optionAssign(int ch)
    {
        double output = 0;

        switch(ch)
        {
            case 1: output = ariepatrat(input(" Marimea laturii")); break;
            case 2: output = perpatrat(input(" Marimea laturii")); break;
            case 3: output = ariedreptunghi(input(" Latura 1"), input(" Latura 2")); break;
            case 4: output = perdreptunghi(input(" Latura 1"), input(" Latura 2")); break;
            case 5: output = ariecerc(input(" Raza")); break;
            case 6: output = percerc(input(" Raza")); break;
            case 7: output = volumcub(input(" Marimea laturii")); break;
            case 8: output = ariecub(input(" Marimea laturii")); break;
            case 9: output = volumsfera(input(" Raza")); break;
            case 10: output = ariasfera(input(" Raza")); break;
            case 11: quit(); break;
            default: menu(); break;
        }

        return output;
    }


    public double ariepatrat(double side)
    {
        return side*4;
    }

    public double perpatrat(double side)
    {
        return side*side;
    }

    public double ariedreptunghi(double side1, double side2)
    {
        return side1*side2;
    }

    public double perdreptunghi(double side1, double side2)
    {
        return side1*2+side2*2;
    }

    public double ariecerc(double rad)
    {
        return Math.pow((Math.PI*rad),2);
    }

    public double percerc(double rad)
    {
        return 2*Math.PI*rad;
    }
    public double volumcub(double side)
    {
        return Math.pow((side),3);
    }
    public double ariecub(double side)
    {
        return 6*side*side;
    }
    public double volumsfera(double rad)
    {
        return 4/3*Math.PI*Math.pow((rad),3);
    }
    public double ariasfera(double rad)
    {
        return 4*Math.PI*Math.pow((rad),2);
    }
    public boolean quit()
    {
        return quit = true;
    }
}