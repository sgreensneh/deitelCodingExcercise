package chapterEight;

public enum GeoPoliticalZone {
    NORTH_CENTRAL(new String[]  {"Benue", "Fct", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTH_EAST(new String[] {"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba","Yobe"}),
    NORTH_WEST(new String[] {"Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTH_EAST(new String[] {"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH(new String[] {"Akwa-ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST(new String[] {"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"});

    private String[] state;



   GeoPoliticalZone(String[] state){
        this.state = state;
//       System.out.println(Arrays.toString(state));
    }

    public String[] getState() {

        return state;
    }

    public void setState(String[] state) {

        this.state = state;
    }

    public static GeoPoliticalZone findZoneWithState(String state){
        GeoPoliticalZone zoneName = null;
        for (GeoPoliticalZone geoPoliticalZone : GeoPoliticalZone.values()){

            for (String eachStateInZones: geoPoliticalZone.getState()) {
                if(state.equalsIgnoreCase(eachStateInZones)){
                    System.out.println(geoPoliticalZone);
                    zoneName = geoPoliticalZone;
                }

            }
        }

        return zoneName;

    }
}
