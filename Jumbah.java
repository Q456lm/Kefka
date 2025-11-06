public class Jumbah extends SupremeBoohbah{
    public Jumbah(){
        super();
        name = "Jumbah";
        System.out.println(name+" will not obey.");
    }

    @Override
    public void command(){
        super.command("...");
        System.out.println(name+" does not follow any orders.");
    }
}
