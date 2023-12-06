package org.ensaj.voiture.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ensaj.voiture.Client;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client", insertable = false, updatable = false)
    private Client client;

}
