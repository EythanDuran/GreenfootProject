import java.io.*;
import java.util.*;

public class RecordManager  
{
    private final int maxSize;
    private final String fileName;

    public RecordManager(int maxSize, String fileName)
    {
        this.maxSize = maxSize;
        this.fileName = fileName;
    }

    public void save(Record newRecord) {
        if (newRecord.getPlayer().equals("")){
            throw new RecordsException("Empty name not allowed");
        }

        List <Record> records =getRecords();
        records.add(newRecord);

        records.sort((o1, o2) -> o2.getScore() - o1.getScore());

        try (FileWriter fileWriter = new FileWriter(fileName);
        PrintWriter printWriter = new PrintWriter(fileWriter)) {
            int counter=0;

            for(Record record:records) {
                printWriter.append(record.getPlayer()).append(",").print(record.getScore() + System.lineSeparator());
                counter++;
                if(counter==maxSize){
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Record> getRecords() {
        List<Record> records = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] items = currentLine.split(",");

                records.add(new Record(items[0], Integer.parseInt(items[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}
