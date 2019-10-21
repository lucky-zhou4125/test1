package cn.itcast.git;

import org.junit.Test;

public class TestGit {

	@Test
	public void test1(){
		final String str = "abc";
		String replace = str.replace('a', 'b');

		//abc
		System.out.println("str = " + str);

		//str.hashCode() = 96354
		System.out.println("str.hashCode() = " + str.hashCode());

		//replace.hashCode() = 97315
		System.out.println("replace.hashCode() = " + replace.hashCode());
	}


	@Test
	public void test2(){
		StringBuilder str = new StringBuilder("abc");
		StringBuilder dd = str.append("dd");

		//str = abcdd
		System.out.println("str = " + str);;

		//str.hashCode() = 1567581361
		System.out.println("str.hashCode() = " + str.hashCode());

		//dd.hashCode() = 1567581361
		System.out.println("dd.hashCode() = " + dd.hashCode());

		//true
		System.out.println("str.equals(dd) = " + str.equals(dd));
	}
	

}
