
public class Main {
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("1. Clase Punto");
            System.out.println("2. Clase Persona");
            System.out.println("3. Clase Rectángulo");
            System.out.println("-1. Salir");
            opcion = Leer.leerEntero("Introduce una opción: ");
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
                    System.out.println("Coordenadas del punto 1: "+p1.x+" "+p1.y);
                    System.out.println("Coordenadas del punto 2: "+p2.x+" "+p2.y);
                    System.out.println("Coordenadas del punto 3: "+p3.x+" "+p3.y);
                    System.out.println("Aplicando cambios...");
                    p1.x += 5;
                    p1.y -= 3;
                    p2.x *= 2;
                    p2.y -=2;
                    p3.x += 2;
                    p3.y *= -2;
                    System.out.println("Coordenadas del punto 1: "+p1.x+" "+p1.y);
                    System.out.println("Coordenadas del punto 2: "+p2.x+" "+p2.y);
                    System.out.println("Coordenadas del punto 3: "+p3.x+" "+p3.y);
                    break;
                case 2:
                    Persona h1 = new Persona();
                    Persona h2 = new Persona();
                    Persona [] personas = new Persona[]{h1,h2};
                    for (int i = 0;i < personas.length;i++){
                        personas[i].dni= Leer.leerTexto("Introduce el dni de la persona "+(i+1)+": ");
                        personas[i].nombre = Leer.leerTexto("Introduce el nombre de la persona "+(i+1)+": ");
                        personas[i].apellidos = Leer.leerTexto("Introduce los apellidos de la persona "+(i+1)+": ");
                        personas[i].edad = Leer.leerEntero("Introduce la edad de la persona "+(i+1)+": ");
                    }
                    for(Persona p:personas){
                        String estado = (p.edad>=18) ? "mayor":"menor";
                        System.out.println(p.nombre+" "+p.apellidos+" con DNI "+p.dni+" es "+estado+" de edad");
                    }
                    break;
                case 3:
                    Rectangulo r1 = new Rectangulo();
                    r1.x1 = 0;
                    r1.y1 = 0;
                    r1.x2 = 5;
                    r1.y2 = 5;
                    Rectangulo r2 = new Rectangulo();
                    r2.x1 = 2;
                    r2.y1 = 3;
                    r2.x2 = 7;
                    r2.y2 = 9;
                    Rectangulo []rectangulos = new Rectangulo[]{r1,r2};
                    for(Rectangulo r:rectangulos){
                        System.out.println("Coordenadas vertice superior izquierdo:"+r.x1+" "+r.y1);
                        System.out.println("Coordenadas vertice inferior derecho: "+r.x2+" "+r.y2);
                        System.out.println("Perímetro: "+(((r.x2-r.x1)*2)+((r.y2-r.y1)*2)));
                        System.out.println("Área: "+(r.x2-r.x1)*(r.y2-r.y1));
                        System.out.println("----------");
                    }
                    r1.x1 += 4;
                    r1.y1 += 2;
                    r1.x2 += 3;
                    r1.y2 += 2;
                    r2.x1 += 4;
                    r2.y1 += 2;
                    r2.x2 += 3;
                    r2.y2 += 2;
                    System.out.println("Nuevos valores: ");
                    System.out.println("----------");
                    for(Rectangulo r:rectangulos){
                        System.out.println("Coordenadas vertice superior izquierdo:"+r.x1+" "+r.y1);
                        System.out.println("Coordenadas vertice inferior derecho: "+r.x2+" "+r.y2);
                        System.out.println("Perímetro: "+(((r.x2-r.x1)*2)+((r.y2-r.y1)*2)));
                        System.out.println("Área: "+(r.x2-r.x1)*(r.y2-r.y1));
                        System.out.println("----------");
                    }
            }
        }while(opcion!=-1);
    }
}