package lab8.compulsory;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class ReadData{
    public static void main(String[] args) {
        readDataLineByLine("D:\\Stef\\Documents\\faculta\\sem 4\\pa\\lab8\\src\\main\\resources\\albumlist.csv");
    }
    public static void readDataLineByLine(String file)
    {
        int contor = 1;

        try {

            FileReader filereader = new FileReader(file);

            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + " " + contor + "\t");
                    contor++;
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}