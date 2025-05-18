public class Validation {
    public void validateEmail() {
    Email user1 = new Email("ali@jmail.com", "aliali");
    Email user2 = new Email("hasanjmail.com", "aliali1122");
    Email user3 = new Email("mhmd111@mail.com", "alo");
    Email user4 = new Email("ali@jmail.com", "");
    Email user5 = new Email("", "jhg");
    Email user6 = new Email("", "");
    Email user7;
    Email[] emails = {user1, user2, user3, user4, user5, user6, user7};

    for(user : emails)

    {
        if (checkemail(user.username, user.passward) == false) {
            System.out.println("INVALID function:")
        }
    }
}}