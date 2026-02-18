package test.DesignPatterns.BuilderPattern;

public class User {

    private String name;
    private String email;
    private String address;
    private String phone;

    private User(Builder builder){
        this.name= builder.name;
        this.email=builder.email;
        this.address=builder.address;
        this.phone= builder.phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public  static class Builder{
        private String name;
        private String email;
        private String address;
        private String phone;

        public Builder setName(String name) {
            this.name = name;
            return  this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
