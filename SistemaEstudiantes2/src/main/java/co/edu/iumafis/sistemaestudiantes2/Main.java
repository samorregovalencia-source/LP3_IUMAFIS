package co.edu.iumafis.sistemaestudiantes2;

public class Main {

    public static void main(String[] args) {
        //laucnEjercicio4();
    }
    
    import java.util.ArrayList;
    
    ArrayList<String> estudiantes = new ArrayList<>();
    ArrayList<Double> promedios = new ArrayList<>();
    
    estudiantes.add("Laura"); promedios.add(4.2);
    estudiantes.add("Andres"); promedios.add(2.8);
    estudiantes.add("Camila"); promedios.add(3.5);
    estudiantes.add("Diego"); promedios.add(1.9);
    estudiantes.add("Sofia"); promedios.add(4.7);
    
    System.out.println("== reporte de notas ==");
    int aprobados = 0;
    int reprobados = 0;
    
    for (int i = 0; i estudiantes.size(); i++){
         String nombre = estudiantes.get(i);
         double promedio = promedios.get(i);
         
         String estado = (promedio >= 3.0) ? "✓ APROBADO" : "✗ REPROBADO";
         
         System.out.printf(" %-10s %.1f %s%n", nombre, promedio, estado);
         
         if (promedio >= 3.0) aprobados++;
         else                 reprobados++;
         
}
    System.out.printf("%nAprobados: %d | Reprobados: %d%n", aprobados, reprobados);
    

    private static void laucnEjercicio4() {
        //lauchEjercicio1();
        
        //launchEjercicio2();

        //launchEjercicio3();
        
        String nombre = "Laura Gomez";
        double promedio = 3.6;
        boolean activo = true;
        int semestre = 5;
        int materias = 4;
        int maxMat = 6;
        
        if (activo && promedio >= 3.0 && materias <= maxMat){
            System.out.println(nombre + ": inscripción autorizada");
            System.out.printf(" Promedio: %.1f | Semestre: %d | Materias: %d%n",
                    promedio, semestre, materias);
        } else if (!activo){
            System.out.println(nombre + ": rechazada - estudiante inactivo");
        } else if (promedio < 3.0){
            System.out.println(nombre + ": rechazada - promedio insuficiente ("
                    + promedio + ")");
        } else {
            System.out.println(nombre + ": rechazada - excede maximo de materias");
        }
    }

    private static void launchEjercicio3() {
        int Semestre = 5;
        
        String ciclo = switch (Semestre) {
            case 1, 2 ->
                "Ciclo basico";
            case 3, 4 ->
                "Ciclo intermedio";
            case 5, 6 ->
                "Ciclo profesional";
            case 7, 8 ->
                "Ciclo de profundización";
            case 9, 10 ->
                "Ciclo de grado";
            default ->
                "Semestre no válido";
        };

        System.out.println("Semestre " + Semestre + ": " + ciclo);

        switch (Semestre) {
            case 1: case 2:
                System.out.println("Ciclo basico");
                break;
            case 5:
                System.out.println("Ciclo profesional");
                break;
            default:
                System.out.println("Otro semestre");
        }
    }

    private static void launchEjercicio2() {
        double nota = 3.8;
        String estado;
        
        // if evalua una condición booleana (true/false)
        if (nota >= 4.5) {
            estado = "Sobresaliente";
        } else if (nota >= 4.0) {
            estado = "Bueno";
        } else if (nota >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
        System.out.println("Nota: " + nota + "->" + estado);
    }

    private static void lauchEjercicio1() {
        // Declaración e inicialización
        String nombre = "Laura Gomez";
        int codigo = 20241001;
        int semestre = 5;
        double promedio = 4.2;
        boolean activo = true;
        
        // Impresión con concatenación
        System.out.println("Nombre : " + nombre);
        System.out.println("Codigo : " + codigo);
        System.out.println("Semestre : " + semestre);
        System.out.println("Promedio : " + promedio);
        System.out.println("Activo : " + activo);
        
        // Printf para formato preciso
        System.out.printf("Promedio formateado: %.2f%n", promedio);
    }
}
