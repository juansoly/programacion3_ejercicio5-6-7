import java.util.Scanner;

public class ejercicio7 {
    int[]vector1;
    int[]vector2;
    int[]vector3;
    Scanner scanner;

    public ejercicio7(){

        vector1=new int[5];
        vector2=new int[5];
        vector3=new int[5];
        scanner= new Scanner(System.in);

    }
public void  ejecutar(){
    for (int i = 0; i <vector1.length ; i++) {
        System.out.println("vector1["+i+"]:");
        int numero1=scanner.nextInt();
        vector1[i]=numero1;

        System.out.println("vector2["+i+"]:");
        int numero2=scanner.nextInt();
        vector1[i]=numero2;


        vector3[i]= vector1[i]+vector2[i];
        System.out.println("Vector3["+i+"]:"+vector3[i]);
    }
}


}
