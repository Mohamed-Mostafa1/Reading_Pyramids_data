import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CityCSVDAO {
    List<City> citiesList;

    public CityCSVDAO() {
        this.citiesList = new ArrayList<>();
    }

    public List<City> readCitiesFromCSV(String fileName) {
        // reading lines from file and saving them in list
        File cityFile = new File(fileName);
        List<String> lines = new ArrayList<>();
        String[] fields = {};
        try {
            lines = Files.readAllLines(cityFile.toPath());
        } catch (Exception e) {
            System.out.println("There is a problem happened." + e);
        }

        // extract all cities info and save them in a list
        for (int lineIdx = 0; lineIdx < lines.size(); lineIdx++) {
            String line = lines.get(lineIdx);
            fields = line.split(",");

            for (int fieldIndx = 0; fieldIndx < fields.length; fieldIndx++) {
                fields[fieldIndx] = fields[fieldIndx].trim();
            }
        }
        citiesList.add(createCity(fields));
        return this.citiesList;
    }

    public City createCity(String[]metadata){
        City city = new City(Integer.parseInt(metadata[0]), Integer.parseInt(metadata[1]), metadata[2], Integer.parseInt(metadata[3]), Integer.parseInt(metadata[4]), metadata[5], Boolean.getBoolean(metadata[6]));
        citiesList.add(city);
        return city;
    }
}
