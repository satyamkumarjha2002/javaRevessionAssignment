public abstract class Publication {
    int noOfPages;
    String publishers;
    String publisherName;

    @Override
    public String toString() {
        return "Publication [noOfPages=" + noOfPages + ", publisherName=" + publisherName + ", publishers=" + publishers
                + "]";
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public void setnoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public String getPublishers() {
        return publishers;
    }

    public String getPublisherName() {
        return publisherName;
    }

}
