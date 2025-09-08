public class kernel_module_main {
    private interface PCPrinter {
        String print(PC pc);
    }

    private static final PCPrinter printPC = (PC pc) -> {
        return "This PC has this specs" + pc.getConfiguration() + "\nTotal price is " + pc.getTotalPrice() + " €";
    };

    public static void main(String[] args) {
        PC myPC = new PC(new AMDProcessor(), new Res4KScreen());
        System.out.println(printPC.print(myPC));

        PC myFriendPC = new PC(new IntelProcessor(), new ResFullHDScreen());
        System.out.println(printPC.print(myFriendPC));
    }
}