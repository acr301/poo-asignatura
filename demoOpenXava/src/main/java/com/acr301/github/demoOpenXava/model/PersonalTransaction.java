package com.acr301.github.demoOpenXava.model;

import java.math.*;
import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity // marca la clase como Entidad
@Getter @Setter // hace que todos los campos siguientes sean accesibles
public class PersonalTransaction {

    @Id
    @Column(length=6)
	int transactionId;

    @Column(length=10)
    @Required // error de validación si se deja en blanco
    BigDecimal transactionAmount;

    @Column(length=50)
    @Required
	String transactionDescription;
}
