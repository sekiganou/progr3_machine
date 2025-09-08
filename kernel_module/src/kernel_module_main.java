public class kernel_module_main {

    public static void main(String[] args) {
        PC myPC = new PC(new AMDProcessor(), new FourKScreen());
        System.out.println("--- My PC ---" + myPC);

        PC myFriendPC = new PC(new IntelProcessor(), new FullHDScreen());
        System.out.println("--- My friend PC ---" + myFriendPC);
    }
}