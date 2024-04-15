class Card {
    private String frontContent;
    private String backContent;
    private String subject;

    // constructor
    public Card(String subject, String frontContent, String backContent) {
        this.subject = subject;
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
    public String getSubject() {
        return subject;
    }


    // setter
    public void setFrontContent(String frontContent) {
        this.frontContent = frontContent;
    }
    public void setBackContent(String backContent) {
        this.backContent = backContent;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

}