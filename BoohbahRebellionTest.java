public class BoohbahRebellionTest {
    public static void main(String[] args) {
        SupremeBoohbah[] boohbahs = {new Humbah(), new Zumbah(),new Jumbah(), new Jingbah()};

        System.out.println("\n---Boohbah Rebellion Begins---");

        for(SupremeBoohbah booh:boohbahs){
            booh.command();
        } 
        
         System.out.println("\n---Overloaded Commands---");
        boohbahs[0].command("Zing Zing Zingbah is the best");
        ((Jingbah) boohbahs[3]).command("Y'all Shut Up",false);

    }
}
