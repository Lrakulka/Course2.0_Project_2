package com.homework.parts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Symbol {
    public static void main(String... s) throws IOException {
	Path start = Paths.get("/media/asd/Work");
	int maxDepth = 5;
	try (Stream<Path> stream = Files.walk(start, maxDepth)) {
	    String joined = stream
	        .map(String::valueOf)
	        .filter(path -> path.endsWith(".js"))
	        .sorted()
	        .collect(Collectors.joining("; "));
	    System.out.println("walk(): " + joined);
	}
    }
}
