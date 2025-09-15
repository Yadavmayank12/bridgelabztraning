class NullPointerDemo {
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }
    public static void main(String[] args) {
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        handleException();
    }
}