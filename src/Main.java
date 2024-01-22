public class Main {

    public static void main(String[] args) {
        // void method can have return statement
//        if(args[0].equals("exit")) {
//            return;
//        }
        if (args.length == 0) {
            String returnedString = nameResolver(null);
            System.out.println(returnedString);
            System.out.println(nameResolver("Mickey"));
        }
    }

    static String nameResolver(String name) {
        // name = "Mickey"; is being executed when method called
        if (name != null) {
            System.out.println("Length of name is " + name.length());
        }
        if (name == "Mickey") {
            return "The name is " + name;
        } else if (name == "MickeY") {
            return "The name is now like this: " + name;
        }

        return "";
    }
}