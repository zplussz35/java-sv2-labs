package interfacedefaultmethods.longword;

import java.nio.file.Paths;
import java.util.List;

public class LongWord implements FileOperations {

    @Override
    public String getLongWord() {
        List<String> input = readFromFile(Paths.get("src/test/resources/longword.txt"));
        StringBuilder sb = new StringBuilder(input.get(0));
        for (int i = 1; i < input.size(); i++) {
            sb.append(input.get(i).substring(input.size() - 2));
        }
        return sb.toString();
    }
}
