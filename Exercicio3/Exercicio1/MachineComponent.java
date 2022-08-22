package Exercicio3.Exercicio1;

public abstract class MachineComponent {
    private String name;
    
    public abstract int getMachineCount();
    
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
}