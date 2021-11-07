package bolsones;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Producer {

  private @Id @GeneratedValue Long id;
  private String name;

  Producer() {}

  Producer(String name) {
    this.name = name;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Producer))
      return false;
    Producer producer = (Producer) o;
    return Objects.equals(this.id, producer.id) && Objects.equals(this.name, producer.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name);
  }

  @Override
  public String toString() {
    return super.toString() + "{" + "id=" + this.id + ", name='" + this.name + '\'' + '}';
  }
}