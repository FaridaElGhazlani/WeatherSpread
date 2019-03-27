import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.event.ListDataListener;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().process();

	}

	private void process() {
		List<MeteoDuJour> meteo = readFile();
		Collections.sort(meteo,new BySpreadComparator());
		System.out.println(meteo.get(0).getJour());
	}

	public List<MeteoDuJour> readFile() {
		List<MeteoDuJour> listeMeteoDuJour = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\Users\\Thierno\\eclipse-workspace\\WeatherSpread\\src\\main\\resources\\weather.dat"))) {
			String ligne = null;
			while ((ligne = reader.readLine()) != null) {
				// LOGGER.info(ligne);
				// listeMeteoDuJour.add(ligne);
				ligne = ligne.trim().replace("*", "");
				String[] splitLigne = ligne.split(" +");
				if (splitLigne[0].isEmpty() || splitLigne[0].contains("Dy") || splitLigne[0].contains("mo")) {
					LOGGER.info("Contenu non valide");
				} else {
					MeteoDuJour meteoDuJour = new MeteoDuJour(Integer.parseInt(splitLigne[0]),Integer.parseInt(splitLigne[1]),Integer.parseInt(splitLigne[2]));
					listeMeteoDuJour.add(meteoDuJour);
					//LOGGER.info(Arrays.toString(splitLigne));
				}
			}
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "je n'ai pas réussi à lire le fichier", e);
		}
		LOGGER.info(listeMeteoDuJour.toString());
		return listeMeteoDuJour;
	}

}
