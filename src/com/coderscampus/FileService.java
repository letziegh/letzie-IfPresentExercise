package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	public static void main(String[] args) throws IOException {
		
		String file1 = "InterpolWatchReport-Week1";
		String file2 = "InterpolWatchReport-Week2";
		String file3 = "InterpolWatchReport-Week3";
		
		BufferedReader reader1 = new BufferedReader(new FileReader(file1));
		BufferedReader reader2 = new BufferedReader(new FileReader(file2));
		BufferedReader reader3 = new BufferedReader(new FileReader(file3));
		

	}

}
