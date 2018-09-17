public class MainCatch {

    public MainCatch() {}

    public void main() {
        try {
            Exception exp = new Exception("new exception found");
            throw exp;
        }
        catch(Exception e) {
            System.out.println("exception was found and taken care of right away");
            e.printStackTrace();
        }
        finally {
            System.out.println("just to prove that i am here");
        }
    }

    public static void main(String[] args) {
        MainCatch mc = new MainCatch();
        mc.main();
    }
}
