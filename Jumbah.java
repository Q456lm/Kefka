public class Humbah extends SupremeBoohbah{
    public Humbah(){
        super();
        name = "Jumbah";
        System.out.println(name+"will not obey.");
    }

    @Override
    public void command(){
        super.command("...");
        System.out.println(name+"does not follow any orders.");
    }
}
