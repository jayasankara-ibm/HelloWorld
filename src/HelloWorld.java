public class HelloWorld
{

    private final String message = "Hello World! Jayasankara!! Jenkins!!!";

    public HelloWorld() {}

    public static void main(String[] args) {
        message = ;
        System.out.println("Jayasankara");
        System.out.println(new HelloWorld().getMessage());
    }

    private final String getMessage() {
        return message;
    }
    
    public void testMessage() {
    	System.out.println(message);
    }
}
