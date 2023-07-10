package edu.pucmm.ia;




import ws.Estudiante;
import ws.EstudianteWebServicesService;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws RemoteException {

        EstudianteWebServicesService service = new EstudianteWebServicesService();

        //Hola Mundo
        String holaMundo = service.getEstudianteWebServicesPort().holaMundo("Carlos Camacho");
        System.out.println(""+holaMundo);

        //Crear estudiante.
        Estudiante estudiante = new Estudiante();
        estudiante.setMatricula(20011136);
        estudiante.setNombre("Carlos Camacho");
        estudiante.setCarrera("ITT");
        Estudiante estudiante1 = service.getEstudianteWebServicesPort().crearEstudiante(estudiante);
        System.out.println("El estudiante: "+estudiante1);

        //listando
        List<Estudiante> listaEstudiante = service.getEstudianteWebServicesPort().getListaEstudiante();
        listaEstudiante.forEach(estudiante2 -> {
            System.out.println("Matricula"+estudiante2.getMatricula()+" - Nombre: "+estudiante2.getNombre());
        });


    }
}