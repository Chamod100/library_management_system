package org.example.Model.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class BookDTO {

    @Id
    private String bookId;
    private String isbm;
    private String rackNo;
    private String Writer;
    private boolean price;
    private String category;
}
