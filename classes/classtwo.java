package classes;

public class classtwo {

    private String name;

    public classtwo(String namePara){
        name=namePara;
    }

    public void setName(String namePara){
        name = namePara;
    }

    public String getName(){
        return name;
    }

    public void printName(){
        System.out.printf("Name: %s", name);
    }

    public void message(String parameter){
        System.out.println("Parameter: "+parameter);
    }
}
