import java.util.Scanner;
public class menufinal {
    public static void main(String[] args) {
        String opcion="0";
        while(!opcion.equals("6")){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Menu del proyecto final de Fundamentos De Computacion I\nDesarrollado por Jeús Villa ");
        System.out.println("Version 1.0");
        System.out.println("menu principal");
        System.out.println("""
        Menu principal
        1.- IfTriangulos
        2.- For Padovan
        3.- While sumatoria 1/1+1/2+....+1/n
        4.- Do conjetura de collatz
        5.- Rotar arreglo
        6.- bye bye
        """);
        opcion=System.console().readLine("\nQue programa te gustaria hacer?? rapidito");
        switch (opcion) {
            case "1": 
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Triangulos");
            triangulos();

                break;
            case "2": 
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Padovan");
            padovan();
            System.console().readLine("Presione Enter para continuar");
                break;
            case "3": 
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("While sumatoria fraccional");
            System.console().readLine("Presione Enter para continuar");
            sumatoria();
                break;
            case "4": 
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Conjetura de collatz");
            System.console().readLine("Presione Enter para continuar");
            collatz();
                break;
            case "5": 
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("arreglo que se recorre");
            System.console().readLine("Presione Enter para continuar");
            recorrer();
                break;
            case "6": 
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Gracias por usar el sistema");
                 break;    
            default:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\nNo disponible");
            System.console().readLine("Presione Enter para continuar");
                break;
        }
    }
    }
    static void triangulos(){
        Scanner leer = new Scanner(System.in);
        String opc="s";
        System.out.println("Sistema para determinar si tres longitudes cumplen con ser un triangulo");
        while (opc.equals("s")) {
        float lado1 = Float.parseFloat(System.console().readLine("Ingrese el lado 1: "));
        if (lado1 > 0) {
            float lado2 = Float.parseFloat(System.console().readLine("Ingrese el lado 2: "));
            if (lado2 > 0) {
                float lado3 = Float.parseFloat(System.console().readLine("Ingrese el lado 3: "));
                if (lado3 > 0) {
                    System.out.println("Todas las medidas son positivas ");
                    float mayor = lado1;
                    if (mayor < lado2) {
                        mayor = lado2;
                    }
                    if (mayor < lado3) {
                        mayor = lado3;
                    }
                    System.out.println("El lado mayor es: " + mayor);
                    if (mayor<=lado1+lado2+lado3-mayor) {
                        System.out.println("Si soy un triangulo");
                        System.out.println("Por que se cumple que "+mayor+" <= "+(lado1+lado2+lado3-mayor));
                        if (lado1==lado2 && lado2==lado3) {
                            System.out.println("EQUILATERO");
                        } else if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
                            System.out.println("ESCALENO");
                        }else{
                            System.out.println("ISOCELES");
                        }
                    }else{
                        System.out.println("Con esas medidas no es posible formar un triangulo");
                    }
                } else {
                    System.out.println("Error en la longitud 3");
                }
            } else {
                System.out.println("Error al leer la longitud 2 ");
            }
        } else {
            System.out.println("Error en la longitud");
        }
        System.out.println("Otra ves: s/n");
        opc=leer.next();
    }
    //leer.close();
    }
    static void padovan(){
        Scanner leer=new Scanner(System.in);
        String opc="s";
        while (opc.equals("s")) {
        int p1=1,p2=1,p3=1,pn;
        System.out.println("Desarrollado por Jesús Villa");
        System.out.println("programa que muestra la secuencia de padovan");
        int limite = Integer.parseInt(System.console().readLine("Ingrese el limite de la susesión: "));
        for (; p1 <=limite;) {
            System.out.print(p1+ ", ");
            pn=p1+p2;
            p1=p2;
            p2=p3;
            p3=pn;
            
        }if (limite==p1-1) {
            System.out.print(p1+".");
            } 
            System.out.println("\notra vez s/n");
            opc =leer.next();
        }
    }
    static void sumatoria(){
                Scanner leer = new Scanner(System.in);
                String opc = "s";
        
                while (opc.equals("s")) {
                    try {
                        System.out.print("Escriba el número para sumatoria: ");
                        int limite = leer.nextInt();
        
                        if (limite <= 0) {
                            System.out.println("Por favor ingresa un número mayor que 0.");
                            continue;
                        }
        
                        double suma = 0;
                        System.out.print("Σ = ");
                        for (int i = 1; i <= limite; i++) {
                            suma += 1.0 / i;
                            if (i == limite) {
                                System.out.print("1/" + i + ".");
                            } else {
                                System.out.print("1/" + i + " + ");
                            }
                        }
        
                        System.out.println("\nResultado: " + suma + ".");
                        System.out.print("¿Otra vez (s/n)? ");
                        opc = leer.next().toLowerCase();
                    } catch (Exception e) {
                        System.out.println("Entrada inválida. Por favor intenta de nuevo.");
                        leer.nextLine();
                    }
                }
        
                //leer.close();
            }
    static void collatz(){
        Scanner scanner = new Scanner(System.in);
        String opc;

        do {
            try {
                System.out.print("Ingresa un número entero positivo: ");
                int n = Integer.parseInt(scanner.nextLine());

                if (n <= 0) {
                    throw new IllegalArgumentException("El número debe ser mayor a 0.");
                }

                System.out.println("Secuencia de Collatz para " + n + ":");
                while (n != 1) {
                    System.out.print(n + " ");
                    if (n % 2 == 0) {
                        n /= 2;
                    } else {
                        n = 3 * n + 1;
                    }
                }
                System.out.println(n);

            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número entero válido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("¿Quieres intentar con otro número? (s/n): ");
            opc = scanner.nextLine().toLowerCase();

        } while (opc.equals("s"));

        System.out.println("Programa terminado.");

    }
    static void recorrer(){
        while (true) {
            int[] arreglo = new int[10];
            int k = 0;
            for (int i = 0; i < 10; i++) {

                try {
                    arreglo[i] = Integer.parseInt(System.console().readLine("Arreglo [" + i + "]= "));
                } catch (Exception e) {
                    System.out.println("solo numeros enteros");
                    i--;
                }
            }
            System.out.println("\nArreglo antes de desplazamiento \n");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Arreglo [" + i + "]= " + arreglo[i]);
            }
            while (true) {
                try {
                    k = Integer.parseInt(System.console().readLine("\nEl desplazamiento es: "));
                    if (k < 0) { //k es el desplazamiento
                        continue;
                    } else break;

                } catch (Exception e) {
                    System.out.println("solo numeros enteros o mayores a 0");
                }
                k %= 10;
            }
            System.out.println("Vamos a desplazar " + k + " posisciones.\n");
            String desplazamiento_s = String.valueOf(k);
            k = Integer.parseInt(desplazamiento_s.charAt(desplazamiento_s.length() - 1) + "");
            System.out.println(k);
            System.out.println("Arreglo desplazado\n");
            for (int i = 0; i < k; i++) {
                int ultimo = arreglo[9];
                System.arraycopy(arreglo, 0, arreglo, 1, 9);
                arreglo[0] = ultimo;
            }
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Arreglo [" + i + "]= " + arreglo[i]);
            }
            String repetir;
            while (true) {
                repetir = System.console().readLine("\n¿Deseas repetir? (s/n): ");
                if (repetir.equalsIgnoreCase("s") || repetir.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Por favor ingresa 's' para sí o 'n' para no.");
                }
            }

            if (repetir.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}