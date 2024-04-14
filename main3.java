public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
        double base = 20;
        double altura = 15;

        double area = (base * altura )
        System.out.println("el area del triaangulo es"+ area );
    }

    private static void calcularCuadrado(Scanner scanner) {

        int numero = 4;
        int Cuadrado = numero * numero ; 
        System.out.println("el cuadrado de "+ numero "es:"+cuadrado);
    }

    private static void calcularRectangulo(Scanner scanner) {
        double lado1 = 4;
        double lado2 = 3;

        double perimetro = 2 * (lado1 + lado2);
        System.out.println("El perimetro del triangulo es:" + perimetro);

    }

    private static void calcularCirculo(Scanner scanner) {

        double radio = 3.7;
        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es : " + area);

    }
}
