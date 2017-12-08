package com.spring.integration.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class BufferedReaderFileIterator implements Iterator<String> {

	private File file;
	private BufferedReader bufferedReader;
	private String line;
	private String commentPrefix = ",";

	public BufferedReaderFileIterator(File file2) throws IOException {
		System.out.println("Inside Buffer Reader");
		this.file = file2;
		this.bufferedReader = new BufferedReader(new FileReader(file2));
		readNextLine();
	}

	@Override
	public boolean hasNext() {
		return line != null;
	}

	@Override
	public String next() {
		try {
			String res = this.line;
			readNextLine();
			return res;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	void readNextLine() throws IOException {
		do {
			line = bufferedReader.readLine();
			//System.out.println(line.toString());
		} while (line != null);

		if (line == null) {
			close();
		}
	}

	void close() throws IOException {
		bufferedReader.close();
		file.delete();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
