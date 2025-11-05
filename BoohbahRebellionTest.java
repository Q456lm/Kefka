public class BoohbahRebellionTest {
    public static void main(String[] args) {
        SupremeBoohbah[] boohbahs = {new Humbah(), new Zumbah(),new Jumbah(), new Jingbah()};

        System.out.println("---Overloaded Commands---");

        for(Boohbah booh:boohbahs){
            booh.command();
        }

        
    }
}
