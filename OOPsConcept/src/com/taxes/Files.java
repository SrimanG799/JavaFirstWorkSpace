package com.taxes;

import java.io.File;

public class Files {
	
	File file;
	/**
	 * @param name
	 * @param id
	 * @param string
	 */
	public Files( File file) {
		
		this.file = file;
	}
	public Files(String string) {
		// TODO Auto-generated constructor stub
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "Files [file=" + file + "]";
	}
	
}

	
	