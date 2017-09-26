import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReadData {
	public static void main(String[] args) {
		String unParsedData = readFile().toString();
		// System.out.println(unParsedData.substring(0,
		// unParsedData.indexOf("0,")));
		unParsedData = unParsedData.replace(unParsedData.substring(0, unParsedData.indexOf("0,")), "");
		String[] splitData = unParsedData.split(",");

		ArrayList<DataHold> dataList = new ArrayList<DataHold>();
		Integer i = 0;
		Integer label = 0;
		// System.out.println(splitData[12]);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
		DataHold data = null;
		for (; i < splitData.length; i += 13) {

			if (Integer.parseInt(splitData[i]) == 0) {
				// System.out.println(splitData[i]);
				data = new DataHold(label.toString());
				label++;
				if (i != 0) {
					dataList.add(data);
				}
			}
			if (i + 12 <= splitData.length) {
				data.getSampleIndex().add(Integer.parseInt(splitData[i]));
				data.getNode1().add(Double.parseDouble(splitData[i + 1]));
				data.getNode2().add(Double.parseDouble(splitData[i + 2]));
				data.getNode3().add(Double.parseDouble(splitData[i + 3]));
				data.getNode4().add(Double.parseDouble(splitData[i + 4]));
				data.getNode5().add(Double.parseDouble(splitData[i + 5]));
				data.getNode6().add(Double.parseDouble(splitData[i + 6]));
				data.getNode7().add(Double.parseDouble(splitData[i + 7]));
				data.getNode8().add(Double.parseDouble(splitData[i + 8]));

				data.getAccelAuxData1().add(Double.parseDouble(splitData[i + 9]));
				data.getAccelAuxData2().add(Double.parseDouble(splitData[i + 10]));
				data.getAccelAuxData3().add(Double.parseDouble(splitData[i + 11]));

				data.getTime().add(LocalTime.parse((splitData[i + 12]).trim(), formatter));
			}
			// System.out.println("End row");
		}
		System.out.println(dataList.size());
		for (DataHold a : dataList) {
			System.out.print(a.getSampleIndex().size() + " ");
		}
	}

	public static StringBuilder readFile() {
		StringBuilder fileData = new StringBuilder();
		try {
			// C:/Users/Nicholas/Documents/College/Senior/Fall 2017/COSC390
			// Research
			String fileName = "C:/Users/Nicholas/Documents/College/Senior/Fall 2017/COSC390 Research/OpenBCI-RAW-Wink_Test_2.txt";
			// "C:/Users/Nicholas/Documents/College/Senior/Fall 2017/COSC390
			// Research/OpenBCI-RAW-AdJu5_32_9_22.txt";
			BufferedReader inputBuffer = new BufferedReader(new FileReader(fileName));
			String input;
			while ((input = inputBuffer.readLine()) != null) {
				fileData.append(input.trim());
				fileData.append(",");
				// System.out.println(input);
			}
			inputBuffer.close();
			System.out.println("finished reading");
			return fileData;

		} catch (Exception e) {
			System.out.println("File read error");
		}
		return null;
	}
}
