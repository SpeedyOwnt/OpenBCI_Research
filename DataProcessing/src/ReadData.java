import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import data_model.DataHold;

/**
 * 
 * @author Nicholas
 * @version 1.0
 * @since 9/25/17
 */
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
				if (i != 0) {
					dataList.add(data);
				}
				data = new DataHold(label.toString());
				label++;

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
		}
		System.out.println(dataList.get(0).toString());
	}

	/**
	 * 
	 * @return StringBuilder form of data parsed from data file
	 */
	public static StringBuilder readFile() {
		StringBuilder fileData = new StringBuilder();
		try {
			String currentDirectory = new File("").getAbsolutePath() + "\\dataFiles\\";
			currentDirectory += chooseFile(currentDirectory);
			BufferedReader inputBuffer = new BufferedReader(new FileReader(currentDirectory));
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

	/**
	 * 
	 * @param currDir
	 * @return The string name of the file to read data from.
	 */
	public static String chooseFile(String currDir) {
		Scanner kbd = new Scanner(System.in);
		File folder = new File(currDir);
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> fileNames = new ArrayList<String>();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				fileNames.add(listOfFiles[i].getName());
				System.out.println(i + ". " + listOfFiles[i].getName());
			}
		}
		System.out.print("Enter number corresponding to file to run: ");
		int chosen = kbd.nextInt();
		kbd.close();
		return fileNames.get(chosen);
	}
}
