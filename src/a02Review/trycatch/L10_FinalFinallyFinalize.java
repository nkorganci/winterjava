package a02Review.trycatch;

import java.io.IOException;

public class L10_FinalFinallyFinalize {
}

class UserException extends Exception{
    public UserException(String str){
        super(str);
    }
}

class TT{
    static void validate(int age) throws UserException{
        if(age<18){
            throw new UserException("age not valid");
        }else {
            System.out.println("you can vote");
        }
    }

    public static void main(String[] args) {
        try{
            validate(13);
        }catch (UserException e){
            System.out.println("caught");
            System.out.println("Exception occured "+ e);
        }

        System.out.println("rest");
    }
}