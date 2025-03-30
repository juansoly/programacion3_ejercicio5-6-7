import pojos.mes;

import java.util.Scanner;

public class Ejercicio6 {
    mes[]meses= new mes[12];
    Scanner scanner;

    public Ejercicio6(){
                    meses[0]=new mes(1,"Enero",31);
                    meses[1]=new mes(2,"Febrero",28);
                    meses[2]=new mes(3,"Marzo",31);
                    meses[3]=new mes(4,"Abril",30);
                    meses[4]=new mes(5,"Mayo",31);
                    meses[5]= new mes(6,"Junio",30);
                    meses[6]= new mes(7,"Julio",31);
                    meses[7]= new mes(8,"Agosto",31);
                    meses[8]= new mes(9,"Septiembre",30);
                    meses[9]= new mes(10,"Octubre",31);
                    meses[10]=new mes(11,"Noviembre",30);
                    meses[11]= new mes(12,"Diciembre",31);
                    scanner=new Scanner(System.in);


    }
    public void ejecutar(){
        System.out.println("introduzca el numero del mes");
        int numero= scanner.nextInt();
        mes Mes=meses[numero-1];
        System.out.println(Mes.getNombre());
        System.out.println(Mes.getCantidadDias());
    }





}
