import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static Map<Integer, Optional<City>> getCountryHighestPopulationCity(List<City> cities){
        return cities.stream().collect(Collectors.groupingBy(City::getCountryID,Collectors.maxBy(Comparator.comparingInt(City::getPopulation))));
    }
    public static Map<String,Optional<City>> getContinentHighestPopulationCity(List<City> cities){
        return cities.stream().collect(Collectors.groupingBy(City::getContinent,Collectors.maxBy(Comparator.comparingInt(City::getPopulation))));
    }
    public static Optional<City> getHighestPopulationCapital (List<City> cities){
        return cities.stream().filter(City::getCapital).max(Comparator.comparingInt(City::getPopulation));
    }
}
