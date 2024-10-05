package model;

public class Deputy {
    
    String deputyName, deputyNumber;

    public Deputy(String deputyName, String deputyNumber) {
        this.deputyName = deputyName;
        this.deputyNumber = deputyNumber;
    }

    public String getDeputyName() {
        return deputyName;
    }

    public void setDeputyName(String deputyName) {
        this.deputyName = deputyName;
    }

    public String getDeputyNumber() {
        return deputyNumber;
    }

    public void setDeputyNumber(String deputyNumber) {
        this.deputyNumber = deputyNumber;
    }

}