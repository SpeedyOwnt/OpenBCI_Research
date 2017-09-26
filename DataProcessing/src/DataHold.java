import java.time.LocalTime;
import java.util.ArrayList;

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
	private ArrayList<Double> AccelAuxData1;
	private ArrayList<Double> AccelAuxData2;
	private ArrayList<Double> AccelAuxData3;
	private ArrayList<LocalTime> time;

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
		AccelAuxData1 = new ArrayList<Double>();
		AccelAuxData2 = new ArrayList<Double>();
		AccelAuxData3 = new ArrayList<Double>();
		time = new ArrayList<LocalTime>();
	}

	@Override
	public String toString() {
		return "DataHold [label=" + label + ", sampleIndex=" + sampleIndex.toString() + ", node1=" + node1.toString()
				+ ", node2=" + node2.toString() + ", node3=" + node3.toString() + ", node4=" + node4.toString()
				+ ", node5=" + node5.toString() + ", node6=" + node6.toString() + ", node7=" + node7.toString()
				+ ", node8=" + node8.toString() + ", AccelAuxData1=" + AccelAuxData1.toString() + ", AccelAuxData2="
				+ AccelAuxData2.toString() + ", AccelAuxData3=" + AccelAuxData3.toString() + ", time=" + time.toString()
				+ "]";
	}

	public void printData() {
		System.out.println("Label: " + this.label);
		for (int i = 0; i < sampleIndex.size(); i++) {
			System.out.printf("%-5d %8.3f %8.3f %8.3f %8.3f %8.3f %8.3f %8.3f %8.3f %4.4f %4.4f %4.4f %s \n",
					sampleIndex.get(i), node1.get(i), node2.get(i), node3.get(i), node4.get(i), node5.get(i),
					node6.get(i), node7.get(i), node8.get(i), AccelAuxData1.get(i), AccelAuxData2.get(i),
					AccelAuxData3.get(i), time.get(i).toString());
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
		return AccelAuxData1;
	}

	public void setAccelAuxData1(ArrayList<Double> accelAuxData1) {
		AccelAuxData1 = accelAuxData1;
	}

	public ArrayList<Double> getAccelAuxData2() {
		return AccelAuxData2;
	}

	public void setAccelAuxData2(ArrayList<Double> accelAuxData2) {
		AccelAuxData2 = accelAuxData2;
	}

	public ArrayList<Double> getAccelAuxData3() {
		return AccelAuxData3;
	}

	public void setAccelAuxData3(ArrayList<Double> accelAuxData3) {
		AccelAuxData3 = accelAuxData3;
	}

	public ArrayList<LocalTime> getTime() {
		return time;
	}

	public void setTime(ArrayList<LocalTime> time) {
		this.time = time;
	}
}
