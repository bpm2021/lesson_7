package enums;

public enum GameInfo {
    XBOX_URL("https://www.xbox.com/en-CA/"),
    EG_URL("https://www.epicgames.com/store/en-US/"),
    EG_CORRECT_GAME_NAME("Far Cry 3"),
    CORRECT_PUBLISHER_NAME("Ubisoft"),
    UNCORRECT_PUBLISHER_NAME("GSM GAME WORLD"),
    CORRECT_GAME_NAME("Fallout 76"),
    CORRECT_PAGE_TITLE("Fallout 76 | Xbox"),
    UNCORRECT_PAGE_TITLE("INCORECT_PAGE");

    private String info;

    GameInfo(String info){this.info = info;}

    public String getInfo(){return info;}
}
