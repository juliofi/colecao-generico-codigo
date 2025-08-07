import java.util.ArrayList;

public class ACMEestudantes<T> {
    private ArrayList<T> estudantes;


    public ACMEestudantes(){
        this.estudantes = new ArrayList<T>();
    }

    public void incluir(T estudante){
        estudantes.add(estudante);
    }

    public void listar(){
        for(T estudante : estudantes){
            System.out.println(estudante);
        }
    }
}



   
