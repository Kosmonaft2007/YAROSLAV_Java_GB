package src.seminars.Kata.Block_2;

public class Ex_2_3_11 {
    private final String secret; //секретики
    private final String news; //новости
    private final String experience; //опыт
    private final String gossip; //сплетни

    public Ex_2_3_11(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }

    private String getSecret() {
        return secret;
    }

    public String getNews() {
        return news;
    }

    protected String getExperience() {
        return experience;
    }

    String getGossip() {
        return gossip;
    }
}
