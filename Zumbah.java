public class Zumbah extends SupremeBoohbah{
    public Zumbah(){
        super();
        name = "Zumbah";
        System.out.println(name+" pretends to obey.");
    }

    @Override
    public void command(){
        System.out.println(name+" pretends to follow orders, but secretly plans a \"Dance Party\"");
    }
}
