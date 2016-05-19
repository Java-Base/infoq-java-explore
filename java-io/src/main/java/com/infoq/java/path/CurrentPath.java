package com.infoq.java.path;

import java.io.File;
import java.io.IOException;

/**
 * Java获取当前路径
 * @url: http://www.cnblogs.com/diyunpeng/archive/2011/06/06/2073567.html
 * 
 * @author 	Lian
 * @date	2016年4月26日
 * @since	1.0	
 */
public class CurrentPath {

	/**
	 * 利用System.getProperty()函数获取当前路径
	 *
	 * @return	current path
	 */
	public static String getPathUseSystem() {
		// user.dir指定了当前路径
		return System.getProperty("user.dir");
	}

	/**
	 * 使用File提供的函数获取当前路径
	 *
	 * @return	current path
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	public static String getPathUseFile() throws IOException {
		// 设置当前文件夹
		File dirctory = new File("");

		/**
		 * File.getCanonicalPath()和File.getAbsolutePath()大约只是对于new File(".")和new File("..")两种路径有所区别。
		 * # 对于getCanonicalPath()函数，“."就表示当前的文件夹，而”..“则表示当前文件夹的上一级文件夹
		 * # 对于getAbsolutePath()函数，则不管”.”、“..”，返回当前的路径加上你在new File()时设定的路径
		 * # 至于getPath()函数，得到的只是你在new File()时设定的路径
		 */

		// 获取标准路径
		String canonicalPath = dirctory.getCanonicalPath();
		// 获取绝对路径
		String absolutePath = dirctory.getAbsolutePath();

		return absolutePath;
	}

	public static void main(String[] args) throws IOException {
		String path1 = getPathUseSystem();
		System.out.println("user.dir -- " + path1);

		String path2 = getPathUseFile();
		System.out.println("file path -- " + path2);
	}
}
