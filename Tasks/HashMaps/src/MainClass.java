import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        CityCSVDAO ciDAO = new CityCSVDAO();
        List<City> cities = ciDAO.readCitiesFromCSV("cities.csv");

        CountryCSVDAO coDAO = new CountryCSVDAO();
        List<Country> countries = coDAO.readCountriesFromCSV("countries.csv");
        cities.sort(Comparator.comparingInt(City::getPopulation));

        Map<Integer, List<City>> citiesAndCountries = new HashMap<>();
        Iterator<City> iterCity = cities.iterator();
        Iterator<Country> iterCountry = countries.iterator();
        while (iterCity.hasNext()){
            var cityName = iterCity.next();
            var countryID = iterCountry.next().getId();
            var cityCountryID = iterCity.next().getCountryID();
            List<City> relevantCountries = new ArrayList<>();
            if( countryID == cityCountryID){
                relevantCountries.add(cityName);
                }
            citiesAndCountries.put(countryID, relevantCountries);
            }
        citiesAndCountries.forEach((k,v)-> System.out.println(k + " " + v));
        //citiesAndCountries.forEach((k, v)->v.stream().max());
        }
}

