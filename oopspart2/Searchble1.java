public class Searchble1 {
    public static void main(String[] args){
        Document document = new Document("This is a sample document.");

        // Search for a keyword in the document and store the result
        boolean documentContainsKeyword = document.search("sample");

        // Print whether the document contains the keyword
        System.out.println("Document contains keyword 'sample': " + documentContainsKeyword);

        // Create an instance of the WebPage class with a sample URL and HTML content
        WebPage webPage = new WebPage("https://www.w3resource.com", "This is a sample webpage.");

        // Search for a keyword in the webpage and store the result
        boolean webPageContainsKeyword = webPage.search("webpage");

        // Print whether the webpage contains the keyword
        System.out.println("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
    }

}
