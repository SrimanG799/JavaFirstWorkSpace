package com.objectss;

public class Features implements Cloneable {
	String camera;
	String battery;
	String processor;
	public Features(String camera, String battery, String processor) {
		super();
		this.camera = camera;
		this.battery = battery;
		this.processor = processor;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Features [camera=" + camera + ", battery=" + battery + ", processor=" + processor + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
