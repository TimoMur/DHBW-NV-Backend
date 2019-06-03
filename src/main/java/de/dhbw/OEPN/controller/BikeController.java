package de.dhbw.OEPN.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import de.dhbw.OEPN.model.Coordinates;
import de.dhbw.OEPN.model.TypeRequest;

@RestController
@CrossOrigin
public class BikeController {

	@Value("${token}")
	private String token;
	
	@GetMapping("/data")
	public List<Coordinates> data() {

		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
				"https://api.deutschebahn.com/flinkster-api-ng/v1/areas?lat=48.782595&lon=9.167320&providernetwork=3&radius=12"))
				.header("Authorization", "Bearer " + token).build();
		HttpResponse<String> response = null;

		try {
			response = client.send(request, BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Gson gson = new Gson();

		String data = response.body();

		TypeRequest typeRequest = gson.fromJson(data, TypeRequest.class);

		return typeRequest.getItems().parallelStream().map(i -> {
			List<Double> coo = i.getGeometry().getPosition().getCoordinates();
			
			Coordinates c = new Coordinates();
			c.setLatitude(coo.get(1));
			c.setLongitude(coo.get(0));
			
			return c;
			
		}).collect(Collectors.toList());
	}

}
