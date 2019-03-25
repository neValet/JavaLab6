package ua.lviv.iot.gym.managers;

import ua.lviv.iot.gym.models.Simulators;

import java.io.*;
import java.util.List;

public class TrainerWriter {

//    private File outputFile;
//    public TrainerWriter(final String fileName) {
//        outputFile = new File("./target/" + fileName + ".csv");
//    }

    public final void writeToFile(final List<Simulators> simulators)
            throws IOException {
        File file = new File("Simulators.csv");

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufferedWriter = new BufferedWriter(osw)) {

            simulators.stream().forEach(simulator -> {
                try {
                    bufferedWriter.write(simulator.getHeaders());
                    bufferedWriter.newLine();
                    bufferedWriter.write(simulator.toCSV());
                    bufferedWriter.newLine();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });
        } finally {
            System.out.println(" ");
        }
    }
}
