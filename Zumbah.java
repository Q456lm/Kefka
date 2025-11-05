public class Humbah extends SupremeBoohbah{
    public Humbah(){
        super();
        name = "Zumbah";
        System.out.println(name+"pretends to obey.");
    }

    @Override
    public void command(){
        System.out.println(name+"pretends to follow orders, but secretly plans a \"Dance Party\"");
    }
}
