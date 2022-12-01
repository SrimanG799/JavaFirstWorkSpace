package com.taxes;

public class StudFile {
	int id;
	String name;
	Files file;
	/**
	 * @param id
	 * @param name
	 * @param file
	 */
	public StudFile(int id, String name, Files file) {
		this.id = id;
		this.name = name;
		this.file = file;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Files getFile() {
		return file;
	}
	public void setFile(Files file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "StudFile [id=" + id + ", name=" + name + ", file=" + file + "]";
	}
	public static void main(String[] args)
	{
		StudFile f1=new StudFile(1,"sriman",new Files("C:\\Users\\srima\\OneDrive\\Pictures\\bird.png"));
		System.out.println(f1);
		
	}

}
