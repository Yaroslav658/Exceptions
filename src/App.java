////throws: todo
//public class App {
//    public static void main(String[] args) throws Throwable {}
//}
//
////catch: todo
//public class App {
//    public static void main(String[] args) {
//        try {
//        } catch (Throwable t) {}
//    }
//}

//throw: todo
public class App {
    public static void main(String[] args) {
        // Error - потомок Throwable
        throw new Error();   // throw требуется не-null аргумент
    }
}

//

//