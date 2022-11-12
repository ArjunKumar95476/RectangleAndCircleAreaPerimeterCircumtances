import java.util.Scanner;

public class AreaAndPeriCalculate {
    public static void AreandPre()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n\n===> AREA AND PERIMETER CALCULATION OF RECTANGLE AND CIRCLE <===\n\n");
        byte repeat;
        do
        {
        System.out.println("\n WE WILL  PERFORM FOLLOWING OPERATION\n\n AREA OF RECTANGLE \n PERIMETER OF RECTANGLE \n AREA OF CIRCLE \n CIRCUMFERENCE  OF CIRCLE \n");
        System.out.println("PRESS BUTTON FOR CORRESPONDING OPERATION\n\n AREA OF RECTANGLE --------> 1\n PERIMETER OF RECTANGLE ---> 2 \n AREA OF CIRCLE -----------> 3 \n CIRCUMFERENCE OF CIRCLE --> 4\n");
        int button;
        int length,breadth,radius;
        float circle_area,rectangle_area;
        float circle_circumference,rectangle_perimeter;
        final float pi=3.14f;
        System.out.println("PRESS BUTTON : ");
        button=scanner.nextInt();
        System.out.println();
        switch(button)
        {
            case 1:
            System.out.println("RECTANGLE LENGTH(m) : ");
            length=scanner.nextInt();
            System.out.println("RECTANGLE BREADTH(m) : ");
            breadth=scanner.nextInt();
            rectangle_area=length*breadth;
            System.out.println("\nRECTANGLE AREA : "+rectangle_area+" SquareMetre\n");
            break;
            case 2:
            System.out.println("RECTANGLE LENGTH(m) : ");
            length=scanner.nextInt();
            System.out.println("RECTANGLE BREADTH(m) : ");
            breadth=scanner.nextInt();
            rectangle_perimeter=2*(length+breadth);
            System.out.println("\nRECTANGLE PERIMETER : "+rectangle_perimeter+" Metre\n");
            break;
            case 3:
            System.out.println("CIRCLE RADIUS(m): ");
            radius=scanner.nextInt();
            circle_area=pi*radius*radius;
            System.out.println("\nCIRCLE AREA : "+circle_area+" SquareMetre\n");
            break;
            case 4:
            System.out.println("CIRCLE RADIUS(m): ");
            radius=scanner.nextInt();
            circle_circumference=2*pi*radius;
            System.out.println("\nCIRCLE CIRCUMFERENCE : "+circle_circumference+" Metre\n");
            break;
            default:
            System.out.println("INVALID BUTTON PRESSED !!\n\n");

        }
        System.out.println("DO YOU WANT TO CONTINUE THIS PROGRAM THEN PRESS 1 ELSE PRESS 0 !!");
        repeat=scanner.nextByte();
        System.out.println("\n");
    }while(repeat!=0);
    System.out.println("THANKS !! PROGRAM END !");
    }
    public static void main(String[] args) {
        AreandPre();
    }
}
