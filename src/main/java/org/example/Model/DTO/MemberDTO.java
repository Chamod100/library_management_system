package org.example.Model.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberDTO {
    private String memberId;
    private String Name;
    private String City;
    private String Dob;
    private String Contact;
    private String Email;

}
