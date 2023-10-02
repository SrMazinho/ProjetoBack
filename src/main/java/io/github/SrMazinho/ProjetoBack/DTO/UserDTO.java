package io.github.SrMazinho.ProjetoBack.DTO;

public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;

    public UserDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }


}
