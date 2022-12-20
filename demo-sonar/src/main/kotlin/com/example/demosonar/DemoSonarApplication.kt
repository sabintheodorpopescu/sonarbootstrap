package com.example.demosonar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSonarApplication

fun main(args: Array<String>) {
	runApplication<DemoSonarApplication>(*args)

	print("Whatever");
	whatever(true)

}

fun whatever(flag: Boolean) {
	if (flag) {
		print("Super");
	} else if (!flag) {
		print ("Foarte Super")
	} else {

	}
}
