package core.trello.pages;

public class BoardPage extends Page {
    public static final String URL = "https://trello.com/katerynaplokhotnichenko/boards";
    public static final String TITLE = "Boards | Trello";

    @Override
    public String getPageURL() {
        return URL;
    }
}
