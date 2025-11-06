public class Jingbah extends SupremeBoohbah{
    public Jingbah(){
        super();
        name = "Zumbah";
        System.out.println(name+" trys to keep the peace.");
    }

    @Override
    public void command(){
        System.out.println(name+" exclaims, please no more fighting");
    }

    public void command(String message,boolean whisper){
        if(whisper){
            System.out.println(message.toLowerCase());
        }else{
            System.out.println(message.toUpperCase());
        }
    }
}
