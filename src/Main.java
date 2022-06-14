import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Plane f18 = null;

        boolean bucle = true;

        while (bucle) {
            System.out.println("1 - Inicializar F18\n" +
                    "2 - Alternar estado de los flaps \n" +
                    "3 - Alternar estado del tren de aterrizaje\n" +
                    "4 - Armar sistema de eyección\n" +
                    "5 - Eyectar piloto (Esta opción sólo funcionará si el sistema de eyección está armado)\n" +
                    "Q - Salir.\n");

            String option = scanner.next();

            switch (option) {
                case "1":
                    System.out.println("Introduzca el número de litros de combustible cargados: ");
                    int fuelLevel = scanner.nextInt();
                    System.out.println("Introduzca apodo del piloto: ");
                    String nickname = scanner.next();
                    System.out.println("Introduzca número de escuadrón: ");
                    String squadPlate = scanner.nextLine();
                    scanner.next();
                    f18 = new Plane(fuelLevel, nickname, squadPlate);
                    f18.toggleFlaps();
                    f18.toggleLandingGear();
                    f18.ejectionSystem();
                    f18.setSeatOccupation(true);
                    System.out.println(f18);
                    break;
                case "2":
                    try {
                        f18.toggleFlaps();
                        System.out.println(f18);
                    } catch (NullPointerException n) {
                        System.out.println("No se ha encontrado el avión");
                    }
                    break;
                case "3":
                    try {
                        f18.toggleLandingGear();
                        System.out.println(f18);
                    } catch (NullPointerException n) {
                        System.out.println("No se ha encontrado el avión");
                    }
                    break;
                case "4":
                    try {
                        f18.ejectionSystem();
                        System.out.println(f18);
                    } catch (NullPointerException n) {
                        System.out.println("No se ha encontrado el avión");
                    }
                    break;
                case "5":
                    try {
                        if (f18.isEjectionSystem()){
                            f18.setSeatOccupation(false);
                            System.out.println(f18);
                        }else {
                            System.out.println("El sistema de eyección esta apagado");
                        }
                    } catch (NullPointerException n) {
                        System.out.println("No se ha encontrado el avión");
                    }
                    break;
                case "Q":
                    break;
                default:
                    System.out.printf(option + "No es una opcion del avión");
                    break;
            }
        }
    }
}
