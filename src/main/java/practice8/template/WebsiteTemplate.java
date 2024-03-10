package practice8.template;

public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    protected abstract void showContent();
}
