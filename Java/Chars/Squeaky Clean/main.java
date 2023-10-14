public class main {

    public static void main(String[] args) {
        
        String ident = "a-1C";
        String control = "my\0Id";
        String kebab = "hola-que-hace-como\t id";
        String emoji = ("a1😀2😀3😀b");
        String greek = "MyΟβιεγτFinder";


        System.out.println(SqueakyClean.clean(greek));


    }
    
}
