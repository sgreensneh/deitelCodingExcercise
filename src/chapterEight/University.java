package chapterEight;

public enum University {
    UNILAG("University of Lagos", "Lagos"),
    UNIPORT("University of port Harcout", "Rivers"),
    LASU("Lagos state university", "Lagos");

    private String fullName;
    private  String state;

    University(String fullName, String state){
        this.fullName = fullName;
        this.state = state;

//        System.out.println("i am creating " + fullName + " " + this.name());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
