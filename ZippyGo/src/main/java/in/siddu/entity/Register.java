package in.siddu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Register {

	@Id
	private Integer id;
}
