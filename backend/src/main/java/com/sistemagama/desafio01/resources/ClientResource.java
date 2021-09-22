package com.sistemagama.desafio01.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemagama.desafio01.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();

		list.add(new Client(20L, "Rosimeire Malu", "11661425402", 9762.8, Instant.parse("1970-06-25T07:27:00Z"), 3));
		list.add(new Client(21L, "Abadia Pudi ", "08243117288", 9860.1, Instant.parse("1942-11-27T04:11:00Z"), 0));
		list.add(new Client(22L, "Wilson Zara", "61874702225", 9762.5, Instant.parse("1973-03-25T20:21:00Z"), 0));
		list.add(new Client(23L, "Neida Katy", "54157076206", 1310.0, Instant.parse("1962-02-07T19:55:00Z"), 3));
		list.add(new Client(24L, "Kamilla Lila", "55522973420", 1652.0, Instant.parse("1989-01-20T05:53:00Z"), 4));
		list.add(new Client(25L, "Kiko Martins", "23778113453", 7451.0, Instant.parse("1986-09-23T18:37:00Z"), 1));
		list.add(new Client(26L, "Bela Jeronimo", "32400580570", 8016.8, Instant.parse("1996-08-01T23:36:00Z"), 0));
		list.add(new Client(27L, "Gabriela Bella", "43378848073", 4943.9, Instant.parse("1994-07-16T21:46:00Z"), 1));
		list.add(new Client(28L, "Venire Martins", "15618310503", 4602.8, Instant.parse("1995-09-11T06:52:00Z"), 4));
		list.add(new Client(29L, "Kleber Siemens", "88611274792", 3452.8, Instant.parse("1968-12-01T10:53:00Z"), 3));
		
		return ResponseEntity.ok().body(list);
		
	}

}
