
		System.out.println(f1.exists() ? "exists" : "does not exist"); 
		
		System.out.println(f1.canWrite() ? "is writeable" : "is not writeable"); 
		
		System.out.println(f1.canRead() ? "is readable" : "is not readable"); 
		
		System.out.println("is " + (f1.isDirectory() ? "" : "not" + " a directory")); 
		
		System.out.println(f1.isFile() ? "is normal file" : "might be a named pipe"); 
		
		System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute"); 
		
		System.out.println("File last modified: " + f1.lastModified()); 
		
		System.out.println("File size: " + f1.length() + " Bytes"); 
	} 
}
