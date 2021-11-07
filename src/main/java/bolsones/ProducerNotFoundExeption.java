package bolsones;

class ProducerNotFoundException extends RuntimeException {

	ProducerNotFoundException(Long id) {
		super("Could not find producer " + id);
	}
}
