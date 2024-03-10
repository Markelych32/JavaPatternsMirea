package practice8.template;

public class NewsPage extends WebsiteTemplate {
    @Override
    public void showContent() {
        System.out.println("News");
    }

    public void showPage() {
        System.out.println("Header");
        System.out.println("News");
        System.out.println("Footer");
    }
}
