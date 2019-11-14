package composition;

public class Computer {

	private Processor processor;
	private Memory memory;
	private SoundCard brand;
	
	public Computer(Processor processor, Memory memory) {
		this.processor = processor;
		this.memory = memory;
	}
	
	public void setSoundCard(SoundCard brand) {
		this.brand = brand;
	}
	
	public Processor getProcessor() {
		return processor;
	}
	
	public Memory getMemory() {
		return memory;
	}
	
	public SoundCard getSoundCard() {
		return brand;
	}
	
	@Override
	public String toString() {
		return "Computer {" + "Processor = " + processor + "\nMemory = " + memory + "\nSoundCard = " + brand + "}";
	}
	
}
