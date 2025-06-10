package ValentinaDale_20210689;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Agenda {

    TreeMap<Integer, Contacto> lista = new TreeMap<>();
    public static int IDcontacto = 1;

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        int continuar=1;

        do{
            System.out.println("--------BIENVENIDO A LA AGENDA--------");
            System.out.println("Opciones disponibles a realizar: (Ingresar numero de la opcion)");
            System.out.println("1 - Agregar contacto");
            System.out.println("2 - Mostrar contactos");
            System.out.println("3 - Buscar contacto por nombre");
            System.out.println("4 - Eliminar contacto");
            System.out.println("5 -  Salir");
            int eleccion = Integer.parseInt(sc.nextLine());

            switch (eleccion){
                case 1:
                    System.out.println("Ingrese el nombre del contacto");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el apellido del contacto");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese el numero de telefono del contacto");
                    String telefono = sc.nextLine();
                    System.out.println("Ingrese el correo del contacto");
                    String correo = sc.nextLine();
                    Contacto contacto = new Contacto(nombre, apellido, telefono, correo);
                    agenda.AgregarContacto(contacto);
                    System.out.println("Contacto agregado correctamente");
                    break;

                case 2:
                    System.out.println("Contactos existentes: ");
                    agenda.MostrarContactos();
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del contacto que desea buscar:");
                    String nombre2 = sc.nextLine();
                    agenda.Buscar(nombre2);
                    break;

                case 4:
                    agenda.MostrarContactos();
                    System.out.println("Ingrese el ID del contacto que desea eliminar:");
                    int id2 = Integer.parseInt(sc.nextLine());
                    agenda.Eliminar(id2);
                    agenda.MostrarContactos();
                    break;

                case 5:
                    System.out.println("Bye bye, gracias por usar nuestros servicios");
                    continuar = 2;
                    break;
            }

        }while(continuar == 1);

    }

    public void AgregarContacto(Contacto contacto){

        lista.put(IDcontacto, contacto);
        IDcontacto++;

    }

    public void MostrarContactos(){

        for (Map.Entry<Integer, Contacto> entrada : lista.entrySet()){
            System.out.println("ID: " + entrada.getKey() + ", Contacto: " + entrada.getValue());
        }

    }

    public void Buscar(String nombre){

        for (Contacto value : lista.values()){
            if(value.getNombre().equals(nombre)){
                System.out.println("El nombre '"+nombre+"' si se encontro en la agenda");
            }else{
                System.out.println("El nombre "+nombre+" no se encontro en la agenda");
            }
        }

    }

    public void Eliminar(int id){
        lista.remove(id);
    }
}