
public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        do{
            System.out.println("1. Clase Punto");
            System.out.println("2. Clase Persona");
            System.out.println("3. Clase Rectángulo");
            opcion = Leer.leerEntero("Introduce una opción");
            switch(opcion){
                case 1:
                    Punto p1 = new Punto();
                    p1.x = 5;
                    p1.y = 0;
                    Punto p2 = new Punto();
                    p2.x = 10;
                    p2.y = 10;
                    Punto p3  = new Punto();
                    p3.x = -3;
                    p3.y = 7;
            }
        }while(opcion!=-1);
    }
}