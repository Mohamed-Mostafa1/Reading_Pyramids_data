import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("D:\\ITI\\Java and UML\\pyramids.csv");

        // printing all the pyramids
        int i = 0;
        for(Pyramid p:pyramids){
            System.out.println("#" + (i++) + p);
        }
    }
}
