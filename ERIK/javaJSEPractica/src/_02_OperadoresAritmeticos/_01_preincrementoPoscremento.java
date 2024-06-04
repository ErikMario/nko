package _02_OperadoresAritmeticos;

public class _01_preincrementoPoscremento {
    public static void main(String[] args) {
        int contador=1,contador2;
        contador=contador+1;
        System.out.println("valor de contador: "+contador);
        contador++;
        ++contador;
        System.out.println("valor del contador"+contador
        );
        contador2=contador++;
        System.out.printf("valor del contador"+contador2);
        contador=4;
        contador2=++contador;
        System.out.println("valor del contador"+contador);
        System.out.printf("valor de contador: preincremeno"+contador2);
        contador=4;
        System.out.printf("preincremento "+( 8 + ++contador));
        contador=4;
        System.out.printf("preincremento " + (8 + contador++));
        contador= contador+2; // exprecionlarga
        contador+= 2; //exprecion reducisda
        System.out.printf("valor de contador :"+contador);

        int anoDeNacimiento=1987;
int ano=2050;
        System.out.printf("años actuales :" +(ano - anoDeNacimiento));
//temperatura de celciusFahrenheit
byte celcius=50 , farenhet=(50* 9/5) + 32;
        System.out.printf("valor de temperatura en farenheit : " + farenhet);
//Conversión de minutos a horas y minutos: Convierte una cantidad total de minutos a horas y minutos.

long minutos=4526, horas= minutos/60;
        System.out.printf("valor de minutos a horas : "+ horas);

       // Cálculo del interés compuesto: Calcula el interés compuesto sobre una cantidad principal con una tasa de interés y un periodo.
        long prestamo=2000 ,interes=17 ,tiempo=12;
long totalDeVeneficios=prestamo/tiempo*100 /interes;
        System.out.printf("total de veneficios : "+totalDeVeneficios);
       double  cali1=9,cali2=8,cali3=7;
        double promedio= ( cali1+cali2+cali3)/3;
        System.out.printf("promedio total : "+promedio);
        // Conversión de peso: Convierte una cantidad de kilogramos a libras.

        double kilos=50, libra=kilos* 2.205f;
        System.out.printf("valor en libras : "+libra);
              //Cálculo de pago mensual de un préstamo: Calcula el pago mensual de un préstamo dado el monto, la tasa de interés anual y el periodo del préstamo.


        long monto=300000,periodo=40,inte=monto/periodo/100*17;
        long pagoMensual=monto/periodo;
        System.out.printf("pago por meses : "+pagoMensual);
        System.out.printf("Pago mensual de intereses : "+inte);

    }
            }