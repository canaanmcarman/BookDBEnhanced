public class BookClass {
    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String SKU;
    private double bookPrice;
    private boolean isInStock;

    public BookClass() {

    }

    public BookClass(String bookTitle, String bookAuthor, String bookDescription, double bookPrice, boolean isInStock) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookDescription = bookDescription;
        this.bookPrice = bookPrice;
        this.isInStock = isInStock;

    }

    public BookClass(String SKU) {
        this.SKU = SKU;
        if (SKU.equalsIgnoreCase("Java1001")) {
            this.bookTitle = "Head First Java";
            this.bookAuthor = "Kathy Sierra and Bert Bates";
            this.bookDescription = "Easy to read Java workbook";
            this.bookPrice = 47.50;

        } else if (SKU.equalsIgnoreCase("java1002")){
            this.bookTitle = "Thinking in Java";
            this.bookAuthor = "Bruce Eckel";
            this.bookDescription = "Details about Java under the hood";
            this.bookPrice = 20.00;

        }else if (SKU.equalsIgnoreCase("Orcl1003")){
            this.bookTitle = "OCP: Oracle Certified Professional JAVA SE";
            this.bookAuthor = "Jeanne Boyarsky";
            this.bookDescription = "DEverything you need to know in one place";
            this.bookPrice = 45.00;

        } else if (SKU.equalsIgnoreCase("Python1004")){
            this.bookTitle = "Automate the boring stuff with Python";
            this.bookAuthor = "Al Sweigart";
            this.bookDescription = "Fun with Python";
            this.bookPrice = 10.50;

        }else if (SKU.equalsIgnoreCase("Zombie1005")) {
            this.bookTitle = "The Maker's Guide to the Zombie Apocalypse";
            this.bookAuthor = "Simon Monk";
            this.bookDescription = "Defend Your Base with Simple Circuits, Arduino, and Raspberry pi";
            this.bookPrice = 16.50;

        }else if (SKU.equalsIgnoreCase("Rasp1006")){
            this.bookTitle = "\tRaspberry Pi Projects for the Evil Genius";
            this.bookAuthor = "Donald Norris";
            this.bookDescription = "A dozen fiendishly fun projects for the Raspberry Pi!";
            this.bookPrice = 14.75;

        }}


    public String getDisplayText() {
        String bookAuthor = this.bookAuthor;
        String bookTitle = this.bookTitle;
        String bookDescription = this.bookDescription;

        String displayText = "Title: " + bookTitle + "\nAuthor: " + bookAuthor + "\n\nDescription: " + bookDescription;
        return displayText;
    }

    public double totalPrice(double bookNum) {
        double totalPrice = 0;
        totalPrice = bookNum * bookPrice;
        return totalPrice;

    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookDescription(String bookDescription) {
        return this.bookDescription;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public double getBookPrice() {
        return this.bookPrice;
    }

    public void setIsInStock(boolean isInStock) {
        this.isInStock = isInStock;
    }

    public boolean isInStock() {
        return this.isInStock;
    }
}




