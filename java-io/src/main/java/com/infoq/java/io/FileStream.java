package com.infoq.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Stream的使用.
 * 简单来说, 流是一个连续的字节的序列. 输入流用来读取这个序列; 输出流则构建这个序列.
 * InputStream和OutputStream所操纵的基本单元就是字节, 每次读取和写入单个字节或是字节数组.
 * 
 * @author 	Lian
 * @date	2016年4月26日
 * @since	1.0	
 */
public class FileStream {

	public static String ROOT_PATH = System.getProperty("user.dir") + "/src/main/resources/";

	public static void fileInputStreamRead(String filename) throws IOException {
		File file = new File(ROOT_PATH + filename);
		InputStream input = new FileInputStream(file);
		int b = 0;
		while ((b = input.read()) != -1) {
			System.out.println(b);
		}
	}

	public static void fileOutputWrite(String filename) throws IOException {
		File file = new File(ROOT_PATH + filename);
		OutputStream out = new FileOutputStream(file);
		for (int i = 80; i < 91; i++) {
			out.write(i);
		}

		String str = "廉新忠";
		out.write(str.getBytes());
	}

	public static void main(String[] args) throws IOException {
		fileInputStreamRead("FileInputStreamTest");

		fileOutputWrite("FileOutputStreamTest");
	}
}
