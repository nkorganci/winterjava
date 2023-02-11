package day01vairables.day28exceptions_41;

public class TestInvalidEmailIdCheckedException {
    public static void main(String[] args) {

        try {
            validateEmailId("abc@gmail.com");
        } catch (InvalidEmailIdCheckedException e) {

            System.out.println(e.getMessage());
        }

    }
    public static void validateEmailId(String emailId) throws InvalidEmailIdCheckedException {

        if(emailId.contains("@gmail.com") || emailId.contains("@yahoo.com")) {
            System.out.println(emailId);
        }else {
            throw new InvalidEmailIdCheckedException("Email id is not valid");
        }




    }
}
