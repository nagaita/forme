package com.example.nagaita.forme.apps.note

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NoteApplication

fun main(args: Array<String>) {
	runApplication<NoteApplication>(*args)
}
