package Ejercicio;

 import java.util.Scanner;

public class NominaEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sueldos base según el cargo
        double sueldoBaseJunior = 950;
        double sueldoBaseSenior = 1200;
        double sueldoBaseJefe = 1600;
        
        // Solicitar el cargo del empleado
        System.out.println("Seleccione el cargo del empleado:");
        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = scanner.nextInt();
        
        // Determinar sueldo base según el cargo
        double sueldoBase;
        if (cargo == 1) {
            sueldoBase = sueldoBaseJunior;
        } else if (cargo == 2) {
            sueldoBase = sueldoBaseSenior;
        } else if (cargo == 3) {
            sueldoBase = sueldoBaseJefe;
        } else {
            System.out.println("Cargo no válido.");
            scanner.close();
            return;
        }
        
        // Solicitar los días de viaje
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasViaje = scanner.nextInt();
        
        // Solicitar el estado civil
        System.out.println("Seleccione su estado civil:");
        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        System.out.print("Introduzca su estado civil (1 - 2): ");
        int estadoCivil = scanner.nextInt();
        
        // Calcular dietas y sueldo bruto
        double dietas = diasViaje * 30;
        double sueldoBruto = sueldoBase + dietas;
        
        // Calcular retención IRPF
        double retencionIRPF = (estadoCivil == 1) ? sueldoBruto * 0.25 : sueldoBruto * 0.20;
        
        // Calcular sueldo neto
        double sueldoNeto = sueldoBruto - retencionIRPF;

        // Mostrar la nómina desglosada
        System.out.println("=================================");
        System.out.printf("Sueldo base: \t\t\t %.2f €\n", sueldoBase);
        System.out.printf("Dietas ( %d días): \t\t %.2f €\n", diasViaje, dietas);
        System.out.println("---------------------------------");
        System.out.printf("Sueldo bruto: \t\t\t %.2f €\n", sueldoBruto);
        System.out.printf("Retención IRPF (%.0f%%): \t %.2f €\n", (estadoCivil == 1 ? 25 : 20), retencionIRPF);
        System.out.println("---------------------------------");
        System.out.printf("Sueldo neto: \t\t\t %.2f €\n", sueldoNeto);
        System.out.println("=================================");

        // Cerrar el scanner
        scanner.close();
    }
}

