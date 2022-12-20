package a01codingpractice.hackerrank;

public class MethodOverriding {

}
class Sports{
    String getName(){
        return  "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports{

    @Override
    String getName() {
        return super.getName();
    }

    public static void main(String[] args) {

        Sports obj = new Sports();
    }

}
