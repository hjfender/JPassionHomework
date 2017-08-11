package com.jpassion.dp;

// TODO (Homework): You want to simulate file directory structure
// using Composite pattern.  The file system has
// root directory, which has two sub-directories, one
// of which has 2 files.

// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create "Node" abstract class (provided), which has "print Tree()"
//    abstract method
// 2. Add "File" class
// 3. Add "Directory" class

// Result of running this application results in something like following
//
//Directory: root
//Directory: root-child-1
// File content: Contents of file1
// File content: Contents of file2
//Directory: root-child-2


public class Client {
	   public static void main(String[] args) {
	   
	      Directory rootDirectory = new Directory("root");

	      Directory childDirectory1 = new Directory("root-child-1");
	      Directory childDirectory2 = new Directory("root-child-2");

	      Directory childDirectory2Child1 = new Directory("root-child-1-child1");

	      File file1 = new File("file1", "Contents of file1");
	      File file2 = new File("file1", "Contents of file2");

	      rootDirectory.add(childDirectory1);
	      rootDirectory.add(childDirectory2);

	      childDirectory1.add(file1);
	      childDirectory1.add(file2);
	      
	      rootDirectory.printTree();
	   }
	}
