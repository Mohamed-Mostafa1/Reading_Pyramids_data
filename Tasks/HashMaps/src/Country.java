public class Country{
    private String name, continent;
    private int id;

    public Country(int id, String name, String continent) {
        this.name = name;
        this.continent = continent;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}