import java.util.*;

public class SimpleSearchEngine {
    private Map<String, List<Integer>> index; 

    public SimpleSearchEngine() {
        index = new HashMap<>();
    }

    // Indexing documents
    public void indexDocument(int documentId, String[] words) {
        for (String word : words) {
            word = word.toLowerCase();
            if (!index.containsKey(word)) {
                index.put(word, new ArrayList<>());
            }
            if (!index.get(word).contains(documentId)) {
                index.get(word).add(documentId);
            }
        }
    }

    // Searching for a query
    public List<Integer> search(String query) {
        query = query.toLowerCase();
        if (index.containsKey(query)) {
            return index.get(query);
        } else {
            return Collections.emptyList();
        }
    }

    public static void main(String[] args) {
        SimpleSearchEngine searchEngine = new SimpleSearchEngine();

        // Sample documents
        String[] document1 = {"apple", "banana", "orange"};
        String[] document2 = {"apple", "grape", "banana"};
        String[] document3 = {"orange", "watermelon"};

        // Indexing documents
        searchEngine.indexDocument(1, document1);
        searchEngine.indexDocument(2, document2);
        searchEngine.indexDocument(3, document3);

        // Searching for terms
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search term: ");
        String searchTerm = scanner.nextLine();

        List<Integer> searchResults = searchEngine.search(searchTerm);
        if (!searchResults.isEmpty()) {
            System.out.println("Documents containing '" + searchTerm + "': " + searchResults);
        } else {
            System.out.println("No documents found containing '" + searchTerm + "'");
        }
    }
}

