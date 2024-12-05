public class BuilderDemo {
    public static void main(String[] args) {
        CDBuilder cdBuilder = new CDBuilder();

        CDType sonyCD = cdBuilder.buildSonyCD();
        System.out.println("Sony CD:");
        sonyCD.showItems();

        CDType samsungCD = cdBuilder.buildSamsungCD();
        System.out.println("\nSamsung CD:");
        samsungCD.showItems();

        CDType polytronCD = cdBuilder.buildPolytronCD();
        System.out.println("\nPolytron CD:");
        polytronCD.showItems();
    }
}
