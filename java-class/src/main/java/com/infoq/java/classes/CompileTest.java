package com.infoq.java.classes;

import java.net.URI;

import javax.tools.JavaCompiler;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * 
 *
 * @author 	Lian
 * @time	2016年7月25日
 *
 */
public class CompileTest {

	public static void main(String[] args) {
		String source = "public class Main { public static void main(String[] args) {System.out.println(\"Hello World!\");} }";

		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		StringSourceJavaObject sourceObject = new CompileTest.StringSourceJavaObject("Main", source);
	}

	/**
	 * 
	 *
	 * @author 	Lian
	 * @time	2016年7月25日
	 *
	 */
	static class StringSourceJavaObject extends SimpleJavaFileObject {

		private String content = null;

		/**
		 * default constructor
		 * 
		 * @param uri
		 * @param kind
		 */
		protected StringSourceJavaObject(URI uri, Kind kind) {
			super(uri, kind);
		}

		/**
		 * custom constructor
		 * 
		 * @param name
		 * @param content
		 */
		public StringSourceJavaObject(String name, String content) {
			super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
			this.content = content;
		}

		public CharSequence getCharContent(boolean ignoreEncodingErrors) {
			return content;
		}
	}
}
