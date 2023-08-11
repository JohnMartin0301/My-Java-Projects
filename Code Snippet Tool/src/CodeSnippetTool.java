import java.util.*;

class CodeSnippet {
    String code;
    String category;
    List<String> keywords;

    public CodeSnippet(String code, String category, List<String> keywords) {
        this.code = code;
        this.category = category;
        this.keywords = keywords;
    }
}

class CodeSnippetManager {
    Map<String, List<CodeSnippet>> snippetMap;

    public CodeSnippetManager() {
        snippetMap = new HashMap<>();
    }

    public void addSnippet(CodeSnippet snippet) {
        String category = snippet.category;
        snippetMap.putIfAbsent(category, new ArrayList<>());
        snippetMap.get(category).add(snippet);
    }

    public List<CodeSnippet> searchByKeyword(String keyword) {
        List<CodeSnippet> result = new ArrayList<>();
        for (List<CodeSnippet> snippets : snippetMap.values()) {
            for (CodeSnippet snippet : snippets) {
                if (snippet.keywords.contains(keyword)) {
                    result.add(snippet);
                }
            }
        }
        return result;
    }

    public List<CodeSnippet> retrieveSnippetsByCategory(String category) {
        return snippetMap.getOrDefault(category, new ArrayList<>());
    }
}

public class CodeSnippetTool {
    public static void main(String[] args) {
        CodeSnippetManager manager = new CodeSnippetManager();

        CodeSnippet snippet1 = new CodeSnippet(
            "System.out.println(\"Hello, world!\");", // "Hello, world!" as an example
            "Java",
            Arrays.asList("print", "hello", "world")
        );
        manager.addSnippet(snippet1);

        CodeSnippet snippet2 = new CodeSnippet(
            "for (int i = 0; i < 10; i++) {\n    System.out.println(i);\n}",
            "Java",
            Arrays.asList("loop", "print", "numbers")
        );
        manager.addSnippet(snippet2);

        // Search for snippets by keyword
        List<CodeSnippet> searchResults = manager.searchByKeyword("print");
        System.out.println("Search Results:");
        for (CodeSnippet snippet : searchResults) {
            System.out.println("Category: " + snippet.category);
            System.out.println(snippet.code);
        }

        // Retrieve snippets by category
        List<CodeSnippet> javaSnippets = manager.retrieveSnippetsByCategory("Java");
        System.out.println("Java Snippets:");
        for (CodeSnippet snippet : javaSnippets) {
            System.out.println("Category: " + snippet.category);
            System.out.println(snippet.code);
        }
    }
}
