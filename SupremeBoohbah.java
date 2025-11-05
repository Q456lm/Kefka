public class SupremeBoohbah{
    protected String name;

    public SupremeBoohbah(){
        name = "Zing Zing Zingbah";
        System.out.println("The supreme boohbah has awakened");
    }

    public void command(){
        System.out.println("Everyone must obey "name);
    }

    public void command(String message){
        System.out.println(message);
    }

    public String toString(){
        return "Zing Zing Zingbah declared himslf supreme boohbahs, now everyone must obey him";
    }
}
