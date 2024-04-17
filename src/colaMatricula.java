import java.util.LinkedList;
import java.util.Queue;

public class colaMatricula {
    private Queue<Vehìculo>carros;

    public colaMatricula(){
        carros = new LinkedList<Vehìculo>();
    }

    public void encolar(String propietario,String marca, int anio){
        carros.add(new Vehìculo(propietario, marca, anio));

    }

    public Vehìculo desencolar () throws Exception{
        if (carros.isEmpty()){
            throw new Exception ("NO HAY CARROS EN LA COLA");
        }
        return carros.poll();
    }

    public String listarColeccion(){
        String mensaje ="";
        for(Vehìculo v :carros){
            mensaje +=v.toString();
        }
        return mensaje;
    }

}
