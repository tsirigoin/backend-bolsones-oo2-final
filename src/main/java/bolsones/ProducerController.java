package bolsones;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ProducerController {

  private final ProducerRepository repository;

  ProducerController(ProducerRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/producers")
  List<Producer> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/producers")
  Producer newProducer(@RequestBody Producer newProducer) {
    return repository.save(newProducer);
  }

  // Single item
  
  @GetMapping("/producers/{id}")
  Producer one(@PathVariable Long id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new ProducerNotFoundException(id));
  }

  @PutMapping("/producers/{id}")
  Producer replaceProducer(@RequestBody Producer newProducer, @PathVariable Long id) {
    
    return repository.findById(id)
      .map(producer -> {
    	  producer.setName(newProducer.getName());
        return repository.save(producer);
      })
      .orElseGet(() -> {
        newProducer.setId(id);
        return repository.save(newProducer);
      });
  }

  @DeleteMapping("/producers/{id}")
  void deleteProducer(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
