//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class SampleTest {
//@Test
//    public void verify() {
//    WebDriver driver = new ChromeDriver();
//    Sample sample= new Sample(driver);
//    sample.verifyDetails();
//}
//
//    @Test
//    public void verifyMap(){
//    Map<String, String> details= new HashMap<>();
//        details.put("Name","Ram");
//        details.put("Class","Shyam");
//        System.out.println("======Print keys");
//        Set<String> keys = details.keySet();
//        for(String keyValues: keys){
//            System.out.println(keyValues);
//        }
//        System.out.println("======Print values");
//        Collection<String> values = details.values();
//        for(String value: values){
//            System.out.println(value);
//        }
//        System.out.println("======Print entries");
//        Set<Map.Entry<String, String>> entries = details.entrySet();
//        for(Map.Entry<String,String> entry: entries){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//    }
//}
