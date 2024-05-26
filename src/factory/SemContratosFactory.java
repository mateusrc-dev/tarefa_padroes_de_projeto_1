package factory;

public class SemContratosFactory extends Factory {
	Car retrieveCar(String requestedGrade) {
		if ("A".equals(requestedGrade)) {
			return new GolCar(50, "cheio", "vermelho");
		} else {
			return new CivicCar(200, "cheio", "prata");
		}
	}
}
