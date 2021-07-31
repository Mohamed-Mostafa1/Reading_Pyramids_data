public class City{
    private String name, continent;
    private int city_id, country_id, surface_area, population;
    private boolean capital;

    public City(int city_id, int country_id, String name, int surface_area, int population, String continent, boolean capital) {
        this.city_id = city_id;
        this.country_id = country_id;
        this.name = name;
        this.continent = continent;
        this.surface_area = surface_area;
        this.population = population;
        this.capital = capital;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getSurface_area() {
        return surface_area;
    }

    public void setSurface_area(int surface_area) {
        this.surface_area = surface_area;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCountryID() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public boolean getCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }
}