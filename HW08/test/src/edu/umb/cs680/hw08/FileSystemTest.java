package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;


class FileSystemTest {

	private static LocalDateTime d1=LocalDateTime.now();
	
	private String[] dirToStringArray(Directory d) {
		String[] dirInfo = {
				null,d.getName(), Integer.toString(d.getSize()),d.getDateTime().toString()};
						
		return dirInfo;
	}

	@Test
	public void fileEqualityTest() {
		FileSystem obj1=FileSystem.getFileSystem();
		FileSystem obj2=FileSystem.getFileSystem();
		assertEquals(obj1,obj2);
	}
	
	@Test
	public void testRootdirectory() {
		String[] expected= {null,"root","0",d1.toString()};
		Directory root=new Directory(null,"root",0,d1);
		FileSystem.getFileSystem().appendRootDir(root);
		Directory actual_directory=FileSystem.getFileSystem().getRootDirs().get(0);
		String[] actual=dirToStringArray(actual_directory);
		assertArrayEquals(expected,actual);
	}

}
