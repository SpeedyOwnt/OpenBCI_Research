package data_model;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Nicholas
 * @version 1.0
 * @since 9/25/17
 */
public class DataHold {

	String label;
	private ArrayList<Integer> sampleIndex;
	private ArrayList<Double> node1;
	private ArrayList<Double> node2;
	private ArrayList<Double> node3;
	private ArrayList<Double> node4;
	private ArrayList<Double> node5;
	private ArrayList<Double> node6;
	private ArrayList<Double> node7;
	private ArrayList<Double> node8;
	private ArrayList<Double> accelAuxData1;
	private ArrayList<Double> accelAuxData2;
	private ArrayList<Double> accelAuxData3;
	private ArrayList<LocalTime> time;

	/**
	 * Constructor for DataHold object
	 * 
	 * @param label
	 */
	public DataHold(String label) {
		this.label = label;
		sampleIndex = new ArrayList<Integer>();
		node1 = new ArrayList<Double>();
		node2 = new ArrayList<Double>();
		node3 = new ArrayList<Double>();
		node4 = new ArrayList<Double>();
		node5 = new ArrayList<Double>();
		node6 = new ArrayList<Double>();
		node7 = new ArrayList<Double>();
		node8 = new ArrayList<Double>();
		accelAuxData1 = new ArrayList<Double>();
		accelAuxData2 = new ArrayList<Double>();
		accelAuxData3 = new ArrayList<Double>();
		time = new ArrayList<LocalTime>();
	}

	/**
	 * toString method for DataHoldMethod
	 * 
	 * @return string for of DataHold object
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.label);
		str.append("\n");
		for (int i = 0; i < this.sampleIndex.size(); i++) {
			str.append(this.sampleIndex.get(i));
			str.append(", ");
			str.append(this.node1.get(i));
			str.append(",");
			str.append(this.node2.get(i));
			str.append(",");
			str.append(this.node3.get(i));
			str.append(",");
			str.append(this.node4.get(i));
			str.append(",");
			str.append(this.node5.get(i));
			str.append(",");
			str.append(this.node6.get(i));
			str.append(",");
			str.append(this.node7.get(i));
			str.append(",");
			str.append(this.node8.get(i));
			str.append(",");
			str.append(this.accelAuxData1.get(i));
			str.append(",");
			str.append(this.accelAuxData2.get(i));
			str.append(",");
			str.append(this.accelAuxData3.get(i));
			str.append(",");
			str.append(this.time.get(i));
			str.append("\n");

		}
		return str.toString();
	}

	/**
	 * prints out the DataHold object in formatted manner
	 */
	public void printData() {
		System.out.println("Label: " + this.label);
		for (int i = 0; i < sampleIndex.size(); i++) {
			System.out.printf("%-5d %8.3f %8.3f %8.3f %8.3f %8.3f %8.3f %8.3f %8.3f %4.4f %4.4f %4.4f %s \n",
					sampleIndex.get(i), node1.get(i), node2.get(i), node3.get(i), node4.get(i), node5.get(i),
					node6.get(i), node7.get(i), node8.get(i), accelAuxData1.get(i), accelAuxData2.get(i),
					accelAuxData3.get(i), time.get(i).toString());
		}
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public ArrayList<Integer> getSampleIndex() {
		return sampleIndex;
	}

	public void setSampleIndex(ArrayList<Integer> sampleIndex) {
		this.sampleIndex = sampleIndex;
	}

	public ArrayList<Double> getNode1() {
		return node1;
	}

	public void setNode1(ArrayList<Double> node1) {
		this.node1 = node1;
	}

	public ArrayList<Double> getNode2() {
		return node2;
	}

	public void setNode2(ArrayList<Double> node2) {
		this.node2 = node2;
	}

	public ArrayList<Double> getNode3() {
		return node3;
	}

	public void setNode3(ArrayList<Double> node3) {
		this.node3 = node3;
	}

	public ArrayList<Double> getNode4() {
		return node4;
	}

	public void setNode4(ArrayList<Double> node4) {
		this.node4 = node4;
	}

	public ArrayList<Double> getNode5() {
		return node5;
	}

	public void setNode5(ArrayList<Double> node5) {
		this.node5 = node5;
	}

	public ArrayList<Double> getNode6() {
		return node6;
	}

	public void setNode6(ArrayList<Double> node6) {
		this.node6 = node6;
	}

	public ArrayList<Double> getNode7() {
		return node7;
	}

	public void setNode7(ArrayList<Double> node7) {
		this.node7 = node7;
	}

	public ArrayList<Double> getNode8() {
		return node8;
	}

	public void setNode8(ArrayList<Double> node8) {
		this.node8 = node8;
	}

	public ArrayList<Double> getAccelAuxData1() {
		return accelAuxData1;
	}

	public void setAccelAuxData1(ArrayList<Double> accelAuxData1) {
		this.accelAuxData1 = accelAuxData1;
	}

	public ArrayList<Double> getAccelAuxData2() {
		return accelAuxData2;
	}

	public void setAccelAuxData2(ArrayList<Double> accelAuxData2) {
		this.accelAuxData2 = accelAuxData2;
	}

	public ArrayList<Double> getAccelAuxData3() {
		return accelAuxData3;
	}

	public void setAccelAuxData3(ArrayList<Double> accelAuxData3) {
		this.accelAuxData3 = accelAuxData3;
	}

	public ArrayList<LocalTime> getTime() {
		return time;
	}

	public void setTime(ArrayList<LocalTime> time) {
		this.time = time;
	}

	public void sortBySampleIndex() {
		Sort(this.sampleIndex);
	}

	public void sortByNode1() {
		Sort(this.node1);
	}

	public void sortByNode2() {
		Sort(this.node2);
	}

	public void sortByNode3() {
		Sort(this.node3);
	}

	public void sortByNode4() {
		Sort(this.node4);
	}

	public void sortByNode5() {
		Sort(this.node5);
	}

	public void sortByNode6() {
		Sort(this.node6);
	}

	public void sortByNode7() {
		Sort(this.node7);
	}

	public void sortByNode8() {
		Sort(this.node8);
	}

	public void sortByAccelAuxData1() {
		Sort(this.accelAuxData1);
	}

	public void sortByAccelAuxData2() {
		Sort(this.accelAuxData2);
	}

	public void sortByAccelAuxData3() {
		Sort(this.accelAuxData3);
	}

	public void sortByTime() {
		sortBySampleIndex();
		// Sorting by the sample index also sorts the time in the original order
		// in which the entries were created
	}

	/**
	 * 
	 * @param list
	 *            Takes in a generic ArrayList and sorts all of the DataHold
	 *            ArrayLists dependent on the list past in
	 */
	private <T extends Comparable<T>> void Sort(ArrayList<T> list) {
		int swapIndex = 0;
		T smallest;
		boolean swap;
		System.out.println("List size: " + list.size());
		for (int i = 0; i < list.size() - 1; i++) {
			swap = false;
			smallest = list.get(i);
			swapIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (((smallest).compareTo((list.get(j)))) > 0) {
					swapIndex = j;
					smallest = list.get(j);
					swap = true;
				}
			}
			if (swap) {
				Collections.swap(this.sampleIndex, i, swapIndex);
				Collections.swap(this.node1, i, swapIndex);
				Collections.swap(this.node2, i, swapIndex);
				Collections.swap(this.node3, i, swapIndex);
				Collections.swap(this.node4, i, swapIndex);
				Collections.swap(this.node5, i, swapIndex);
				Collections.swap(this.node6, i, swapIndex);
				Collections.swap(this.node7, i, swapIndex);
				Collections.swap(this.node8, i, swapIndex);
				Collections.swap(this.accelAuxData1, i, swapIndex);
				Collections.swap(this.accelAuxData2, i, swapIndex);
				Collections.swap(this.accelAuxData3, i, swapIndex);
				Collections.swap(this.time, i, swapIndex);
			}
		}
	}
}
