import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CountryCSVDAO {
    List<Country> countriesList;

    public CountryCSVDAO() {
        this.countriesList = new ArrayList<>();
    }

    public List<Country> readCountriesFromCSV(String fileName) {
        // reading lines from file and saving them in list
        File countryFile = new File(fileName);
        List<String> lines = new ArrayList<>();
        String[] fields = {};
        try {
            lines = Files.readAllLines(countryFile.toPath());
        } catch (Exception e) {
            System.out.println("There is a problem happened." + e);
        }

        // extract all pyramids info and save them in a list
        for (int lineIdx = 0; lineIdx < lines.size(); lineIdx++) {
            String line = lines.get(lineIdx);
            fields = line.split(",");

            for (int fieldIndx = 0; fieldIndx < fields.length; fieldIndx++) {
                fields[fieldIndx] = fields[fieldIndx].trim();
            }
        }
        countriesList.add(createCountry(fields));
        return this.countriesList;
    }

    public Country createCountry(String[]metadata){
        Country country = new Country(Integer.parseInt(metadata[0]), metadata[1], metadata[2]);
        countriesList.add(country);
        return country;
    }
}
