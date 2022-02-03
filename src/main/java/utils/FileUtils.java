package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.CustomerSummaries;
import model.Taps;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FileUtils {

    public Taps mappingDataFromInputFile(String filePath) {
        Taps taps = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = FileUtils.class.getResourceAsStream(filePath);
            taps = mapper.readValue(is, Taps.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return taps;
    }

    public void printResultIntoFile(List<CustomerSummaries> customerSummaries, String outputFileName) {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(outputFileName);
        try {
            mapper.writeValue(file, customerSummaries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
