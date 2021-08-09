package enums;

public enum PageInfo {
    SPARK_URL("https://sparkjava.com/"),
    MAIN_TEXT("Documentation"),
    TITLE_TEXT("Documentation - Spark Framework: An expressive web framework for Kotlin and Java");

    private String info;

    PageInfo(String info){this.info = info;}

    public String getInfo(){return info;}
}
