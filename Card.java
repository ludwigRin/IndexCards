public abstract class Card {
    private String frontContent;
    private String backContent;

    // constructor
    public Card(String frontContent, String backContent) {
        this.frontContent = frontContent;
        this.backContent = backContent;
    }

    // getter
    public String getFrontContent() {
        return frontContent;
    }
    public String getBackContent() {
        return backContent;
    }

    // setter
    public void setFrontContent(String frontContent) {
        this.frontContent = frontContent;
    }
    public void setBackContent(String backContent) {
        this.backContent = backContent;
    }
}