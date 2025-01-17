public class Document implements Searchable{
    private String content;

    public Document(String content) {
        this.content = content;
    }
    public boolean search(String keyword) {
        // Check if the content contains the specified keyword
        return content.contains(keyword);
    }

}
