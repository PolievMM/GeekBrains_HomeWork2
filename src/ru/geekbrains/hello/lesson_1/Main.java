package ru.geekbrains.hello.lesson_1;

public class Main {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int c = 15;
		int d = 25;
		Test.method();
		System.out.println(add(a,b));
		System.out.println(add(c,d));



	}
	private static int add(int firstValue, int secongValue) {
		return firstValue + secongValue;
	}

}
