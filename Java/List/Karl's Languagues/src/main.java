import java.util.ArrayList;

public class main {

    static ArrayList<String> cars = new ArrayList<String>();
    
    public static void main(String[] args) {
       LanguageList list = new LanguageList();
       
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        LanguageList.addLanguage("esp20");
        LanguageList.addLanguage("esp2");
        LanguageList.addLanguage("esp3");

        System.out.println(cars.size());
    }

}

