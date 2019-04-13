package com.example.projet;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Entreprise {

	//private static final Logger log = LoggerFactory.getLogger(this.class);

	public static void main(String[] args) {
		System.out.println("Hey");
		SpringApplication.run(Entreprise.class, args);
	}
	
	@Bean
	public CommandLineRunner command(RepertoireProjet repository) {
		return (args) -> {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date dateBegin = dateFormat.parse("2018-10-09");
			//log.info(dateBegin.toString());
			Date dateEnd = dateFormat.parse("2018-12-07");
			//log.info(dateEnd.toString());

			
			Technicien emp1 = new Technicien("2000", "Jean", "Baptiste", dateBegin.toString(), dateEnd.toString());
			//Technicien emp2 = new Technicien("2100", "Patrick", "Baptiste", dateBegin.toString(), dateEnd.toString());
			Cadre emp3 = new Cadre("3500", "Boss", "Hugo", dateBegin.toString(), dateEnd.toString(), null);
//			ArrayList<Employe> equipeP1 = new ArrayList<>();
//			equipeP1.add(emp1);
//			equipeP1.add(emp2);
			Projet p1 = new Projet("Projet1", emp3, emp1);
			emp3.setProjet(p1);
			emp1.setProjet(p1);
			//emp2.setProjet(p1);

			repository.save(p1);
			
		};
	}
	
}
