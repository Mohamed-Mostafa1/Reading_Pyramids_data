import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PyramidCSVDAO {
    List<Pyramid> pyramidsList;

    public PyramidCSVDAO() {
        this.pyramidsList = new ArrayList<>();
    }

    public List<Pyramid> readPyramidsFromCSV(String fileName) {
        // reading lines from file and saving them in list
        File pyramidFile = new File(fileName);
        List<String> lines = new ArrayList<>();
        String[] fields = {};
        try {
            lines = Files.readAllLines(pyramidFile.toPath());
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
        pyramidsList.add(createPyramid(fields));
        return this.pyramidsList;
    }

        public Pyramid createPyramid (String[]metadata){
            Pyramid pyramid = new Pyramid(metadata[0], metadata[2], metadata[4], Double.parseDouble(metadata[7]));
            pyramidsList.add(pyramid);
            return pyramid;
        }
}
