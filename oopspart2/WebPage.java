public class WebPage implements Searchable{
    private String url;
    private String htmlContent;
    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }
    @Override
    public boolean search(String keyword) {
        return htmlContent.contains(keyword);
    }
}
