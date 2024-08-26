//Open/Closed Principle (OCP) states that classes should be open for extension but closed for modification.
// This means you should be able to add new functionality to a class without altering its existing code.

package SOLID;

public class Open extends SingleImpl {
    public int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
