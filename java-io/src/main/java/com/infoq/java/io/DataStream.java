package com.infoq.java.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 如果想读取或输出Java的基本数据类型，可以使用DataInputStream和DataOutputStream
 * 它们所提供的类似readFloat和writeDouble这样的方法，会让处理基本数据类型变得很简单
 * 
 * @TODO 结果不理想
 * 
 * @author 	Lian
 * @date	2016年4月26日
 * @since	1.0	
 */
public class DataStream {
	public static String ROOT_PATH = System.getProperty("user.dir") + "/src/main/resources/";

	public static void dataStreamRead(String filename) throws FileNotFoundException {
		DataInputStream dis = new DataInputStream(new FileInputStream(new File(ROOT_PATH)));

	}

	public static void dataStreamWrite(String filename) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File(ROOT_PATH + filename)));

		for (int i = 0; i < 10; i++) {
			dos.writeInt(i);
		}

		dos.writeBoolean(true);

		dos.writeUTF("廉新忠");

		dos.writeDouble(4.5D);
	}

	public static void main(String[] args) throws IOException {
		dataStreamWrite("DataOutputStreamTest");
	}
}
