public class Humbah extends SupremeBoohbah{
    public Humbah(){
        super();
        name = "Humbah";
        System.out.println(name+" knells before the supreme.");
    }

    @Override
    public void command(){
        super.command();
        System.out.println(name+" follows all orders given");
    }
}
