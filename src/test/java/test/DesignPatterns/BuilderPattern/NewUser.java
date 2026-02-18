package test.DesignPatterns.BuilderPattern;
import lombok.Builder;
import lombok.Data;

@Data
@Builder // Lombok @Builder internally generates Builder Pattern code at compile time.
class NewUser {
    private String name;
    private String email;
    private String address;
    private String phone;
}


/*
Now Lombok automatically generates:
Getters
Setters
toString()
equals()
hashCode()
Builder class
* */